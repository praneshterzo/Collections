import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Collectionmodel {
    public static void show() {
        Collection<String> collection= new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);
        Collections.addAll(collection,"d","e","f");
        System.out.println(collection);
        System.out.println(collection.contains("d"));
        System.out.println(collection.contains("u"));
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        String [] stringArray = collection.toArray(new String[0]);
        System.out.println(stringArray);
    }
}
