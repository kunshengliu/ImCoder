package jianzhiofffer.stack1;

import java.util.Stack;
/**
 * 制造一个能够获得最小元素的栈
 * @author lliukunsheng
 *
 */
public class Main {
	Stack<Integer> stack = new Stack<>();
    Stack<Integer> min  =new Stack<>();
    public void push(int node) {
        stack.push(node);
        if(min.isEmpty()){
            min.push(node);
        }else{
            //
           if(min.peek()>=node){
               min.push(node);
           }else{
               min.push(min.peek());
           }
        }
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return min.peek();
    }
}
