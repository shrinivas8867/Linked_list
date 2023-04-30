package org.example;

import java.util.LinkedList;

public class DoubelyLinked {
    Node head;
    private int size;

    DoubelyLinked(){
        this.size=0;
        this.head=null;
    }

    public class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;

            size ++;
        }
    }

    // add method
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        newnode.prev=null;
        head.prev=newnode;
        head=newnode;

    }

    public void addLast(String data){
        Node newnode=new  Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
        newnode.prev=currNode;
    }

    public Node finds(String value){
        Node node= head;
        while (node!=null){
            if(node.data==value){
                return node;

            }
            node=node.next;
        }
        return null;
    }
    public void insertafter(String after, String newnode){
        Node af=finds(after);
            if(af==null){
                System.out.println("Does not found value");
                return;
            }
            Node newnode1=new Node(newnode);
            newnode1.next=af.next;
            af.next=newnode1;
            newnode1.prev=af;
            if(newnode1.next!=null) {
                newnode1.next.prev = newnode1;
            }

    }


    public void printlist(){

        if(head==null){
            System.out.println("list is empty");
            return;

        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+" <-> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");

//        System.out.println("Printing in reverse");
//        Node last=null;
//        while (last!=null){
//            System.out.println(last.data+"->");
//            last=last.prev;
//        }
//        System.out.println("null");
    }

    // delete methods

    public void deleteFirst(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        head=head.next;
        head.prev=null;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
       Node secondlast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        lastNode.prev=null;

    }

    public int getsize(){
        return size;
    }


    public static void main(String[] args) {
        DoubelyLinked list=new DoubelyLinked();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addLast("list");
        list.addfirst("this");
        list.printlist();
        list.deleteFirst();
        list.printlist();
//        list.deleteLast();
//        list.printlist();
        System.out.println("size is "+ list.getsize());
//        System.out.println("Hello world!");
//        LinkedList<String> list2=new LinkedList<>();
//        list2.add("I am");
//        list2.addFirst("hello");
//        list2.addLast("Shree");


    }
}
