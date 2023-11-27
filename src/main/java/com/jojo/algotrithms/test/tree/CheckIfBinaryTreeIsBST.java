package com.jojo.algotrithms.test.tree;

import java.util.ArrayList;
import java.util.List;

public class CheckIfBinaryTreeIsBST {

    static List<Integer> inorder = new ArrayList<>();
    public static void main(String[] args) {

        Node n1 = new Node(45);
        Node n2 = new Node(35);
        Node n3 = new Node(48);
        Node n4 = new Node(20);
        Node n5 = new Node(37);
        Node n6 = new Node(47);
        Node n7 = new Node(50);
        Node n8 = new Node(36);
        Node n9 = new Node(42);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n5.left = n8;
        n5.right = n9;
        n3.left = n6;
        n3.right = n7;

        //inOrder(n1);
        System.out.println(isBST(n1));
    }

    static void inOrderTraversal(Node node)  {
        if(node == null)
            return;
        inOrderTraversal(node.left);
        inorder.add(node.value);
        inOrderTraversal(node.right);
    }

    static boolean isBST(Node node)   {

        inOrderTraversal(node);
        for(int i = 0; i < inorder.size(); i++) {
            if(i != inorder.size() - 1 && inorder.get(i) > inorder.get(i + 1))
                return false;
        }
        return true;
    }
}
