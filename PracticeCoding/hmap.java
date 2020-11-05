import java.util.*;

public class hmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <Integer,String> map = new HashMap<>();

        map.put(1,"Adnan");
        map.put(2, "Angelo");
        map.put(3, "Zaid");
        map.put(4, "Nipun");
        int n = sc.nextInt();
        // System.out.println(map.get(n));
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        if(list.contains(n))
        System.out.println("True");
    }
}
