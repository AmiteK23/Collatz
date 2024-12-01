//import java.lang.Math;
public class Primes {
  public static void main(String args[]) {
    /*
    int [] arr = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 29, 31, 37, 41, 43, 47, 53, 59, 61};
    for (int i = 0; i < 20; i++) {
      int y = arr[i];
      System.out.println("Calculating " + y + ":");
      int x = arr[i];
      int x1 = (x * 6) - 1;
      int x2 = (x * 6) + 1;
      System.out.println(x1 + ", " + x2);
  }
  */
  
  System.out.println("Calculating 0.6667: ");
  System.out.println("3, 5 (trivial twin pair)");
  int [] arr2 = {1, 2, 3, 5, 7, 10, 12, 17, 18, 23, 25, 30, 32, 33, 38, 40, 45, 47, 52, 58,
  70, 72, 77, 87, 95, 100, 103, 107, 110, 135, 137, 138, 143, 147, 170};
    for (int j = 0; j < 35; j++) {
      int y = arr2[j];
      System.out.println("Calculating " + y + ":");
      int x = arr2[j];
      int x1 = (x * 6) - 1;
      int x2 = (x * 6) + 1;
      System.out.println(x1 + ", " + x2);
  }
  
  }
}
