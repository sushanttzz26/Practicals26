class Practical8 {
    public static void main(String[] args) {
        int[] stack = new int[5];
        int top = -1;

        stack[++top] = 10;
        stack[++top] = 20;
        System.out.println("Pop: " + stack[top--]);
        System.out.println("Peek: " + stack[top]);

        int[] queue = new int[5];
        int front = 0, rear = -1;

        queue[++rear] = 100;
        queue[++rear] = 200;
        System.out.println("Dequeue: " + queue[front++]);
        System.out.println("Front: " + queue[front]);
    }
}
