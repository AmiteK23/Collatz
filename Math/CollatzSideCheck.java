public class CollatzSideCheck {
  public static void main(String args[]) {
    for (int i = 2; i <= 15000000; i = (i * 3) + 2) {
      System.out.println("i: " + i);
    }
  }
}
