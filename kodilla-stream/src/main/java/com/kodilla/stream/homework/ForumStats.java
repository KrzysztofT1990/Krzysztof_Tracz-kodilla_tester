package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {

    public static void main(String[] args) {
        double avgPostForYounger = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(value -> value.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Srednia postów jakie zostały napisane przez młodszych użytkowników (<40): " + avgPostForYounger);

        double avgPostForOlder = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(value -> value.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Srednia postów jakie zostały napisane przez starszych użytkowników (>=40): " + avgPostForOlder);

    }
}
