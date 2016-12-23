package ru.restaurant.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "ClientCard")
public class ClientCard extends BaseEntity {
    private String name;
    private String discountSize;
    private String type;
}
