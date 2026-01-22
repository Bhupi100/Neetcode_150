package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s1 = "Hello"+"World";
        String s2 = "HelloWorld";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}