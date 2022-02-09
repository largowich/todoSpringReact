package com.devalgas.todo_spring_react.repository;

import com.devalgas.todo_spring_react.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author devalgas kamga on 07/02/2022. 19:32
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
