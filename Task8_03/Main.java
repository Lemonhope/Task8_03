
package Task8_03;

import java.util.ArrayList;

public class Main {
    public static void doubleValues(ArrayList<String> words) {
        String temp=null;
        for (int i = 0; i <words.size(); i++) {
            temp=words.get(i).concat(", "+words.get(i));
            words.set(i, temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        myList.add("dd");
        myList.add("ee");
        doubleValues(myList);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
