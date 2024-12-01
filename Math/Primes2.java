public class Primes2 {
  public static void main(String args[]) {
    int [] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 143, 145};
    int [] arr2 = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 143, 145};
    for(int i = 0; i < 18; i++) {
      int x = arr[i] + arr2[i];
      System.out.println("Calculating numbers: " + ((x/2) - 1) + ", " + ((x/2) + 1));
      if (x % 6 == 0 || x == 8) {
        x = (x / 2) / 6;
        System.out.println("Twins, root: " + x);
      } else {
        System.out.println("not twins");
      }
    }
    
  }
  
}
