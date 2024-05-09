package com.iteco.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = setEmployees();

        //1 print sort by acs and desc
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("_______________");

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getName).reversed())
                .forEach(System.out::println);

        System.out.println("_______________");

        //2 filter by field
        employees.stream()
                .filter(employee -> employee.getSalary() > 100_000)
                .forEach(System.out::println);

        System.out.println("_______________");
//        employees.stream().map(Employee::getName).forEach(name -> System.out.print(name + " "));
        //3 sort collection and group result
        Map<Integer, List<Employee>> mapSalaryGroup = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.groupingBy(Employee::getSalary));

        mapSalaryGroup.forEach((salary, employes) -> {
                    System.out.println(salary);
                    employes.forEach(System.out::println);
                });

        System.out.println("_______________");
        //4 min and max object
        employees.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        System.out.println("_______________");
        //5 allMatch, anyMatch, noneMatch
        System.out.println(employees.stream().allMatch(employee -> employee.getSalary() > 50_000));
        System.out.println(employees.stream().anyMatch(employee -> employee.getSalary() > 50_000));
        System.out.println(employees.stream().noneMatch(employee -> employee.getDateBirth() > 2000));

        System.out.println("_______________");
        //bonus reduce
        employees.stream().map(Employee::getSalary).reduce(Integer::sum).ifPresent(System.out::println);
    }

    private static List<Employee> setEmployees() {
        return Arrays.asList(new Employee("Иван", 1991, 60_000),
                new Employee("Петр", 1952, 22_000),
                new Employee("Эдуард", 1974, 60_000),
                new Employee("Николай", 1992, 90_000),
                new Employee("Всеволод", 1996, 300_000),
                new Employee("Станислав", 1991, 240_000),
                new Employee("Максим", 1981, 140_000),
                new Employee("Kate", 1990, 55_000));
    }
}

class SortEmployeesDesc implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int salaryCompare = o2.getSalary() - o1.getSalary();
        if (salaryCompare != 0)
            return salaryCompare;
        return o2.getName().compareTo(o1.getName());
    }
}
