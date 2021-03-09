//*************************************************************************************
//  ArrayListStackDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: March 03, 2021
//  COURSE: COMP 2231, ASSIGNMENT 3: QUESTION 2
//
//  This class implements a stack using java.util.ArrayList
//*************************************************************************************

public class ArrayListStackDriver
{
    public static void main(String[] args)
    {
        //Display to the user the process of pushing elements onto the stack
        System.out.println("----------------------------------------------");
        ArrayListStack<Integer> arrayListStack = new ArrayListStack<>();
        arrayListStack.push(1);
        System.out.println("Push 1: " + arrayListStack.toString());
        arrayListStack.push(5);
        System.out.println("Push 5: " + arrayListStack.toString());
        arrayListStack.push(8);
        System.out.println("Push 8: " + arrayListStack.toString());
        arrayListStack.push(11);
        System.out.println("Push 11: " + arrayListStack.toString());
        arrayListStack.push(4);
        System.out.println("Push 4: " + arrayListStack.toString());

        //Populates the arrayliststack with 1000 elements to test functionality at scale.
        //arrayListStack = createArrayListStackOfGivenSize(1000);
        //System.out.println("ArrayListStack: " + arrayListStack.toString());

        //Display functionality to the user of the stack
        System.out.println("----------------------------------------------");
        System.out.println("Peek: " + arrayListStack.peek());
        System.out.println("Size: " + arrayListStack.size());
        System.out.println("Pop: " + arrayListStack.pop());
        System.out.println("ArrayListStack: " + arrayListStack.toString());
        System.out.println("Size: " + arrayListStack.size());
        System.out.println("Is Empty: " + arrayListStack.isEmpty());
        System.out.println("----------------------------------------------");
    }

    //Populates an ArrayListQueue with a given number of elements ranging in values from 1 to 1000
    public static ArrayListStack<Integer> createArrayListStackOfGivenSize(int size)
    {
        int max = 1000, min = 1;
        ArrayListStack<Integer> tempStack = new ArrayListStack<>();
        for(int i=0;i<size;i++)
        {
            tempStack.push((int)(Math.random() * (max - min + 1) + min));
        }
        return tempStack;
    }
}
