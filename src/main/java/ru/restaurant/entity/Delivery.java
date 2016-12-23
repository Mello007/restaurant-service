package ru.restaurant.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter
@Entity @Table(name = "Delivery")
public class Delivery extends BaseEntity{
    private String address;
    private String name;
}
