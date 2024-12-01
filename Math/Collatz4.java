public class Collatz4 {
  public static void main(String args[]) {
    double n = 5;
    double sum = 0;
    System.out.println("Calculating: " + n + ":");
    while (n > 1) {
      System.out.println("Test" + n);
      while (n % 2 == 0) {
        sum += 1 / n;
        n = n / 2;
        System.out.println(sum);
      }
      while (n % 2 == 1 && n != 1) {
        sum += 1 / n;
        n = ((n * 5) + 1) / 2;
        System.out.println(sum);
      }
      System.out.println("Total sum: " + sum);
    } 
  }
}
