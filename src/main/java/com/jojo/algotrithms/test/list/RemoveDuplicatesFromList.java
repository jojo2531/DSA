package com.jojo.algotrithms.test.list;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(4);
        Node n6 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printList(n1);
        removeDuplicates(n1);
        System.out.println();
        printList(n1);
    }

    static void printList(Node node) {
        while(node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    static void removeDuplicates(Node node) {

        while(node != null) {
            if(node.value != node.next.value)
                node = node.next;
            else{
                Node currentNode = node;
                while (currentNode.next != null && currentNode.value == currentNode.next.value)
                    currentNode = currentNode.next;
                node.next = currentNode.next;
                node = node.next;
            }
        }
    }
}
