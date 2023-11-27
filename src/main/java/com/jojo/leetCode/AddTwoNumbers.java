package com.jojo.leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l3 = addTwoNumbers(l1, l2);
        while(l1 != null)   {
            System.out.println(l1.val);
            l1 = l1.next;
        }
        System.out.println();
        System.out.println();
        while(l2 != null)   {
            System.out.println(l2.val);
            l2 = l2.next;
        }
        System.out.println();
        System.out.println();
        while(l3 != null)   {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carryOver = 0;
        int l1NodeCount = 0, l2NodeCount = 0;
        int value;
        ListNode headNode = null;
        ListNode nextNode;
        Queue<Integer> sum = new LinkedList<>();
        while(l1 != null || l2 != null) {
            value = carryOver;
            if(l1 != null)  {
                if(++l1NodeCount > 100 || (l1.val < 0 && l1.val > 9))    {
                    return null;
                } else  {
                    value += l1.val;
                }
                l1 = l1.next;
            }
            if(l2 != null)  {
                if(++l2NodeCount > 100 || (l2.val < 0 && l2.val > 9))    {
                    return null;
                } else  {
                    value += l2.val;
                }
                l2 = l2.next;
            }
            if(value < 10) {
                sum.add(value);
                carryOver = 0;
            } else {
                sum.add(Math.floorMod(value, 10));
                carryOver = 1;
            }
        }
        if(carryOver == 1)
            sum.add(carryOver);
        while(!sum.isEmpty()) {
            if(headNode == null)
                headNode = new ListNode(sum.poll());
            else {
                //nextNode = new ListNode(sum.pop());
                ListNode tempNode = headNode;
                while(headNode.next != null)    {
                    headNode = headNode.next;
                }
                headNode.next = new ListNode(sum.poll());
                headNode = tempNode;
            }
        }
        return headNode;
    }


}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }