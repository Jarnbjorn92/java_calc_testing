public class Runner {
    public static void main(String[] args) {
    Calculator calculator = new Calculator(4,2,4.44, 2.22);

    System.out.println(calculator.add());
    System.out.println(calculator.subtract());
    System.out.println(calculator.multiply());
    System.out.println(calculator.divide());
    }
}
