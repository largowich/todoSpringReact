package com.devalgas.todo_spring_react;

import com.devalgas.todo_spring_react.domain.Todo;
import com.devalgas.todo_spring_react.domain.User;
import com.devalgas.todo_spring_react.repository.TodoRepository;
import com.devalgas.todo_spring_react.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
@Slf4j
public class TodoSpringReactApplication implements CommandLineRunner {

    private final TodoRepository todoRepository;
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodoSpringReactApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        int size = 0;

        while (size < 10){
            todoRepository.save(Todo.builder().withName(RandomString.make()).withComplete(size % 2 == 0).withCategory(RandomString.make()).build());
            userRepository.save(User.builder().withFirstName(RandomString.make()).withLastName(RandomString.make()).withEmail(RandomString.make()+"@gmail.com").build());
            size++;
        }

        log.info("todos : {}", this.todoRepository.findAll().toString());
        log.info("todos : {}", this.userRepository.findAll().toString());
    }
}
