package com.parkauto.ui.controller;

import com.parkauto.ui.dto.LocationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class LocationController {

    @Autowired
    private RestTemplate restTemplate;

    private final String LOCATION_API_URL = "http://localhost:8080/api/locations"; // API Gateway URL

    /**
     * Affiche le formulaire pour créer une nouvelle location.
     */
    @GetMapping("/location-form")
    public String showLocationForm(Model model) {
        model.addAttribute("location", new LocationDTO());
        return "location-form"; // Page Thymeleaf "location-form.html"
    }

    /**
     * Reçoit les données du formulaire et les transmet au microservice via l'API Gateway.
     */
    @PostMapping("/locations")
    public String createLocation(@ModelAttribute("location") LocationDTO locationDTO, Model model) {
        try {
            restTemplate.postForObject(LOCATION_API_URL, locationDTO, LocationDTO.class);
            model.addAttribute("message", "La location a été créée avec succès !");
        } catch (Exception e) {
            model.addAttribute("error", "Une erreur s'est produite : " + e.getMessage());
        }
        return "confirmation1"; // Page de confirmation (similaire à celle des clients)
    }
}
