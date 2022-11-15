import java.util.ArrayList;

public class MyList<T extends Number> {
    ArrayList<T> myArrayList = new ArrayList<T>();

    public void add(T element) {
        myArrayList.add(element);
    }

    public T largest() {
        T element = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).doubleValue() > element.doubleValue()) {
                element = myArrayList.get(i);
            }
        }
        return element;
    }

    public T smallest() {
        T element = myArrayList.get(0);
        for (int i = 1; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).doubleValue() < element.doubleValue()) {
                element = myArrayList.get(i);
            }
        }
        return element;
    }
}

