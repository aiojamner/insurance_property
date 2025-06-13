package com.ip.propertyservice.controller;


import com.ip.propertyservice.dto.PropertyRequestDTO;
import com.ip.propertyservice.dto.PropertyResponceDTO;
import com.ip.propertyservice.entity.Property;
import com.ip.propertyservice.service.PropertyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }


    @GetMapping()
    public ResponseEntity<List<PropertyResponceDTO>> getProperty(){
        return ResponseEntity.ok().body(propertyService.getProperty());
    }

    @PostMapping()
    public ResponseEntity<PropertyResponceDTO> createProperty(
            @Valid @RequestBody PropertyRequestDTO propertyRequestDTO){
        return ResponseEntity.ok(propertyService.createProperty(propertyRequestDTO));
    }

    @GetMapping("/{propertyName}")
    public ResponseEntity<PropertyResponceDTO> getPropertyByName(@PathVariable String propertyName){
        return ResponseEntity.ok().body(propertyService.getPropertyByName(propertyName));
    }

}
