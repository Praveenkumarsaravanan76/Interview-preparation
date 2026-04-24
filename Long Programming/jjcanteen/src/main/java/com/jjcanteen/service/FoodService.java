package com.jjcanteen.service;

import com.jjcanteen.model.Food;
import com.jjcanteen.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repo;

    public List<Food> getByCategory(String category) {
        return repo.findByCategory(category);
    }

    public Food addFood(Food food) {
        return repo.save(food);
    }
}