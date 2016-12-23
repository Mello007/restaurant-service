package ru.restaurant.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter
@Entity @Table(name = "Client")
public class Client extends BaseEntity {
    private String fio;
    private String numberPhone;
    private String idCard;
}