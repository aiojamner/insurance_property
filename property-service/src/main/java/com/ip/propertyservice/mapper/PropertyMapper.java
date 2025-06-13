package com.ip.propertyservice.mapper;

import com.ip.propertyservice.dto.PropertyRequestDTO;
import com.ip.propertyservice.dto.PropertyResponceDTO;
import com.ip.propertyservice.entity.Property;

public class PropertyMapper {

    public static PropertyResponceDTO toDTO(Property property){
        PropertyResponceDTO propertyResponceDTO = new PropertyResponceDTO();
        propertyResponceDTO.setId(property.getId().toString());
        propertyResponceDTO.setPropertyName(property.getPropertyName());
        propertyResponceDTO.setAddress(property.getAddress());
        propertyResponceDTO.setType(property.getType());

        return propertyResponceDTO;
    }

    public static Property toModel(PropertyRequestDTO propertyRequestDTO){
        Property property = new Property();

        property.setAddress(propertyRequestDTO.getAddress());
        property.setPropertyName(propertyRequestDTO.getPropertyName());
        property.setType(propertyRequestDTO.getType());

        return property;
    }
}
