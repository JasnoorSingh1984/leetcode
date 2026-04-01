class SpecialStack {
    Stack<Integer> min;
    Stack<Integer> st;
    public SpecialStack() {
        st=new Stack<>();
        min=new Stack<>();
    }

    public void push(int x) {
        st.push(x);
        
        if (min.isEmpty()){
            min.push(x);
        }else{
            min.push(Math.min(x,min.peek()));
        }
    }

    public void pop() {
        if (st.isEmpty()){
            return ;
        }
        
        min.pop();
        st.pop();
    }

    public int peek() {
        if (st.isEmpty()){
            return -1;
        }
        return st.peek();
    }

    boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMin() {
        if (st.isEmpty()){
            return -1;
        }
        return min.peek();
    }
}