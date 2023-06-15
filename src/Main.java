public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        var iterator = list.iterator();
        list.add("a");
        list.add("b");
        while(iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }
    }
}