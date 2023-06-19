package com.example.rest.controllers;

import com.example.rest.services.IsCategoryNameNotNumeralService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class IsCategoryNameNorNumeralController {

    private final IsCategoryNameNotNumeralService isCategoryNameNotNumeralService;

    @GetMapping("/{name}")
    public boolean contains(@PathVariable String name){
        return isCategoryNameNotNumeralService.isCategoryNameNotNumeral(name);
    }

}
