package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;
    private String listName = "First List";
    private String description = "Here find full description";

    @Test
    public void testFindByListName() {
        List<TaskList> readTasksList = null;

        try {
            //Given
            TaskList taskList = new TaskList(listName, description);
            taskListRepository.save(taskList);
            listName = taskList.getListName();

            //When
            readTasksList = taskListRepository.findByListName(listName);

            //Then
            Assert.assertEquals(1, readTasksList.size());

        } finally {

            //CleanUp
            int id = readTasksList.get(0).getId();
            taskListRepository.deleteById(id);
        }
    }
}
