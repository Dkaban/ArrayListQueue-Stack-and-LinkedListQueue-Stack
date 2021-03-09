//*************************************************************************************
//  ArrayListStack.java
//
//  AUTHOR: DUSTIN KABAN
//  DATE: March 03, 2021
//
//  This class implements a stack using java.util.ArrayList
//*************************************************************************************

import java.util.ArrayList;

public class ArrayListStack<T> implements StackADT<T>
{
    ArrayList<T> arrayList;

    //Constructor for initializing the ArrayList
    public ArrayListStack()
    {
        arrayList = new ArrayList<T>();
    }

    @Override
    public void push(T element)
    {
        //add the element onto the ArrayList
        arrayList.add(element);
    }

    @Override
    public T pop()
    {
        //Throw exception if the array is empty, else remove the last element
        if(size() == 0)
            throw new EmptyCollectionException("ArrayListStack");
        else
            return arrayList.remove(arrayList.size() -1);
    }

    @Override
    public T peek()
    {
        //Throw exception if the array is empty, else retrieve the first element
        if(arrayList.isEmpty())
            throw new EmptyCollectionException("ArrayListStack");
        return arrayList.get(0);
    }

    @Override
    public boolean isEmpty()
    {
        return size() == 0;
    }

    @Override
    public int size()
    {
        return arrayList.size();
    }

    @Override
    public String toString()
    {
        //We display Empty if the arrayList has no elements, else we use a [ , ] format for readability
        if(arrayList.isEmpty()) return "Empty";

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
