public class Main2 {
    public static void main(String[] args) {

        int first = 10;
        int second = 30;

       LogicalOperations op = new LogicalOperations();
        System.out.println(op.checkBiggerNumber(first, second));
        String textInput = "kFastTrack";
        int numberInput = 4;
        System.out.println(op.FastTrack("FastTrack"));
        System.out.println(op.FS(textInput, numberInput));
        System.out.println(op.Snow(6));
        System.out.println(op.threeOrFour(5));
        op.whatNumberIsThis(3);
        System.out.println(op.isNumberEven(2));
        System.out.println(op.isEligibileToVote(19));
        System.out.println(op.bigger(1,5,3));
    }

}
