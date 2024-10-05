import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //lastFirstN(sc.nextLine(), sc.nextLine(), sc.nextInt());

    strinManip(sc.nextLine(), sc.nextLine());
  }

  public static void lastFirstN(String s1, String s2, int n) {
    String output;

    output = s1.substring(n - 1) + s2.substring(0, n);
    System.out.println(output);

  
  }

  public static void strinManip(String s1, String s2) {
    s1 = s1.toUpperCase();
    s2 = s2.toUpperCase();

    s2 = s2.charAt(0) + (s2.substring(1, s2.length())).toLowerCase();

    System.out.println(s1 + " " + s2);
  }
}
