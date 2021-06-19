package com.example.template.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String companyName = "";

  @Column(unique = true, nullable = false)
  private String username;

  @Column(unique = true, nullable = false)
  private String email;

  @Column(nullable = false)
  private String firstname;

  @Column(nullable = false)
  private String lastname;

  @Column(nullable = false)
  private String address;

  @Column(nullable = false)
  private String city;

  @Column(nullable = false)
  private String country;

  @Column
  private String postalCode;

  @Column(columnDefinition = "TEXT")
  private String aboutMe;
}
