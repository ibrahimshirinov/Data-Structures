package com.company;

public class LinkedList {

    Node head;
    Node current;
    Node temporary;

   
    public  LinkedList () {

        head = null;
        current = null;
        temporary = null;
    }

    
    public void addNode(int addData) {

        Node n = new Node ();
        n.next = null;
        n.data = addData;

          if (head != null) {

            current = head;
            while(current.next != null) {
                
                current = current.next;
             
            }
           current.next= n;

          }

          else {
              head= n ;
          }

    }

    public  void deleteNode (int delData) {

        Node delNode = null;
        temporary = head;
        current= head;


        while (current != null && current.data != delData) {

            temporary = current;
            current = current.next;

        }
        if (current == null) {

            System.out.println(delData + " was not in the list ");

            delNode = null ;
        }

        else {


            delNode  = current;
            current = current.next;
            temporary.next = current;
            delNode =null;
            System.out.println("the value " + delData + " was deleted ");

        }

    }

    public  void printNode () {

        current = head;

        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }

    }


}
