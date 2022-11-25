public class Main6 {
    public static void main(String[] args) {
        Read read = new Read();
        LogicalOperations op = new LogicalOperations();
       // read.getInt();
        int[] myArray2 = read.getArrayOfNumbers(3);
        op.printArray(myArray2);

    }
}
