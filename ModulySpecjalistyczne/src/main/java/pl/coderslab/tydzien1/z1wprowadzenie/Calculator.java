package pl.coderslab.tydzien1.z1wprowadzenie;

public class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
    static int addExpert(int a, int b) {
        if (a+b<a||a+b<b) {
            throw new ArithmeticException("lipa");
        }
        return a + b;
    }
    static int multiply(int a, int b) {
        return a*b;
    }
    static int subtract (int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(addExpert(Integer.MAX_VALUE, 1));
    }
}