package oop.labor08.lab8_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {


    private final int capacity;

    public StackInheritance( int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return super.size()==capacity;
    }

    public boolean isEmpty(){
        return super.size()==0;
    }

    public void push(Object obj){
        if(!isFull()){
            super.add(obj);
        }
    }

    public void pop(){
        super.remove(super.size()-1);
    }

    public Object top(){
        if(!isEmpty()){
            return super.get(super.size()-1);
        }
        return null;
    }

    public int getSize(){
        return super.size();
    }

}

