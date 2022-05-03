package oop.labor09.Queue;

public class CircularQueue implements IQueue{

    private int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;

    //Constructor
    public CircularQueue(int cap){
        this.CAPACITY = cap;
        this.front = -1;
        this.rear = -1;
        items = new Object[cap];
    }

    //Methods
    @Override
    public void enQueue(Object obj) {
        if(!isFull()) {
            this.rear++;
            items[((this.rear))%this.CAPACITY] = obj;
        }
    }

    @Override
    public Object deQueue() {
        if(!isFull()){
            this.front++;
            return this.items[(front)];
        }
        return null;
    }

    @Override
    public void printQueue() {
        if (!isEmpty()) {
            System.out.print("[");
            for(int i=this.front;i<this.rear;i++) {
                System.out.print(" "+items[i]);
            }
            System.out.print("]");
            System.out.println();
        } else {
            System.out.println("The Queue is empty!");
        }
    }

    @Override
    public boolean isEmpty() {

        return this.front == -1;

    }

    @Override
    public boolean isFull() {
        if((this.front==0 && this.rear == items.length) || this.front-1==this.rear){
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularQueue that = (CircularQueue) o;
        if(items.length != that.items.length){
            return false;
        }
        for(int i=this.front;i<this.rear;i++){
            if(this.items[i]!=that.items[i]){
                return false;
            }
        }

        return true;
    }
}
