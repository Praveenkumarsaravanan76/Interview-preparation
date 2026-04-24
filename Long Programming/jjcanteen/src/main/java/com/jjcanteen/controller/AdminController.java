package com.jjcanteen.controller;
import com.jjcanteen.model.Food;
import com.jjcanteen.model.Order;
import com.jjcanteen.service.FoodService;
import com.jjcanteen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private OrderService orderService;

    @PostMapping("/add-food")
    public Food addFood(@RequestBody Food food) {
        return foodService.addFood(food);
    }

    @PutMapping("/ready/{id}")
    public Order markReady(@PathVariable Long id) {
        return orderService.markReady(id);
    }
}