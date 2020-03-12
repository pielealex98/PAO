import java.util.Arrays;

public class Queue {
    private int arr[];
    private int size;
    private int first;
    private int last;

    public Queue() {
        size = 100;
        arr = new int[size];
        first = 0;
        last = 0;
    }

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        first = 0;
        last = 0;
    }

    public void push(int item) {
        if(last - first == size)
            System.exit(1);
        arr[last++] = item;
        return;
    }

    boolean isEmpty() {
        if (last == first)
            return true;
        return false;
    }

    public int pop() {
        if (isEmpty()) {
            System.exit(1);
        }
        first = first + 1;
        return arr[first - 1];
    }

    public String toString() {
        return last - first + " " + Arrays.toString(arr);
    }

    public static void main(String[] args) {
       Queue q = new Queue(5);
       q.push(4);
       q.push(3);
       System.out.println(q.toString());
    }
}