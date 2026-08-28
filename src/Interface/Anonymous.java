package Interface;

import java.util.*;

interface Addition {
    void add(int a, int b);
}

public class Anonymous {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Addition k = new Addition() {

            public void add(int a, int b) {
                System.out.println(a + b);
            }

        };

        k.add(a, b);
    }
}
