public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // == 3
        int b = calc.minus.apply(1, 1); // тут получается 0 (ноль)
//        int c = calc.devide.apply(a, b); // ошибка из-за того, что делить на ноль нельзя

//        calc.println.accept(c);

        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }
}