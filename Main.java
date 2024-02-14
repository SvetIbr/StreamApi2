import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int n = 10; // Вычисление факториала для числа 10

        long result;
        try (ForkJoinPool forkJoinPool = new ForkJoinPool()) {
            FactorialTask factorialTask = new FactorialTask(n);

            result = forkJoinPool.invoke(factorialTask);
        }

        System.out.println("Факториал " + n + "! = " + result);
    }
}