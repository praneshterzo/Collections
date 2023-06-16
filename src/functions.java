import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class functions{
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("x");
        list.add("y");
        list.add("z");
        System.out.println(list);
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);
        list.add(0,"e");
        System.out.println(list.set(0,"pranesh"));
        System.out.println(list.indexOf("v"));
    }
}