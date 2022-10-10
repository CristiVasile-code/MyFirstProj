public class Main {


    public static void main(String[] args) {


        int x = 2;
        int y = 5;

        int z = sum(x, y);
        System.out.println(z);

        float a = substract(x, y);
        System.out.println(a);
        a = divide(x,y);
        System.out.println(a);
        a = multi(x,y);
        System.out.println(a);

    }

    public static int sum(int first, int second) {
        int result = first + second;
        return result;
    }

    public static float substract(float first, float second){
        float result = first - second;
        return result;
    }

    public static float divide(float first,float second){
        float result = first / second;
        return result;
    }

    public static float multi(float first, float second){
        float result = first * second;
        return result;
    }
}




