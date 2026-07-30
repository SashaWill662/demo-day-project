package com.example.PerfumePalace.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private final List<String> cart = new ArrayList<>();

    public void addItem(String item) {
        cart.add(item);
    }

    public List<String> getCart() {
        return cart;
    }

    public void clearCart() {
        cart.clear();
    }
}