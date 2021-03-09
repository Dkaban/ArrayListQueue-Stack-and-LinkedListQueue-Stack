//*************************************************************************************
//  LinkedListStackDriver.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: March 01, 2021
//
//  Implements the StackADT class and adds functionality for the LinkedList to function
//  like a stack.
//*************************************************************************************

import java.util.LinkedList;

public class LinkedListStack<T> implements StackADT<T>
{
    LinkedList<T> linkedList;

    public LinkedListStack()
    {
        linkedList = new LinkedList<>();
    }

    @Override
    public void push(T element)
    {
        linkedList.add(element);
    }

    @Override
    public T pop()
    {
        if(size() == 0)
            throw new EmptyCollectionException("linkedListStack");
        else
            return linkedList.remove(size()-1);
    }

    @Override
    public T peek()
    {
        if(linkedList.isEmpty())
            throw new EmptyCollectionException("LinkedListStack");
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
