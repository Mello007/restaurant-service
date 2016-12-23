package ru.restaurant.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter
@Entity @Table(name = "Pay")
public class Pay extends BaseEntity {
    private String description;
}
