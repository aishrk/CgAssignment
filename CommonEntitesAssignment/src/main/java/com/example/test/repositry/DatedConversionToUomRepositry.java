package com.example.test.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.DatedConversionToUom;

@Repository
public interface DatedConversionToUomRepositry extends JpaRepository<DatedConversionToUom, Integer> {

}
