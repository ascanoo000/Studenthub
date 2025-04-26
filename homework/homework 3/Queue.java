private double[] elements;
private int size;
private int front;
private int rear;
private int capacity;

public Queue() {
    capacity = 8;
    elements = new double[capacity];
    size = 0;
    front = 0;
    rear = -1;
}
public void enqueue(double v) {
    if (size == capacity) {
        double[] newElements = new double[capacity * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(front + i) % capacity];
        }
        elements = newElements;
        front = 0;
        rear = size - 1;
        capacity *= 2;
    }
    rear = (rear + 1) % capacity;
    elements[rear] = v;
    size++;
}

public double dequeue() {
    if (empty()) {
        throw new IllegalStateException("Queue is empty");
    }
    double temp = elements[front];
    front = (front + 1) % capacity;
    size--;
    return temp;
}

public boolean empty() {
    return size == 0;
}

public int getSize() {
    return size;
}

public int getSize() {
    return size;
}

public static void main(String[] args) {
    Queue queue = new Queue();

    for (int i = 1; i <= 20; i++) {
        queue.enqueue(i);
        System.out.println("Enqueued: " + i);
        queue.printQueue();
    }
    
    while (!queue.empty()) {
        System.out.println("Dequeued: " + queue.dequeue());
        queue.printQueue();
    }
}