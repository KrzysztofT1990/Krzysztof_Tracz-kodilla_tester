package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {


    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Zadanie-nr-1", LocalDate.of(2021, 4, 12), LocalDate.of(2022, 11, 29)));
        tasks.add(new Task("Zadanie-nr-2", LocalDate.of(2018, 10, 19), LocalDate.of(2019, 11, 29)));
        tasks.add(new Task("Zadanie-nr-3", LocalDate.of(2005, 4, 12), LocalDate.of(2022, 11, 29)));
        tasks.add(new Task("Zadanie-nr-4", LocalDate.of(2011, 6, 1), LocalDate.of(2005, 1, 1)));
        tasks.add(new Task("Zadanie-nr-5", LocalDate.of(2020, 5, 10), LocalDate.of(2021, 8, 24)));
        tasks.add(new Task("Zadanie-nr-6", LocalDate.of(1990, 4, 1), LocalDate.of(1999, 4, 6)));
        return tasks;
    }
}