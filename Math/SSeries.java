public class SSeries {
  public static void main(String args[]) {
    double curSum = 0;
    for (double i = 3; i < 2049; i = i + 2) {
      double j = i - 1;
      curSum = i / j;
      System.out.println(curSum);
      
    }
  }
}
