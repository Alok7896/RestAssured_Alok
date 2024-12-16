package org.example.utils;

public class Circle extends Shape{

    public void calculateArea(){
        System.out.println("Welcome Home");
    }

    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculateArea();
    }
}
