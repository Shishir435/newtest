import java.lang.reflect.Array;
import java.util.Arrays;

public class StringOperation {
    public static void main(String[] args) {
        String name = "Ra+m+a+n";
//        String [] arrName = name.split(":");
        String [] arrName = name.split("\\+", 2); // to limit the search for : here it will only search till the first group of the string and rest will be added after second group;

        System.out.println(Arrays.toString(arrName));
    }
}
