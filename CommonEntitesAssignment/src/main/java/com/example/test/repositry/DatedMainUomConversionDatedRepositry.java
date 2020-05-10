package com.example.test.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.DatedMainUomConversionDated;

@Repository
public interface DatedMainUomConversionDatedRepositry extends JpaRepository<DatedMainUomConversionDated, Integer>{

}
