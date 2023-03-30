package com.sheikhweb.major.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private  int  ID;
    private  String SERVICE_NAME;
    private  String PLATFORM_TYPE;
    private  String SMODE;
    private  String PRICE_R;


}
