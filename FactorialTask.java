import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Long> {
    private final long num;
    FactorialTask(long num){
        this.num = num;
    }

    @Override
    protected Long compute() {
        if(num <= 1) return 1L;
        FactorialTask task = new FactorialTask(num-1);
        task.fork();
        return num * task.join();
    }
}
