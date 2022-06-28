package com.practise.streams;

import com.practise.data.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITutorial {

    static List<Employee> employees = new ArrayList<>();

    static {

        employees.add(new Employee("Santhosh Kumar", "Nunna", 50000.0, Arrays.asList("Project 1", "Project 2")));
        employees.add(new Employee("Kiran Kumar", "Nunna", 70000.0, Arrays.asList("Project 1", "Project 3")));
        employees.add(new Employee("Shankar", "gupta", 80000.0, Arrays.asList("Project 3", "Project 4")));

    }


    public static void main(String... args) {

        //foreach - terminal operation
        employees
                .forEach(System.out::println);

        //map - intermediate operation
        //collect
        List<Employee> increasedSal =
                employees.stream()
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .collect(Collectors.toList());
        System.out.println(increasedSal);
        //Return results as Set instead of List
        Set<Employee> increasedSalSet =
                employees.stream()
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .collect(Collectors.toSet());
        System.out.println(increasedSalSet);

        //filter operation - whose salary is less than 80,000
        List<Employee> filterEmployee = employees.stream()
                .filter(employee -> employee.getSalary() < 80000.0)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                ))
                .collect(Collectors.toList());
        System.out.println(filterEmployee);

        //filter - findFirst
        Employee firstEmployee =
                employees.stream()
                        .filter(employee -> employee.getSalary() < 80000.0)
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .findFirst()
                        .orElse(null);
        System.out.println(firstEmployee);
        //flatmap

        String projects =
                employees.stream()
                        .map(Employee::getProjects)
                        .flatMap(Collection::stream)
                        .collect(Collectors.joining(","));
        System.out.println(projects);

        //short circuit operations
        List<Employee> shortCircuit =
                employees.stream()
                        .skip(1)
                        .limit(1)
                        .collect(Collectors.toList());
        System.out.println(shortCircuit);

        //finite data
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        //sorting
        List<Employee> sortedList =
                employees.stream()
                        .sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
                        .collect(Collectors.toList());
        System.out.println(sortedList);

        //min or max
        Employee maxEmployee =
                employees.stream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .orElseThrow(NoSuchElementException::new);
        System.out.println(maxEmployee);

        //reduce
        Double totalSalary =
                employees.stream()
                        .map(Employee::getSalary)
                        .reduce(0.0, Double::sum);
        System.out.println("Total Salary: " + totalSalary);
    }
}
