//*************************************************************************************
//  LinkedListQueue.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: March 09, 2021
//
//  This class implements a stack using java.util.LinkedList
//*************************************************************************************

import java.util.LinkedList;

public class LinkedListQueue<T> implements QueueADT<T>
{
    LinkedList<T> linkedList;

    public LinkedListQueue()
    {
        linkedList = new LinkedList<>();
    }

    @Override
    public void enqueue(T element)
    {
        linkedList.add(element);
    }

    @Override
    public T dequeue()
    {
        if(size() == 0)
            throw new EmptyCollectionException("LinkedListQueue");
        return linkedList.remove();
    }

    @Override
    public T first()
    {
        if(linkedList.isEmpty())
            throw new EmptyCollectionException("LinkedListQueue");
        return linkedList.peek();
    }

    @Override
    public boolean isEmpty()
    {
        return size() == 0;
    }

    @Override
    public int size()
    {
        return linkedList.size();
    }

    @Override
    public String toString()
    {
        if(linkedList.isEmpty()) return "Empty";

        String listOutput = "[";
        for(int i=0;i<linkedList.size();i++)
        {
            if(i == linkedList.size()-1)
            {
                listOutput += linkedList.get(i) + "]";
            }
            else
            {
                listOutput += linkedList.get(i) + ",";
            }
        }
        return listOutput;
    }
}
