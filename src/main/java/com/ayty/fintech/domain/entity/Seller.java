package com.ayty.fintech.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Seller implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String cnpj;

    @Column(nullable = false, name = "fantasy_name")
    private String fantasyName;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, name = "company_name")
    private String companyName;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = User.class)
    private User user;
}
