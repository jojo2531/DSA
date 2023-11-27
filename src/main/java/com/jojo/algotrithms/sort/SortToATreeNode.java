package com.jojo.algotrithms.sort;

public class SortToATreeNode {

    public static void main(String[] args) {
        int[] arr = {1,3,6,8,10/*,16,19,22,25,27,31,45,50*/}; // 13 values element 19

        TreeNode root = balanceSort(arr, 0, arr.length - 1);
        System.out.println(root);
    }

    public static TreeNode balanceSort(int[] arr, int start, int end)    {

        if(start <= end)    {
            int midIndex = Math.floorDiv(start + end, 2);
            TreeNode node = new TreeNode(arr[midIndex]);
            node.left = balanceSort(arr, start, midIndex - 1);
            node.right = balanceSort(arr, midIndex +1, end);
            return node;
        } else
            return null;
    }
}

class TreeNode  {

    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode() {
    }
}
