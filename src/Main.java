import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<String> kolejka = new PriorityQueue<>();
        kolejka.add("pierwszy");
        kolejka.add("drugi");
        System.out.println(kolejka.remove()); //wypisze "pierwszy"

        List<String> c1 = new ArrayList<String>();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("6");


        ArrayList<String> c2 = new ArrayList<>();
        c2.add("1");
        c2.add("3");
        c2.add("6");
        c2.add("8");
        c2.add("10");
        c2.add("1");


        System.out.println("czy elementy z listy c1 zawieraja te same elementy co z listy c2");
        ArrayList<String> c3 = new ArrayList<>();
        for (String e : c1)
            c3.add(c2.contains(e) ? " yes" : "no");

        System.out.println(c3);
        System.out.println();


        System.out.println("zamiana elementow w liscie");
        Collections.swap(c1, 0, 3);

        System.out.println(c1);
        System.out.println();

        System.out.println("polaczenie dwoch list w jedno");

        ArrayList<String> a = new ArrayList<>();
        a.addAll(c1);
        a.addAll(c2);

        System.out.println(a);
        System.out.println();
    }
}

