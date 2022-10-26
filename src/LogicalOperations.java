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

}
