package com.ip.propertyservice.service;

import com.ip.propertyservice.dto.PropertyRequestDTO;
import com.ip.propertyservice.dto.PropertyResponceDTO;
import com.ip.propertyservice.entity.Property;

import java.util.List;

public interface PropertyService {



    public List<PropertyResponceDTO> getProperty();

    public PropertyResponceDTO createProperty(PropertyRequestDTO propertyRequestDTO);

    public PropertyResponceDTO getPropertyByName(String propertyName);
}
