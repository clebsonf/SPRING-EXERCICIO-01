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
public class Consumer implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false,unique = true)
    private String username;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = User.class)
    private User user;

}
