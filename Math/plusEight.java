public class plusEight {
  public static void main(String args[]) {
    int counter = 0;
    int[] mat2 = new int[100000];
    int mat2Counter = 0;
    for (int i = 3; i <= 1000; i++) {
      System.out.println("Checking for " + i + ":");
      int[] mat = new int[100000];
      int iterations = 1;
      //int counter = 0;
      mat[0] = i;
      int n = i;
      while (n > 1) {
        int x = i - 8;
        if (x == mat[iterations] && x != 0  && x != 1 && x != 2 && x != 4 && x != 8 && x != 16 && x != 32 && x != 64 && x != 128 && x != 256) {
          System.out.print("Hurray ");
          mat2[mat2Counter] = i;
          mat2Counter++;
          counter++;
        }
        if (n % 2 == 0) {
        n = n / 2;
        //if (n == i) System.out.print("Hurray");
        mat[iterations] = n;
        System.out.print(mat[iterations] + " ");
        }
        //(n % 2 != 0)
        else {
          n = ((n * 3) + 1) / 2;
          //if (n == i) System.out.print("Hurray");
          mat[iterations] = n;
          System.out.print(mat[iterations] + " ");
        }
    }
    System.out.println();
    }
     System.out.println("Final Number of numbers that has hurrays: " + counter);
     System.out.print("{");
     for (int k = 0; k < counter; k++) {
      System.out.print((mat2[k] - 8) + " & ");
      System.out.print(mat2[k] + ", ");
     }
     System.out.print("}");
  }
  
}
