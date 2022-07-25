package com.jojo.lists;


import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    int length = 0;
    Node head;
    Node tail;

    Node tempNode;

    public void append(int value)    {

        if(length == 0) {
            head = new Node(value, null);
            tail = new Node(value, null);
        } else {
            tempNode = new Node(value, null);
            tail = tempNode;
            head.setNextNode(tempNode);
        }
        length++;
    }

    public void prepend(int value)  {
        if(length == 0) {
            head = new Node(value, null);
            tail = new Node(value, null);
        } else {
            tempNode = new Node(value, head);
            head = tempNode;
        }
        length++;
    }

    public void insert(int index, int value)    {

        if(length == 0)
            append(value);
        else if(index == 1)
            prepend(value);
        else {
            int iterator = 1;
            Node node = head.getNextNode();
            while(iterator < index)    {

                if(iterator == (index - 1))   {
                    Node tempNode = new Node(value, node.getNextNode());
                    node.setNextNode(tempNode);
                    length++;
                    break;
                } else {
                    node = node.getNextNode();
                    iterator++;
                }
            }
        }

    }

    public void delete(int index, int Value)    {

    }
    public void printList() {

        int iterator = length;
        Node node = head;
        List<Integer> list = new ArrayList<>();
        if(iterator == 0)
            System.out.println(list);
        else if(iterator == 1) {
            list.add(head.getValue());
            System.out.println(list);
        }
        else {
            while(iterator > 0)   {
                list.add(node.getValue());
                node = node.getNextNode();
                iterator--;
            }
            System.out.println(list);
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.append(5);
        list.append(15);
        list.prepend(10);
        list.insert(2, 25);
        list.insert(3, 31);
        list.printList();

    }
}
