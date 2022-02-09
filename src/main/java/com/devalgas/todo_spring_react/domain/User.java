package com.devalgas.todo_spring_react.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author devalgas kamga on 07/02/2022. 19:25
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String email;

    public User() {
    }
}
