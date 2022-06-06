package com.array;

import java.sql.Struct;
import java.util.Iterator;
import java.util.Vector;

public class ArrayDemo {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(arr);


       int arr2[] = new int[]{1,2,3,4,5};

       String[] name = {"aaa"};

       String test = "abcde";
       System.out.printf("%c",test.codePointAt(2));


      class Person
      {
          public String name;
          public int age;
          public Person(int age,String name)
          {
              this.age = age;
              this.name = name;
          }

      }

      Person p1 = new Person(15,"abc");

        System.out.println(p1.name);

        Vector v = new Vector<Person>();

        v.addElement(p1);









    }
}
