package com.jojo.practice;

import java.util.*;
import java.util.stream.Collectors;

public class aa {

    public static void main(String[] args) {

        Employee e1 = new Employee("ss", 1234);
        Employee e2 = new Employee("dsfsf", 2323);
        Employee e3 = new Employee("sasrwers", 564646);
        Employee e4 = new Employee("ssdfsdfs", 3424);
        Employee e5 = new Employee("ssdfdsfs", 3434);
        Employee e6 = new Employee("dfsf", 23232);


        List<Employee> aa = new ArrayList<>()   {{
            add(e1);
            add(e2);
            add(e3);
            add(e4);
            add(e5);
            add(e6);
        }};


        Employee ee = aa.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
        int ee1 = aa.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(ee.getName());



        String input = "Java Hungry Blog Alive is Awesome";

        Optional<Character> firstNonOccurrence = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        Map<Character, Long> tt = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));

        Optional<Map.Entry<Character, Long>> qw = input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst();
        Map.Entry<Character, Long> qqq = qw.get();
        System.out.println(qqq.getKey());

        List<Integer> nums = new ArrayList<>()   {{
            add(1);
            add(2);
            add(4);
            add(6654);
            add(23232);
            add(2323);
            add(11);
            add(23223);
            add(2323);
            add(231231223);
            add(0);
        }};

        aa a1 = new aa();
        a1.test();

    }

    public void test()  {
        final int i;
        i = 20;
        System.out.println(i);
    }
}
