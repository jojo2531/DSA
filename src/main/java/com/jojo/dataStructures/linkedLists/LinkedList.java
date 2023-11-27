package com.jojo.dataStructures.linkedLists;


public class LinkedList {

    int length = 0;
    Node head;
    Node tail;

    boolean isDoublyLinkedList;
    boolean isCircularLinkedList;

    /*public void append(int value)    {

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
    }*/

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        /*list.append(5);
        list.append(15);
        list.prepend(10);
        list.insert(2, 25);
        list.insert(3, 31);
        list.printList();*/
        list.append(25);
        list.printList();
        list.append(31);
        list.printList();
        list.prepend(16);
        list.printList();
        list.prepend(14);
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();

    }

    public void printList()    {
        if(this.length > 0)   {
            Node node = this.head;
            while(node != null) {
                System.out.print(node.value);
                if(node.nextNode != null)
                    System.out.print( " -> ");
                node = node.nextNode;
            }
        }
        System.out.println();
    }

    public void append(int value)   {

        Node newNode = new Node(value, null, null);

        if(this.length == 0) {
            this.head = newNode;
            this.tail = head;
        } else if(this.length == 1) {
            this.head.nextNode = newNode;
            this.tail = newNode;
        } else {
            Node tmpNode = this.head.nextNode;
            while(tmpNode != null)  {
                System.out.print(tmpNode.value);
                if(tmpNode.nextNode != null)
                    System.out.print("  -> ");
                tmpNode = tmpNode.nextNode;
            }
        }
        this.length++;
    }

    public void prepend(int value)  {
        Node newNode = new Node(value, null, null);
        if(this.length == 0)    {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.nextNode = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public void removeFirst()   {
        if(this.length == 1)    {
            this.head = null;
            this.tail = null;
            this.length--;
        }

        if(this.length > 1) {
            this.head = this.head.nextNode;
            this.length--;
        }
    }

    public void removeLast() {
        if (this.length > 0) {
            Node tmpNode = this.head;
            int index = 1;
            while (index < this.length - 1) {
                    tmpNode = tmpNode.nextNode;
                    index++;
            }
            tmpNode.nextNode = null;
            this.tail = tmpNode;
            this.length--;
        }
    }
}
