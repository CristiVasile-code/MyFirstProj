import java.util.ArrayList;
import java.util.Collections;

public class main5 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        ArrayList<String> stringList = op.stringPopulate();
        ArrayList<Integer> list = op.Populate();
        System.out.print(op.sortList(list));
        ArrayList<Integer> listaInt = op.Populate();
        System.out.println(op.listaPare(listaInt));
    }
}
