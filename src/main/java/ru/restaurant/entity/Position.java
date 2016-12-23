package ru.restaurant.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter
@Entity @Table(name = "Position")
public class Position extends BaseEntity {
    private String description;
}
