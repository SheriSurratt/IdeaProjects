package com.company;

import People.Author;
import People.Person;
import People.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Java oops 2
//    obj vs class


////        this is the instance of the object
//        Integer num = new Integer(4);
//creating a new instance of an object
        Person firstName = new Person();
//        the second way
        Person secondPerson = new Person("John");

//        the last way
        Person thirdPerson = new Person("john,", "doe", "PHX", 54, 6, false );
        thirdPerson.sayHello();


//        System.out.println(thirdPerson.birthDay());
//        System.out.println(thirdPerson.birthYear(2021));
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student s1 = new Student();
        s1.setFirstName("Sara");
        s1.setAge(19);
        s1.setGradYear(2025);
        studentList.add(s1);

//        ArrayList<Student> studentList = new ArrayList<Student>();
        Student s2 = new Student();
        s1.setFirstName("Ashley");
        s1.setAge(20);
        s1.setGradYear(2022);
        studentList.add(s2);

        for (Student s : studentList){
            System.out.println("Name:" + s.getFirstNAme()+
                    "\nAge: " + s.getAge() + "\ngrad year: "+
                    s.getGradYear());
        }

//        Author new_Author = new Author();
//        new_Author.setFirstName("Dan");
//
//        new_Author.writngBook();
//        System.out.println();
    }
}
