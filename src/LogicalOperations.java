import java.util.Arrays;
public class LogicalOperations {
    public int checkBiggerNumber(int first, int second){ //pct. 3
        if(first > second){
            return first;
        }
        else {
            return second;
        }
    }
    public String FastTrack(String text){ //pct. 4
        String res;
        //Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print “Got to try some more”
        if(text.equals("FastTrack")){
              res = "Learning text comparison";
        }
        else{
            res =  "Got to try some more";
        }
        return res;
    }
    public String FS(String textInput, int numberInput){ // pct. 5
        String result="";
        if(textInput.equals("FastTrack") && numberInput <= 3){
            result = textInput + " " + numberInput;
        }
        else if(!textInput.equals("FastTrack") && numberInput >= 4){
            result = numberInput + " " + textInput;
        }

        return result;
    }
    public String Snow(int number){ //pct. 6
        String ret;
        if (number > 8 || number == 6){
            ret = "The amount of snow this winter was(cm): " + number;
        }
        else{
            ret = "The forecast snow is(cm): " + number;
        }
        return ret;
    }
    public String threeOrFour(int number){
        String rez = "";
        if(number > 3 && number != 4){
            rez = "The number is greater than 3 and not equal to 4";
        }
        if(number == 4){
            rez = "The number is equal to 4";
        }
        if(number < 3){
            rez = " The number is lower than 3";
        }
        return rez;
    }
    public void whatNumberIsThis(int number){
        switch (number){
            case 1:
                System.out.println("The number is: 1 !"); break;
            case 2:
                System.out.println("The number is: 2 !"); break;
            case 3:
                System.out.println("The number is: 3 !"); break;
            case 4:
                System.out.println("The number is: 4 !"); break;
            case 5:
                System.out.println("The number is: 5 !"); break;
            case 6:
                System.out.println("The number is: 6 !"); break;
            case 7:
                System.out.println("The number is: 7 !"); break;
            case 8:
                System.out.println("The number is: 8 !"); break;
            case 9:
                System.out.println("The number is: 9 !"); break;
            case 0:
                System.out.println("The number is: 0 !"); break;
            default:
                System.out.println("Nu ai introdus o cifra !");
        }
    }
    public boolean isNumberEven(int number){
        return number % 2 == 0;
    }
    public boolean isEligibileToVote(int number){
        return number >= 18;
    }
    public int bigger(int a, int b, int c){
        int bigger;
        if (a > b){
            if (a>c){
                bigger = a;
            }
            else{
                bigger = c;
            }
        }
        else{
            if (b>c){
                bigger = b;}
            else{
                bigger = c;
            }

        }
        return bigger;
    }
    public void deLaXLa100(int x){
        for(int i=x;i <= 100;i++){
            System.out.println(i);
        }
    }
    public void panaLaminus100(int x){
        for(int i=x;i>=-100;i--){
            System.out.println(i);
        }
    }
    public void deLaXlaY(int x, int y){
        if(x < y){
            for(int i=x;i<=y;i++){
                System.out.println(i);
            }
        }
        else if(x > y){
            for(int i=x; i>=y;i--){
                System.out.println(i);
            }
        }
        else
            System.out.println("Numerele sunt egale !");
    }
    public void deLaXlaYtoo(int x, int y){
        if(x > y){
            for(int i=y;i<=x;i++)
                System.out.println(i);
                 }
        else if(y>x){
            for(int i=x;i<=y;i++)
                System.out.println(i);
                    }
        else
            System.out.println("numerele sunt egale");
    }
    public void parePanaLa100(){
        for(int i=2;i<=100;i++)
            if(i%2 == 0) System.out.println(i);
    }
    public void imparePanaLa100(){
        for(int i=1;i<=100;i++)
            if(i%2 != 0) System.out.println(i);
    }
    public int sumaX100(int x){
        int suma=0;
        for(int i = x;i<=100;i++){
            suma = suma + i;
        }
        return suma;
    }
    public float mediaFromNTO100(int x){
        float suma = 0;
        int j = 0;
        float media = 0;
        for(int i=x;i<=100;i++){
            suma = suma + i;
            j++;
        }
        System.out.println(j);
        System.out.println(suma);
        return suma / j;
    }
    public void stars(){
        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");}
            System.out.println();
        }
    }
    public void countTo100(int x){
        while(x<=100){
            System.out.println(x);
            x++;
        }
    }
    public void countTominus100(int x){
        while(x>=-100){
            System.out.println(x);
            x--;
        }
    }
    public void countXtoY(int x, int y){
        while(x<=y){
            System.out.println(x);
            x++;
        }
        while(x>=y){
            System.out.println(y);
            y++;
        }
    }
    public void pareTo100(){
        int i = 2;
        while(i <= 100){
            if(i%2 == 0)
                System.out.println(i);
            i++;
        }
    }
    public void impareTo100(){
        int i = 1;
        while(i<=100){
            if(i%2 != 0)
                System.out.println(i);
            i++;
        }
    }
    public void sumaDivizibilCu7(int x, int y){
        int suma = 0;
        int count = 0;
        float media = 0;
        while(x <= y){
            if(x % 7 == 0){
                suma = suma + x;
                count++;
            }
            x++;
        }
        media = suma / count;
        System.out.println("suma este: " + suma);
        System.out.println(count);
        System.out.println("Media este: " + media);
    }
    public void fibo20(){
        int i = 1;
        int fibominus1 = 1;
        int fibominus2 = 0;
        int fibo = 0;
        String sirFibo ="";
        //System.out.println("0");
        //System.out.println("1");
        while(i <= 18){
            fibo = fibominus1 + fibominus2;
            fibominus2 = fibominus1;
            fibominus1 = fibo;
            //System.out.println(fibo);
            sirFibo = sirFibo + " " + fibo;
            i++;
        }
        System.out.println("0 1" + sirFibo);
    }
    public void CozaLozaWoza(){
        int i = 1;
        // for(int i = 1;i <= 110;i++){
        while(i<=110){
            if(i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                System.out.print("CozaLozaWoza  ");
            }   //
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.print("CozaLoza  ");
            }
            else if(i % 3 == 0 && i % 7 == 0){
                System.out.print("CozaWoza  ");
            }
            else if(i % 5 == 0 && i % 7 == 0){
                System.out.print("WozaLoza  ");
            }
            else if(i % 3 == 0){
                System.out.print("Coza  ");
            }
            else if(i % 5 == 0){
                System.out.print("Loza  ");
            }
            else if(i % 7 == 0){
                System.out.print("Woza  ");
            }
            else{
                System.out.print(i + "  ");
            }
            if(i%11 == 0){
                System.out.println();}
            i++;
        }
    }
    public void array100(){
        int arr[] = new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
    public int[] arrayPare100(int[] arr){
        int index = 0;
        for(int i=1;i<=100;i++){
            if(i % 2 == 0){
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }
    public  boolean esteSauNu(String[] sir, String val){
        boolean comp = true;
        for(String s:sir){
            if(s.equals(val)){
                comp = true;
                break;}
            else
                comp = false;
        }
        return comp;
    }
    public int cePozitie(int[] arr, int val){
        int index = 0, retur = -1;
        for(int p:arr){
            if(p == val){
                retur = index;}
            index++;
        }
        return retur;
    }
    public int sort2nd(int[] arr){
        Arrays.sort(arr);
        return arr[1];

    }
    public int sort2ndDoi(int[] arr){
        int temp = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] >arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }
    public  int[] copy1To2(int[]arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++)
            arr2[i] = arr1[i];
        return arr2;
    }
    public float mediaDinArray(int[]arr){
        int count = 0;
        float suma = 0;
        for(int i=0;i<arr.length;i++){
            suma += arr[i];
            count++;
        }
        return suma/count;
    }
}

