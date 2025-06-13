package com.ip.propertyservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PropertyRequestDTO {


    @NotBlank(message = "Property name should be required")
    @Size(max = 100, message = "Property name should not be more than 100")
    private String propertyName;

    @NotBlank(message = "Address should be required")
    private String address;

    @NotBlank(message = "Type should be required")
    private String type;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
