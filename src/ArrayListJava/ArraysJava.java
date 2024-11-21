package ArrayListJava;

import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args) {
        //int[] myArray = new int[10];
//        OR
        String[] myArray2 =  {"Narayana", "Sanjay", "Chavan"};
        for (String str : myArray2) {
            System.out.print(str + " ");
        }
        myArray2[0] = "Nitin";
        //do not use enhanced for loop here
        for (int i = 0; i < myArray2.length; i++) {
            System.out.print(myArray2[i] + " ");
        }


    }

}
