package oop.labor09.Queue;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        IQueue queue = new ArrayListQueue( 5 ); // new CircularQueue( 5 );
        Random rnd = new Random();
        for( int i=0; i<100; ++i ){
            int value = rnd.nextInt(100);
            if( value < 50 ){
                System.out.println("Add: " + i);
                queue.enQueue( i );
            } else{
                if(queue.isEmpty()){
                    System.out.println("Cannot delete from an empty queue");
                }else {
                    int element = (Integer) queue.deQueue();
                    System.out.println("Deleted: " + element);
                }
            }
            queue.printQueue();
        }

        IQueue q1  =new ArrayListQueue(5);
        IQueue q2 = new ArrayListQueue(10);

        for(int i=0;i<5;i++){
            q1.enQueue(i);
            q2.enQueue(i);
        }

        q1.printQueue();
        q2.printQueue();

        System.out.println(q1.equals(q2));

        IQueue q3 = new CircularQueue(5);
        IQueue q4 = new CircularQueue(10);

        for(int i=0;i<5;i++){
            q3.enQueue(i);
            q4.enQueue(i);
        }

        q3.printQueue();
        q4.printQueue();

    }
}