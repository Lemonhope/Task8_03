
package Task8_03;

import java.util.ArrayList;

public class Main {
    public static void doubleValues(ArrayList<String> words) {
        int n= words.size();
        for (int i = 0; i <n; i++) {
            words.add(2*i, words.get(2*i));
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
