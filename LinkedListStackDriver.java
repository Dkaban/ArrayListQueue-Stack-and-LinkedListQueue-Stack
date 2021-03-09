//*************************************************************************************
//  LinkedListStackDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: March 01, 2021
//  COURSE: COMP 2231, ASSIGNMENT 3: QUESTION 1
//
//  This class implements a stack using java.util.LinkedList
//*************************************************************************************

public class LinkedListStackDriver
{
    public static void main(String[] args)
    {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        //Display process of pushing elements onto the stack to the user
        System.out.println("----------------------------------------------");
        linkedListStack.push(1);
        System.out.println("Push 1: " + linkedListStack.toString());
        linkedListStack.push(5);
        System.out.println("Push 5: " + linkedListStack.toString());
        linkedListStack.push(8);
        System.out.println("Push 8: " + linkedListStack.toString());
        linkedListStack.push(11);
        System.out.println("Push 11: " + linkedListStack.toString());
        linkedListStack.push(4);
        System.out.println("Push 4: " + linkedListStack.toString());

        //This tests the functionality of adding 1000 items to the stack and seeing if it still works
        //linkedListStack = createLinkedListStackOfGivenSize(1000);
        //System.out.println("LinkedListStack: " + linkedListStack.toString());

        //Display the functionality of the stack to the user
        System.out.println("----------------------------------------------");
        System.out.println("Peek: " + linkedListStack.peek());
        System.out.println("Size: " + linkedListStack.size());
        System.out.println("Pop: " + linkedListStack.pop());
        System.out.println("LinkedListStack: " + linkedListStack.toString());
        System.out.println("Size: " + linkedListStack.size());
        System.out.println("Is Empty: " + linkedListStack.isEmpty());
        System.out.println("----------------------------------------------");
    }

    //Populates an ArrayListQueue with a given number of elements ranging in values from 1 to 1000
    public static LinkedListStack<Integer> createLinkedListStackOfGivenSize(int size)
    {
        int max = 1000, min = 1;
        LinkedListStack<Integer> tempStack = new LinkedListStack<>();
        for(int i=0;i<size;i++)
        {
            tempStack.push((int)(Math.random() * (max - min + 1) + min));
        }
        return tempStack;
    }
}
