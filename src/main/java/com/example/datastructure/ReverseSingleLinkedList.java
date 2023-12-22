package com.example.datastructure;

import java.util.Collections;
import java.util.LinkedList;

/*TODO How to Reverse Single Linked List */
public class ReverseSingleLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(Integer.valueOf(1));
        li.add(Integer.valueOf(2));
        li.add(Integer.valueOf(3));
        li.add(Integer.valueOf(4));
        li.add(Integer.valueOf(5));
        System.out.println("The element of the linked list before reversing" +li );
        Collections.reverse(li);
        System.out.println("The element of the linked list After Using Inbuild Function reversing" +li );
        li = reverseLinkedList(li);
        System.out.println("The element of the linked list After Using Custome Function reversing" +li );

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> li)
    {
        for(int i =0;i<li.size()/2;i++)
        {
            Integer temp =li.get(i);
            li.set(i,li.get(li.size()-i-1));
            li.set(li.size()-i-1,temp);
        }
        return li;
    }
}
