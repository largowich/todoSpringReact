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
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "category")
    private String category;

    @Column(name = "name")
    private String name;

    @Column(name = "complete")
    private boolean complete;

    public Todo() {
    }
}
