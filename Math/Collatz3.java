public class Collatz3 {
  public static void main(String args[]) {
    double largestSum = 0;
    double largestSumIndex = 0;
    for (double x = 900; x < 1000; x++) {
      System.out.println("Calculating: " + x);
      double n = x;
      double sum = 0;
      //double largestSum = 0;
      while (n > 1) {
        while (n % 2 == 0) {
          sum += 1 / n;
          n = n / 2;
          System.out.println("temporary sum: " + sum);
        }
        while (n % 2 == 1 && n != 1) {
          sum += 1 / n;
          n = ((n * 3) + 1) / 2;
          //n = (n * 3) + 1;
          System.out.println("temporary sum: " + sum);
        }
      }
      System.out.println("Total sum of " + x + ": " + sum);
      if (largestSum < sum) {
        largestSum = sum;
        largestSumIndex = x;
      }
      System.out.println();
      System.out.print("The current largest sum is: " + largestSum);
      System.out.println(" at index: " + largestSumIndex);
      System.out.println();
    }
  }
}
