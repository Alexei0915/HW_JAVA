package hw_1_java.hwork6;
import java.util.*;

public class task {
    public static void main(String[] args) {
        SetFromTreeMap set1 = new SetFromTreeMap();
        System.out.println(set1);

        set1.add("red");
        set1.add("blue");
        set1.add("one");
        set1.add("London");
        set1.add("two");
        set1.add("world");
        set1.add("time");
        set1.add("task");

        System.out.println("Множество 1: " + set1.read());
        System.out.printf("Размер множества 1: " + set1.getSize() + "\n");

        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Set<String> set2 = new TreeSet<>();
        set2.add("red");
        set2.add("blue");
        set2.add("one");
        set2.add("London");
        set2.add("two");
        set2.add("world");
        set2.add("time");
        set2.add("task");

        System.out.println("Множество 2: " + set2);

        SetComparator setComp = new SetComparator();
        TreeSet<String> set3 = new TreeSet<>(setComp);
        set3.add("red");
        set3.add("blue");
        set3.add("one");
        set3.add("London");
        set3.add("two");
        set3.add("world");
        set3.add("time");
        set3.add("task");

        System.out.println("Множество 3: " + set3);

    }

}
class SetFromTreeMap implements Iterable<String> {
    private static final Map<String, Object> MAPINTERNAL = new TreeMap<>();
    private static final Object OBJ = new Object();

    public void add(String str) {
        MAPINTERNAL.put(str, OBJ);
    }

    public int getSize() {
        return MAPINTERNAL.size();
    }

    public String read() {
        return MAPINTERNAL.keySet().toString();
    }

    @Override
    public String toString() {
        String res = "";
        for (String element : MAPINTERNAL.keySet()) {
            res += element.toString() + ", ";

        }
        return res;
    }

    @Override
    public Iterator<String> iterator() {
        return MAPINTERNAL.keySet().iterator();

    }

}
class SetComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
    
}
