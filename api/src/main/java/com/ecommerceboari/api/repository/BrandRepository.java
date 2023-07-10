package com.ecommerceboari.api.repository;

import com.ecommerceboari.api.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brand, Long> {

    Brand findByName(String name);
}