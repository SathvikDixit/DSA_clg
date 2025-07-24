import java.util.*;

public class StackPractice {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        for(int i = 10; i<=15; i++) {
            st.push(i);
        }
        // st.push(10);
        // st.push(11);
        // st.push(12);
        // st.push(13);
        // st.push(14);
        // st.push(15);
        int n = st.size();
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(n);

        // for(int i = 0; i < n; i++) {
        //     System.out.print(" "+st.pop());
        // }    // here we are remving the values in the stack, now we'll not be having any element in the stack so

        System.out.println("This is from st: "+st);

        for(int i = st.size(); i > 0; i--) {
            st1.push(st.peek());
            st.pop();
        }
        System.out.println("This is from st1"+st1);
        System.out.println("This is from st"+st);

        while(!st1.isEmpty()) {
            st.push(st1.peek());
            st1.pop();
        }
        System.out.println("This is from st once again: "+st);


        for(int i = 0; i < 3; i++) {
            st1.push(st.peek());
            st.pop();
        }
        System.out.println("I'm printing your 3rd value from st: "+st.peek());
        while (!st1.isEmpty()) {
            st.push(st1.peek());
            st1.pop();
        }
        System.out.println("this is from st: "+st);
    }
}
