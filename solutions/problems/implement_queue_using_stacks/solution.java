class MyQueue {
    Deque<Integer> instack;
    Deque<Integer> outstack;

    public void move() {
        while (!(instack.isEmpty())) {
            outstack.push(instack.pop());
        }
    }

    public MyQueue() {
        instack = new ArrayDeque<>();
        outstack = new ArrayDeque<>();
    }

    public void push(int x) {
        instack.push(x);

    }

    public int pop() {
        if (!(outstack.isEmpty())) {
            return outstack.pop();
        } else {
            move();
            return outstack.pop();
        }
    }

    public int peek() {
        if (!(outstack.isEmpty())) {
            return outstack.peek();
        } else {
            move();
            return outstack.peek();
        }
    }

    public boolean empty() {
        return (outstack.isEmpty() && instack.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */