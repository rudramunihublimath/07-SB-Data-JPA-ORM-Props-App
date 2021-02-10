package com.io.SBDataJPAORMPropsApp.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name = "RESOURCE_DTLS")
public class ResourceDtls {
    @Id
    @Column(name = "RESOURCE_ID")
    //@GeneratedValue
    // Below is code for custom sequence generator in Oracle DB
    @SequenceGenerator(name = "req_seq",sequenceName = "resource_id_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "req_seq")
    private Integer resourceId;
    @Column(name = "RESOURCE_NAME")
    private String resourceName;
    @Column(name = "RESOURCE_SKILL")
    private String resourceSkill;
    @Column(name = "RESOURCE_EXPR")
    private String resourceExpr;


}
