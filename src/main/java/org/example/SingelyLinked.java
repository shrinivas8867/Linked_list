package org.example;



public class SingelyLinked {
 Node head;
 private int size;

 SingelyLinked(){
     this.size=0;
 }

    public class Node{
        String data;
        Node next;
        Node(String data){
             this.data=data;
             this.next=null;
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
        head=newnode;
    }

    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }


    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;

        }
        Node currNode=head;
        while (currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    // delete methods

    public void deleteFirst(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        head=head.next;
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

    }

    public int getsize(){
     return size;
    }


    public static void main(String[] args) {
        int[] x= new int[5];
        x[0]=2;
        x=new int[6];

        System.out.println(x[1]);


        SingelyLinked list=new SingelyLinked();
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
        System.out.println("Hello world!");




    }
}