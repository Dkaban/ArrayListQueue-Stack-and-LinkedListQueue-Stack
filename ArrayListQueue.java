//*************************************************************************************
//  ArrayListQueue.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: March 09, 2021
//
//  This class implements the QueueADT class and a stack using java.util.ArrayList
//*************************************************************************************

import java.util.ArrayList;

public class ArrayListQueue<T> implements QueueADT<T>
{
    ArrayList<T> arrayList;

    //Constructor to initialize the ArrayList
    public ArrayListQueue()
    {
        arrayList = new ArrayList<>();
    }

    @Override
    public void enqueue(T element)
    {
        //add an element to the arraylist
        arrayList.add(element);
    }

    @Override
    public T dequeue()
    {
        //We check to see if the list is empty, if it is throw an exception else remove the element at index 0
        if(size() == 0)
            throw new EmptyCollectionException("ArrayListQueue");
        return arrayList.remove(0);
    }

    @Override
    public T first()
    {
        //Check to see if the array is emppty, else we get the element at index 0
        if(size() == 0)
            throw new EmptyCollectionException("ArrayListQueue");
        return arrayList.get(0);
    }

    @Override
    public boolean isEmpty()
    {
        //Return true or false if arrayList is empty or not.
        return arrayList.isEmpty();
    }

    @Override
    public int size()
    {
        //return the size of the arraylist
        return arrayList.size();
    }

    @Override
    public String toString()
    {
        //If the arraylist is empty, return Empty. Else we want it to be readable, so comma separated with [ ].
        if(isEmpty()) return "Empty";

        String listOutput = "[";
        for(int i=0;i<arrayList.size();i++)
        {
            if(i == arrayList.size()-1)
            {
                listOutput += arrayList.get(i) + "]";
            }
            else
            {
                listOutput += arrayList.get(i) + ",";
            }
        }
        return listOutput;
    }
}
