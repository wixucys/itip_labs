public class Stack<T> {
    private T[] data;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity]; // Небезопасное приведение типов, но общепринятое решение для обобщенных массивов
        size = 0;
    }

    public void push(T element) {
        if (size == capacity) {
            throw new IllegalStateException("Стек переполнен");
        }
        data[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        
        T el = data[size - 1];
        size--;

        return el;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        // System.out.println(stack.pop());
        stack.push(2);
        // System.out.println(stack.getSize());
        // System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        // System.out.println(stack.peek());
        stack.push(4);
        // System.out.println(stack.peek());

        // try{
        //     System.out.println(new Stack<>(0).pop());
        // } catch (IllegalStateException e){
        //     System.out.println("Обработка исключения: " + e.getMessage());
        // }
    }
}
