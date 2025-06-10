package com.ip.propertyservice.controller;


import com.ip.propertyservice.entity.Property;
import com.ip.propertyservice.service.PropertyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    private PropertyService propertyService;

    @PostMapping("/save")
    public ResponseEntity<Property> addProperty(Property property){

        return new ResponseEntity<Property>(propertyService.)
    }
}
