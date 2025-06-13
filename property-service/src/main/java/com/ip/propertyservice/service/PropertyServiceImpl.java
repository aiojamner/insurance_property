package com.ip.propertyservice.service;


import com.ip.propertyservice.dto.PropertyRequestDTO;
import com.ip.propertyservice.dto.PropertyResponceDTO;
import com.ip.propertyservice.entity.Property;
import com.ip.propertyservice.mapper.PropertyMapper;
import com.ip.propertyservice.repository.PropertyRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    private PropertyRepo propertyRepo;

    public PropertyServiceImpl(PropertyRepo propertyRepo){
        this.propertyRepo = propertyRepo;
    }

    @Override
    public List<PropertyResponceDTO> getProperty(){

        return propertyRepo.findAll().stream().map(PropertyMapper::toDTO).toList();
    }

    @Override
    public PropertyResponceDTO createProperty(PropertyRequestDTO propertyRequestDTO) {
        return PropertyMapper.toDTO(propertyRepo.save(PropertyMapper.toModel(propertyRequestDTO)));
    }

    @Override
    public PropertyResponceDTO getPropertyByName(String propertyName) {
        Property pro = propertyRepo.findByPropertyName(propertyName).get();
        return null;
    }

}
