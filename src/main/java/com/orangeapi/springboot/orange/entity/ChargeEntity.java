package com.orangeapi.springboot.orange.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "charge")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChargeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "lat")
    private double lat;

    @Column(name = "lng")
    private double lng;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "charge_type")
    private String chargeType;

    @Column(name = "rate")
    private double rate;

    @Column(name = "open")
    private String open;
}
