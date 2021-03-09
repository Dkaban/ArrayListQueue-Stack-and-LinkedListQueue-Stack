//*************************************************************************************
//  LinkedListQueueDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  ID: T00663749
//  DATE: March 09, 2021
//  COURSE: COMP 2231, ASSIGNMENT 3: QUESTION 3
//
//  This is the driver class of LinkedListQueue to demonstrate a linked list as a queue
//*************************************************************************************

public class LinkedListQueueDriver
{
    public static void main(String[] args)
    {
        //Display to the user enqueuing elements in the LinkedListQueue
        System.out.println("----------------------------------------------");
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        linkedListQueue.enqueue(1);
        System.out.println("Enqueue 1: " + linkedListQueue.toString());
        linkedListQueue.enqueue(5);
        System.out.println("Enqueue 5: " + linkedListQueue.toString());
        linkedListQueue.enqueue(8);
        System.out.println("Enqueue 8: " + linkedListQueue.toString());
        linkedListQueue.enqueue(11);
        System.out.println("Enqueue 11: " + linkedListQueue.toString());
        linkedListQueue.enqueue(4);
        System.out.println("Enqueue 4: " + linkedListQueue.toString());

        //For creating an X size LinkedListQueue for testing
        //linkedListQueue = createLinkedListQueueOfGivenSize(1000);
        //System.out.println("LinkedListQueue: " + linkedListQueue.toString());

        //Display to the user the functionality of the LinkedListQueue
        System.out.println("----------------------------------------------");
        System.out.println("Size: " + linkedListQueue.size());
        System.out.println("First: " + linkedListQueue.first());
        System.out.println("Dequeue: " + linkedListQueue.dequeue());
        System.out.println("LinkedListQueue: " + linkedListQueue.toString());
        System.out.println("Size: " + linkedListQueue.size());
        System.out.println("Is Empty: " + linkedListQueue.isEmpty());
        System.out.println("----------------------------------------------");
    }

    //Populates an ArrayListQueue with a given number of elements ranging in values from 1 to 1000
    public static LinkedListQueue<Integer> createLinkedListQueueOfGivenSize(int size)
    {
        int max = 1000, min = 1;
        LinkedListQueue<Integer> tempQueue = new LinkedListQueue<>();
        for(int i=0;i<size;i++)
        {
            tempQueue.enqueue((int)(Math.random() * (max - min + 1) + min));
        }
        return tempQueue;
    }
}
