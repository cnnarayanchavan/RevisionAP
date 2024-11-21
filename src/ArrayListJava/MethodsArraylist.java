package ArrayListJava;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsArraylist {
    public static void main(String[] args) {

        //1st
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Narayana");
        arrList.add("Alex");
        arrList.add("john");
        System.out.println(arrList);

        //2nd
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(12,23,34,45,56,67));
        System.out.println(list2);
    }

}

