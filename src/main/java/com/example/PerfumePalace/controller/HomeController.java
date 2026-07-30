package com.example.PerfumePalace.controller;

import com.example.PerfumePalace.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final ProductRepository productRepository;

    public HomeController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "index";
    }

    @GetMapping("/mens")
    public String mens(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "mens";
    }

    @GetMapping("/womens")
    public String womens(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "womens";
    }

    @GetMapping("/unisex")
    public String unisex(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "unisex";
    }

    @GetMapping("/bestsellers")
    public String bestSellers(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "bestsellers";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }
    @GetMapping("/order-confirmation")
    public String confirmation(){

        return "order-confirmation";

    }
}

