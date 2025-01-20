package com.parkauto.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.parkauto.gateway.ui.dto.ClientDTO;

@Controller
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    private final String CLIENT_API_URL = "http://localhost:8080/clients"; // API Gateway URL

    @GetMapping("/client-form")
    public String showClientForm(Model model) {
        model.addAttribute("client", new ClientDTO());
        return "client-form";
    }

    @PostMapping("/clients")
    public String saveClient(@ModelAttribute("client") ClientDTO client) {
        // Appel à l'API Gateway pour enregistrer le client
        restTemplate.postForObject(CLIENT_API_URL, client, ClientDTO.class);
        return "redirect:/client-form";
    }
}
