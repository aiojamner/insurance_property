package com.ip.propertyservice.repository;

import com.ip.propertyservice.dto.PropertyRequestDTO;
import com.ip.propertyservice.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PropertyRepo extends JpaRepository<Property, UUID> {

    public Optional<Property> findByPropertyName(String propertyName);

}
