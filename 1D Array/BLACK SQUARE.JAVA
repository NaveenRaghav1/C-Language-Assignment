// THIS IS A BLACK SQUARE PROBLEM FROM THE CODEFORCES PROB N0. 431 A
//YOU CHECK THE PROBL STATEMENTS ON GOOGLE BY TYPING "codeforces prob no. 431 A"

import java.util.*;

public class java {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String s = sc.next();
    int sum = 0;
    
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      int n = ch - '0'; 
      switch(n) {
        case 1 : sum += a;
        break;
        case 2 : sum += b;
        break;
        case 3 : sum += c;
        break;
        case 4 : sum += d;
        break;
      }
    }
    System.out.println(sum);
  }
}