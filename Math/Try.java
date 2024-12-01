public class Try {
  
  public static void main(String args[]) {
    String[] a = {"a", "b", "c", "d", "e"};
    String b = "f";
    boolean isItTrue = isInArray(a, b);
    System.out.println(isItTrue);
  }

  public static boolean isInArray (String[] a, String b) {
    for (int i = 0; i < a.length; i++) {
      if (b.equals(a[i])) return true;
    }
    return false;
  }
  
}
