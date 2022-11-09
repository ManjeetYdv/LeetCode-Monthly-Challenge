class StockSpanner {
    
private class Stocks{
    int price;
    int span;
    Stocks(int price ,int span){
        this.price = price;
        this.span = span;
    }
}
    
    Stack<Stocks> stack;
    public StockSpanner(){
        stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;
        while(!stack.isEmpty() && stack.peek().price<=price){
            span +=stack.peek().span;
            stack.pop();
        }
        stack.push(new Stocks(price , span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
