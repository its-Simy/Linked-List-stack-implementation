public class Main {
    public static void main(String[] args) {

LinkedListStack lstack = new LinkedListStack();

lstack.push(5);
System.out.println(lstack.peek());//makes first element 5

lstack.push(10);
System.out.println(lstack.peek());//makes the first element 5

lstack.pop();
System.out.println(lstack.peek());//removes the first element, makes second element the first one




    }
}
