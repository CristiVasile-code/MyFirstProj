public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        byte myByteVariable = 100;
        String myString = " ceva ";

        System.out.println(myByteVariable);

        //myByteVariable += 2; // myByteVariable = myByteVariable + 2;

        System.out.println(myByteVariable);

        int x = myByteVariable + 2;
        System.out.println(myByteVariable);
        System.out.println(x);

        int z = x + myByteVariable;

        System.out.println("valoarea z: " + z);
        System.out.println(100 + 200);

        System.out.println("rezultatul este: " + (x + 100 + 200));

        double a = 123123.123;
        float q = 123.123F;

        long o = 12311231231231L;

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
        System.out.println(i);



    }

}


