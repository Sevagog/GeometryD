package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxi = Integer.MIN_VALUE, a[] = new int[4];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        a[3] = scanner.nextInt();

        for(int i = 0; i < 4; i++){
            if(maxi < a[i]){
                maxi = a[i];
            }
        }

        System.out.println(maxi);
    }
}