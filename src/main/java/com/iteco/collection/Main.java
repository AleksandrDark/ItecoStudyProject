package com.iteco.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student("Слава", 11, "sf", Subject.MATH));
        students.add(new Student("Антон", 11, "sf", Subject.MATH));
        students.add(new Student("Петр", 4, "sf", Subject.MATH));
        students.add(new Student("Григорий", 12, "sf", Subject.MATH));
        students.add(new Student("Григорий", 11, "sf", Subject.MATH));
        students.add(new Student("Инокентий", 12, "sf", Subject.MATH));

        while (true){
            print();
            String string = input();
            if (string.equals("5"))
                break;
            if (string.equals("1")){
                addStudent();
            }
            if (string.equals("2")){
                if (!students.isEmpty())
                    printSortAsc();
                else
                    System.out.println("Список пуст");
            }
            if (string.equals("3")){
                if (!students.isEmpty())
                    printSortDesc();
                else
                    System.out.println("Список пуст");
            }
            if (string.equals("4")){
                if (!students.isEmpty())
                    deleteStudent();
                else
                    System.out.println("Список пуст");
            }
        }
    }

    private static void print(){
        System.out.println("1. Ввести ученика\n" +
                "2. Вывести всех учеников по возрастанию\n" +
                "3. Вывести всех учеников по убыванию\n" +
                "4. Удалить ученика по индексу\n" +
                "5. Выйти из программы\n");
    }

    private static String input() {
        return scanner.nextLine();
    }

    private static void addStudent(){
        System.out.println("Введите ученика в формате \"ФИО, возраст, класс, любимый предмет\"");
        String string = input();
        String [] fields = string.split(", ");
        String fio = fields[0];
        int age = Integer.parseInt(fields[1]);
        String classStudent = fields[2];
        Subject subject = Subject.getValue(fields[3]);
        Student student = new Student(fio, age, classStudent, subject);
        if (checkUniqueStudent(student)){
            students.add(student);
            System.out.println("Вы ввели ученика: " + student);
        }
        else
            addStudent();
    }

    private static boolean checkUniqueStudent(Student studentik) {
        try{
            if(students.contains(studentik)){
                throw new StudentException("Такой студент уже есть в базе данных", studentik);
            }
        }catch (StudentException x){
            System.out.println(x.getMessage());
            System.out.println(x.getStudent());
            return false;
        }
        return true;
    }

    private static void printSortAsc() {
        Comparator<Student> comparatorAsc = new sortAsc();
        TreeSet<Student> studentsSet = new TreeSet<>(comparatorAsc);
        studentsSet.addAll(students);

        for (Student student: studentsSet){
            System.out.println(student);
        }
    }

    private static void printSortDesc() {
        Comparator<Student> comparatorDesc = new sortDesc();
        TreeSet<Student> studentsSet = new TreeSet<>(comparatorDesc);
        studentsSet.addAll(students);

        for (Student student: studentsSet){
            System.out.println(student);
        }
    }

    private static boolean deleteStudent(){
        System.out.println("Введите индекс ученика от 0 до " + (students.size() - 1));
        int index = Integer.parseInt(input());

        if (index >= 0 && index < students.size()) {
            System.out.println("Студент " + students.get(index) + " удален");
            students.remove(index);
            return true;
        }else {
            System.out.println("Ошибка ввода индекса");
            return false;
        }
    }
}

class sortAsc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int nameCompare = o1.getFio().compareTo(o2.getFio());
        if (nameCompare != 0)
            return nameCompare;
        return o1.getAge() - o2.getAge();
    }
}

class sortDesc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int nameCompare = o2.getFio().compareTo(o1.getFio());
        if (nameCompare != 0)
            return nameCompare;
        return o2.getAge() - o1.getAge();
    }
}