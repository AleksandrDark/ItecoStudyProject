package com.iteco.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ivan", 33, 1991);
        Person person2 = new Person("Petr", 25, 1999);
        Person person3 = new Person("Vlad", 23, 2001);
        Person person4 = new Person("Aleks", 45, 1979);
        Person person5 = new Person("Oly", 20, 2004);
        Person person6 = new Person("Polina", 16, 2008);
        List<Person> personList = new ArrayList<>(
                Arrays.asList(person, person2, person3, person4, person5, person6));
        for (Person person1: personList){
            personConsumer.accept(person1);
        }

        System.out.println("---------------");

        List<Student> studentList = new ArrayList<>();
        for (Person person1: personList){
            if (predicate.test(person1.getAge())) {
                studentList.add(function.apply(person1));
            }
        }
        studentList.forEach(System.out::println);
    }

    static Predicate<Integer> predicate = (age) -> age > 17 && age < 40;

    static Function<Person, Student> function = person -> {
        if (person.getYearBirth() < 1995){
            return new Student(person.getFio(), person.getAge(), GROUP.ONE);
        } else
            return new Student(person.getFio(), person.getAge(), GROUP.TWO);
    };

    static Consumer<Person> personConsumer = System.out::println;
}
