package Array_Program;

public class StackOverflowDemo
{

    public static void infiniteRecursion() {
        infiniteRecursion();
    }

    public static void main(String[] args) {
        infiniteRecursion();
    }
}
