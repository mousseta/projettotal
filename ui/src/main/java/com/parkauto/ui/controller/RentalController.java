// package com.parkauto.ui.controller;

// import com.parkauto.ui.dto.RentalDTO;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.client.RestTemplate;

// @Controller
// @RequestMapping("/rentals")
// public class RentalController {

//     @GetMapping("/create")
//     public String rentalForm(Model model) {
//         model.addAttribute("rental", new RentalDTO());
//         return "rental-form";
//     }

//     @PostMapping("/create")
//     public String createRental(@ModelAttribute RentalDTO rental) {
//         RestTemplate restTemplate = new RestTemplate();
//         restTemplate.postForObject("http://localhost:8080//api/locations/", rental, RentalDTO.class);
//         return "redirect:/";
//     }
// }
