package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "List1";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("List1", "some description");

        //When
        taskListDao.save(taskList);

        //Then
        String name = taskList.getListName();
        Assert.assertEquals(LISTNAME, name);

        //Cleanup
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
}
