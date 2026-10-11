package Practice;

import java.util.HashMap;
import java.util.Objects;

public class Demomap {

    int rno;
    String name;

    public Demomap(int r, String n) {
        rno = r;
        name = n;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Demomap)) {
            return false;
        }

        Demomap other = (Demomap) obj;
        return this.rno == other.rno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rno);
    }

    public static void main(String[] args) {
        HashMap<Demomap, Integer> hm = new HashMap<>();

        Demomap d1 = new Demomap(1, "koti");
        Demomap d2 = new Demomap(1, "surya");

        hm.put(d1, 1);
        hm.put(d2, 2);

        System.out.println(hm);
        System.out.println("Size: " + hm.size());
        System.out.println("Value for d1: " + hm.get(d1));
    }
}

