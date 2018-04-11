package org.yourorghere;

import java.util.Scanner;

public class Zadkolo1  {

    public static void main(String[] args) {
       
        Scanner odczyt = new Scanner(System.in);
        System.out.println("wybierz zadanie od 1 do 4");
        int a =odczyt.nextInt();
           switch( a ){
            case 1:
            zadanie1.jedynka();
            case 2:
                int b =odczyt.nextInt();
            Zadanie2.fibR(b);
            case 3:
            Zadanie3 zad3=new Zadanie3();
            zad3.odczyt();
            zad3.banan();
            zad3.srednia();
            case 4:
            {
            Osoba osoba1 = new Osoba("Jan", "Kowalski", 15, 170 , 90);
        osoba1.pokazDane();
    }
    default: 
    System.out.println("dziwna sytuacja");
    }
        
}}

