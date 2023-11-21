package org.example.tranzit.spring_app.database.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntityS {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "logIn")
    private String logIn;
    @Column(name = "password")
    private String password;

}
