
package org.yourorghere;

import java.util.Scanner;



public class Zadanie3 {
    int[] tablica = new int[9];
    Scanner odczyt = new Scanner(System.in);
   public int banan() {
    for (int i = 0; i < 10; i++)
            tablica[i] = odczyt.nextInt();
 
    return 0;
}
public void odczyt()
{
   System.out.println("Tablica wyglada nastêpuj¹co");
    for (int i = 0; i < 10; i++)
            System.out.println(tablica[i]);
}

public void srednia()
{
        int w=0;
        int n=10;
            for (int i = 0; i < 10; i++)
                w=w+tablica[i];
                    System.out.println(w/n);
}
}
