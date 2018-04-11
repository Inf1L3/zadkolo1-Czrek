package org.yourorghere;

public class Zadanie2 {

public static int fibR(int n) {

if (n < 2) return n;

return fibR(n-1) + fibR(n-2); 
}
}