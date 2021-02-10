package com.io.SBDataJPAORMPropsApp.repository;

import com.io.SBDataJPAORMPropsApp.entity.ResourceDtls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface ResourceDtlsRepo  extends JpaRepository<ResourceDtls, Serializable> {


}
