import java.util.ArrayList;
import java.util.Collections;
public class Main2 {
    public static void main(String[] args) {

        int first = 10;
        int second = 30;

       LogicalOperations op = new LogicalOperations();
        /*System.out.println(op.checkBiggerNumber(first, second));
        String textInput = "kFastTrack";
        int numberInput = 4;
        System.out.println(op.FastTrack("FastTrack"));
        System.out.println(op.FS(textInput, numberInput));
        System.out.println(op.Snow(6));
        System.out.println(op.threeOrFour(5));
        op.whatNumberIsThis(3);
        System.out.println(op.isNumberEven(23));
        System.out.println(op.isEligibileToVote(19));
        System.out.println(op.bigger(1,5,3));*/
        /* for loops pct1 :
         op.deLaXLa100(80);
        //for loops pct2 :
        op.panaLaminus100(3);
        //for loops pct3 :
        op.deLaXlaY(36,20);
        //for loops pct4 :
        op.deLaXlaYtoo(1,10);
        //for loops pct5 :
        op.parePanaLa100();
        //for loops pct6 :
        op.imparePanaLa100();
        //for loops pct7:
        System.out.println(op.sumaX100(60));
        //for loops pct8:
        System.out.println("Media numerelor este: " + op.mediaFromNTO100(23));*/
        //op.stars();
        //op.countTo100(80);
        //op.countTominus100(20);
        //op.countXtoY(44,20);
        //op.pareTo100();
        //op.impareTo100();
        //op.sumaDivizibilCu7(3,200);
        //op.fibo20();
        //op.CozaLozaWoza();
        //op.array100();
        // pct 3 :
        /*int [] array = new int[100];
        for(int n:op.arrayPare100(array))
            if(n != 0)
                System.out.print(n + " ");*/
        //pct 4
        /* int[] arrayNumere = {1,3,2,4,5,7};
        float media = op.mediaDinArray(arrayNumere);
        System.out.println(media); */
        //pct 5.
        /*String[] sir = {"alb","galben","verde","rosu","albastru","magenta"};
        String val = "magenta";
        System.out.println(op.esteSauNu(sir, val));*/
        //pct 6.
        /* int[] array = {1,3,5,7,9,10};
        int valoare = 7;
        int rezultat = op.cePozitie(array, valoare);
        if(rezultat != -1)
            System.out.println("Pozitia in array a numarului cautat este: " + rezultat);
        else
            System.out.println("Numarul " + valoare + " nu se afla in array."); */
        //pct. 9
        // int[] array = {10,2,31,14,5,6,7,18,9};
/*        System.out.println(op.sort2nd(array));
        // altfel, folosind doar bucla for
         int[] array = {10,2,31,14,5,6,7,18,9};
        System.out.println(op.sort2ndDoi(array));*/
        //pct. 10
        /* int[] array1 = {1,2,3,4,5,6};
        int[]array2 = new int[6];
        for(int x:op.copy1To2(array1, array2))
            System.out.print(x + " "); */
        // pct. 8
        /*int[]array = {1,2,3,4,5,6};
        int numar = 3;
        for(int n:op.arrayFaraNumar(array, numar))
        System.out.print( n + " "); */
        // ---- tema arrays optionala pct2
        //int[] array = {10,2,31,14,5,6,7,18,9};
       // op.primulUltimul(array);
        //----tema arrays optionala pct 3
        /*int[]array = {1,2,3,4,5,6};
        for(int n:op.invers(array))
            System.out.print(n + " "); */
        //----- tema arrays optionala pct 4
        /*int[]array = {1,2,4,6,4,4,2,5,8};
        int count = 0;
        for(int n:op.duplicate(array)) {
            if(n != 0){
                System.out.print(n + " ");
                count++;
            }
        }
        if(count == 0)
            System.out.println("nici o dublura");
        System.out.println("nr de dubluri este: " + count);

         */
        ArrayList<Integer> listOne = op.Populate();
        System.out.print(listOne);
        System.out.println();
        op.addToList(listOne,77);
        System.out.println();
        op.fromIndex(listOne,3);
        System.out.println();
        op.invers(listOne);
        System.out.println();
        ArrayList<String> stringList = op.stringPopulate();
        op.stringToPoz(stringList, 3, "bla");
        op.primulInLista(listOne,3);
        op.biggerInList(listOne);
    }


}
