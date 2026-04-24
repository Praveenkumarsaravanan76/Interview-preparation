package com.jjcanteen.controller;

import com.jjcanteen.model.Food;
import com.jjcanteen.model.Order;
import com.jjcanteen.service.FoodService;
import com.jjcanteen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/foods/{category}")
    public List<Food> getFoods(@PathVariable String category) {
        return foodService.getByCategory(category);
    }

    @PostMapping("/order")
    public Order orderFood(@RequestParam String foodName) {
        return orderService.placeOrder(foodName);
    }

    @GetMapping("/orders")
    public List<Order> viewOrders() {
        return orderService.getAll();
    }
}