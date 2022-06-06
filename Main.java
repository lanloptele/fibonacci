import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n = 30;
    long first = 0, second = 1;
    for (int i = 1; i <= n; ++i) {
      System.out.print(first + ", ");

      long next = first + second;
      first = second;
      second = next;
    }
  }
}