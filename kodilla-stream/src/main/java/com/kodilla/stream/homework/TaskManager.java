package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {

        List<LocalDate> zadaniaAktualne = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(TaskManager::getDeadLineTime)
                .collect(Collectors.toList());
        System.out.println(zadaniaAktualne);

    }

    public static LocalDate getDeadLineTime(Task task) {
        return task.getDeadline();
    }
}
