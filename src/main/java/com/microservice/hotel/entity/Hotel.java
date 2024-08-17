package com.microservice.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Hotels_microservice")
public class Hotel {

@Id
private String id;
private String name;
private String location;
private String about;
}
