public class Main {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int x = 2;
        int y = 5;

        float a = calc.sum(x, y);
        System.out.println(a);
        a = calc.substract(x, y);
        System.out.println(a);
        a = calc.divide(x, y);
        System.out.println(a);
        a = calc.multi(x, y);
        System.out.println(a);

    }
}





