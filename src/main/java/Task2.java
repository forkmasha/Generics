import java.util.ArrayList;
import java.util.Comparator;

public class Task2 <T extends Comparable> {
    ArrayList<T> myArrayList = new ArrayList<>();

    public void add(T element) {
        myArrayList.add(element);
    }
    public ArrayList<T> getVal() {
        return myArrayList;
    }


    public void printArray() {
        System.out.println("Array: " + myArrayList);

    }
}
