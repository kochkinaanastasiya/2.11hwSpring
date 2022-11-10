package com.kochkina2.hwSpring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;

@Component
@SessionScope
public class BasketWithProducts {

    private final Collection<Item> items;

    public BasketWithProducts(Collection<Item> items) {
        this.items = new ArrayList<>();
    }

    public void add(Collection<Item>items){
        this.items.addAll(items);
    }

    public Collection<Item> get(){
        return new ArrayList<>(items);
    }
}
