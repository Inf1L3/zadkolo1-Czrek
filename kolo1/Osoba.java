package org.yourorghere;

    public class Osoba {
  
    public String imie;      
    public String nazwisko;  
    public int wiek;  
    public int wzrost;  
    public int waga;  

    public Osoba(String imie, String nazwisko, int wiek, int wzrost , int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

 
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pokazDane() {
        System.out.println("Osoba");
        System.out.println("imiê: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
        System.out.println("wzrost " + this.wzrost);
        System.out.println("waga " + this.waga);
    }
    }
