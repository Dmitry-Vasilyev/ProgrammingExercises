package ProgrammingExercises.StacksAndQueues.Queue_Array;
/*
Queue_Array
*/


public class Solution {

    public void run() {
        ArrayQueue aq = new ArrayQueue();

        System.out.println(aq.isEmpty());

        for(int i = 1; i < 9; i++) {
            aq.add(i);
        }
        System.out.println(aq);

        aq.poll();
        aq.poll();

        System.out.println(aq);

        aq.add(9);
        aq.add(10);

        System.out.println(aq);

        for(int i = 0; i < 8; i++) {
            aq.poll();
        }

        System.out.println(aq);

        aq.add(1);

        System.out.println(aq);
    }


}

class ArrayQueue  {

    private int[] data;

    private int head, tail;

    ArrayQueue() {
        data = new int[8];
        tail = head = -1;
    }

    public void add(int item) {
        if(tail == -1 && head == -1) head = 0;
        tail = ++tail%data.length;
        data[tail] = item;
    }

    public int poll() {
        int oldHead = head;
        if(oldHead == tail) {
            head = -1;
            tail = -1;
         } else {
            head = ++head%data.length;
        }
        return data[oldHead];
    }
    public int peek() {
        return data[head];
    }
    public boolean isEmpty() {
        return tail == -1 && head == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(isEmpty()) {
            sb.append("]");
            return sb.toString();
        }
        int i = head;
        while(i!=tail) {
            sb.append(data[i]);
            i = ++i%data.length;
        }
        sb.append(data[i]);
        sb.append("]");
        return sb.toString();
    }
}
