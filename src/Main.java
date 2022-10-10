public class Main {


    public static void main(String[] args) {

     /*   System.out.println("Hello world!");

        byte myByteVariable = 100;
        String myString = " ceva ";

        System.out.println(myByteVariable);

        myByteVariable += 21; // myByteVariable = myByteVariable + 2;

        System.out.println(myByteVariable);

        int x = myByteVariable + 2;
        System.out.println(myByteVariable);
        System.out.println(x);

        int z = x + myByteVariable;

        System.out.println("valoarea z: " + z);
        System.out.println(100 + 200);

        System.out.println("rezultatul este: " + (x + 100 + 200));

       

        String author = "Cosmin" + "" + " " + "";
        int duration = 20;
        int nrCursanti = 15;
        int nrCursantiFizic = 4;


        String poveste = author + " pleaca la cursul QA29 la ora 17:00 de acasa, pe ruta\n" +
                "Turda - Cluj. Pe drum, " + author + " face " + duration + " de minute. Cursul de azi este de Java,\n" +
                "si va tine 3 ore. La curs au fost 20 de cursanti. Din acesti 20 de cursanti, 4 au fost\n" +
                "fizic, iar restul de " + (nrCursanti - nrCursantiFizic) + " au fost online. Lui " + author + " ii place tare mult cursul de Java.";
        System.out.println(poveste);


        int i = 2;
        i += i += i++ + ++i;
        System.out.println(i++);
        System.out.println(i); */

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




