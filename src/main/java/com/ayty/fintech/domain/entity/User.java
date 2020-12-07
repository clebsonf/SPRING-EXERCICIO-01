package com.ayty.fintech.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Column;

import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false, name = "full_name")
    private String fullName;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false, name = "phone_number")
    private String phoneNumber;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Consumer consumer;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Seller seller;
}
