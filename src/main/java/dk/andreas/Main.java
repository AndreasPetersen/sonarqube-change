package dk.andreas;

public class Main {

    public static void main(String[] args) {
        notTested();
        tested();
    }

    public static void notTested() {
        System.out.println("I am not a tested method");
        System.out.println("Here are some untested lines:");
        System.out.println(1);
        System.out.println(2);
    }

    public static boolean tested() {
        return true;
    }
}

