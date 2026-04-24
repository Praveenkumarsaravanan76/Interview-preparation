package com.jjcanteen.service;

import com.jjcanteen.model.Order;
import com.jjcanteen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public Order placeOrder(String foodName) {
        Order o = new Order();
        o.setFoodName(foodName);
        o.setStatus("ORDERED");
        return repo.save(o);
    }

    public Order markReady(Long id) {
        Order o = repo.findById(id).get();
        o.setStatus("READY");
        return repo.save(o);
    }

    public List<Order> getAll() {
        return repo.findAll();
    }
}