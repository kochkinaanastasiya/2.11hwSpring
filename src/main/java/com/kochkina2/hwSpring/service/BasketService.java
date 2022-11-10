package com.kochkina2.hwSpring.service;

import com.kochkina2.hwSpring.BasketWithProducts;
import com.kochkina2.hwSpring.Item;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BasketService {

    private final BasketWithProducts basketWithProducts;
    private Map<Integer, Item> items;

    public BasketService(BasketWithProducts basketWithProducts) {
        this.basketWithProducts = basketWithProducts;
    }

    @PostConstruct
    public void init(){
        items = Map.of(
                1, new Item(1, "Сыр", 300),
                2, new Item(1, "Хлеб", 50),
                3, new Item(1, "Сосиски", 500),
                4, new Item(1, "Йогурт", 100)
        );
    }

    public void add(List<Integer> ids){
        basketWithProducts.add(
                ids.stream()
                        .map(items::get)
                        .collect(Collectors.toList())
        );

    }
    public Collection<Item> get(){
        return basketWithProducts.get();

    }



}
