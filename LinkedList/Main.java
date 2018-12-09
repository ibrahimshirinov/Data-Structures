package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();


        list.addNode(3);

        list.addNode(5);
        list.addNode(6);

        list.addNode(9);
        list.deleteNode(9);

        list.printNode();
    }
}
