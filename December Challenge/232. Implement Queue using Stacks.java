//Method-1 mine;)
class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> helper;
    
    public MyQueue() {
        stack = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        while(!stack.isEmpty()) helper.push(stack.pop());
        stack.push(x);
        while(!helper.isEmpty()) stack.push(helper.pop());
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}


//Method-2

class MyQueue {

  Stack<Integer> s1;
  Stack<Integer> s2;
  public MyQueue(){        //initializing stack
     s1 = new Stack<>();
     s2 = new Stack<>();
  }
  
  // Push element x to the back of queue.
  public void push(int x) {
    s1.push(x);
  }
  
  // Removes the element from in front of queue.
  public int pop() {
    peek();
    return s2.pop();
  }
  
  // Get the front element.
  public int peek() {
    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
    
    return s2.peek();
  }
  
  // Return whether the queue is empty.
  public boolean empty() {
    return s1.isEmpty() && s2.isEmpty();
  }
}
=
