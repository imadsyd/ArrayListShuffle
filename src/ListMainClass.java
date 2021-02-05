import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMainClass {

    public static void main(String[] args) {

        List<Integer> arrayListOfIntegers = new ArrayList();
        arrayListOfIntegers.add(1);
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(3);
        arrayListOfIntegers.add(4);

        System.out.println(arrayListOfIntegers);
        Collections.shuffle(arrayListOfIntegers);
        System.out.println(arrayListOfIntegers);

    }
}
