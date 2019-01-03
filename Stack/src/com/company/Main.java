package com.company;

public class Main {

    public static void main(String[] args) {


        Stack newStack = new Stack(5);
        newStack.push(10);
        newStack.push(1);
        newStack.push(50);
        newStack.push(20);
        newStack.push(90);

        newStack.display();
        newStack.pop();

        newStack.display();





    }
}
