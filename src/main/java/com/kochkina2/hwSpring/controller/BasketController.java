package com.kochkina2.hwSpring.controller;

import com.kochkina2.hwSpring.Item;
import com.kochkina2.hwSpring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add (@RequestParam("id") List<Integer> ids){
        basketService.add(ids);
    }

    @GetMapping("/get")
    public Collection<Item> get (){
        return basketService.get();
    }
}
