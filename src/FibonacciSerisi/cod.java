package FibonacciSerisi;

import java.util.Scanner;

public class cod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, total = 0, z1 = 0,z2 = 1;

        System.out.print("Kaç defa hesaplanacak : ");
        x = sc.nextInt();

        for (int i = 1; i <= x; i++) {

            total = z1 + z2;

            z1 = z2;

            z2  = total;

            System.out.println(total);

        }

    }
}
