package oop.labor09.IQueue;

import java.util.ArrayList;

public class ArrayListQueue implements IQueue {

    private ArrayList<Object> items = new ArrayList<>();
    private final int CAPACITY;

    public ArrayListQueue(int capacity) {
        CAPACITY = capacity;
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object newObj) {
        if(!isFull()){
            items.add(newObj);
        }
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            Object temp = items.get(0);
            items.remove(0);
            return temp;
        }
        return null;
    }

    @Override
    public void printQueue() {
        if(!isEmpty()){
            for(Object object : items){
                System.out.println(object);
            }
        }
        else{
            System.out.println("Queue is empty");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                                         //az elso harom sor mindig ott van
        if (o == null || this.getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        if(this.items.size() != that.items.size()) return false;
        for(int i = 0; i < this.items.size(); ++i){
            if(!this.items.get(i).equals( that.items.get(i))) return false;
        }
        return true;
    }


}
