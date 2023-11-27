package com.jojo.algotrithms.test;

import com.jojo.dataStructures.binaryTress.TreeNode;

public class BinaryTreeTraversal {

    public static void main(String[] args) {

        TreeNode treeNode = generateBinaryTree();
        System.out.println();
        preOrder(treeNode);
        System.out.println();
    }

    static void preOrder(TreeNode node) {
        if(node == null)
            return;
        System.out.print(" " + node.getData());
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    public static TreeNode generateBinaryTree()    {

        TreeNode t1 = new TreeNode("N1");
        TreeNode t2 = new TreeNode("N2");
        TreeNode t3 = new TreeNode("N3");
        TreeNode t4 = new TreeNode("N4");
        TreeNode t5 = new TreeNode("N5");
        TreeNode t6 = new TreeNode("N6");
        TreeNode t7 = new TreeNode("N7");
        TreeNode t8 = new TreeNode("N8");
        TreeNode t9 = new TreeNode("N9");

        t1.setLeftNode(t2);
        t1.setRightNode(t3);
        t2.setLeftNode(t4);
        t2.setRightNode(t5);
        t3.setLeftNode(t6);
        t3.setRightNode(t7);
        t4.setLeftNode(t8);
        t4.setRightNode(t9);


        return t1;
    }
}


