public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new StackImpl<>();
        stack.push(3);
        stack.push(4);
        stack.push(1);
        Stack<String> st = new StackImpl<>();
        st.push("ahhhhh");
        String element = st.pop();
    }
}
