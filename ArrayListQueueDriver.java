//*************************************************************************************
//  ArrayListQueueDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: March 09, 2021
//  COURSE: COMP 2231, ASSIGNMENT 3: QUESTION 4
//
//  This class demonstrates how an ArrayList works when setup as a queue
//  Displays to the user what is happening as the functions of an ArrayListQueue are tested
//*************************************************************************************

public class ArrayListQueueDriver
{
    public static void main(String[] args)
    {
        System.out.println("----------------------------------------------");
        ArrayListQueue<Integer> arrayListQueue = new ArrayListQueue<>();
        //Enqueue the arraylist and displaying each step as it happens
        arrayListQueue.enqueue(1);
        System.out.println("Enqueue 1: " + arrayListQueue.toString());
        arrayListQueue.enqueue(5);
        System.out.println("Enqueue 5: " + arrayListQueue.toString());
        arrayListQueue.enqueue(8);
        System.out.println("Enqueue 8: " + arrayListQueue.toString());
        arrayListQueue.enqueue(11);
        System.out.println("Enqueue 11: " + arrayListQueue.toString());
        arrayListQueue.enqueue(4);
        System.out.println("Enqueue 4: " + arrayListQueue.toString());

        //This displays using the random size and number generator
        //arrayListQueue = createArrayListQueueOfGivenSize(1000);
        //System.out.println("ArrayListQueue: " + arrayListQueue.toString());

        //Displaying to the user the size, first element, dequeue, the elements, the size, and if it is empty
        System.out.println("----------------------------------------------");
        System.out.println("Size: " + arrayListQueue.size());
        System.out.println("First: " + arrayListQueue.first());
        System.out.println("Dequeue: " + arrayListQueue.dequeue());
        System.out.println("ArrayListQueue: " + arrayListQueue.toString());
        System.out.println("Size: " + arrayListQueue.size());
        System.out.println("Is Empty: " + arrayListQueue.isEmpty());
        System.out.println("----------------------------------------------");
    }

    //Populates an ArrayListQueue with a given number of elements ranging in values from 1 to 1000
    public static ArrayListQueue<Integer> createArrayListQueueOfGivenSize(int size)
    {
        int max = 1000, min = 1;
        ArrayListQueue<Integer> tempQueue = new ArrayListQueue<>();
        for(int i=0;i<size;i++)
        {
            tempQueue.enqueue((int)(Math.random() * (max - min + 1) + min));
        }
        return tempQueue;
    }
}
