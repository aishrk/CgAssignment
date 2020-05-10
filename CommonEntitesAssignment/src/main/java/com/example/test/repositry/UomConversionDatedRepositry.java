package com.example.test.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.UomConversionDated;

@Repository
public interface UomConversionDatedRepositry extends JpaRepository<UomConversionDated, Integer>{

}
