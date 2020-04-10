package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    Board boardList;

    @Bean
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean
    public Board getBoardList() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

}
