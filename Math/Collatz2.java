public class Collatz2 {

  public static void main(String args[]) {
    int FINAL_MAX = 0;
    int largestTotalGrowSeqOfRange = 0;
    int indexOfLargestGrowSeq = 0;
    int shortcutMax = 0;
    int iterationsMax = 0;
    int iterationsMaxIndex = 0;
    //int iterationsMaxTotal = 0;
    //int totalLargestTotalGrowSeqOfRange = 0;
    int indexOfshortcutMax = 0;
    // Regular Collatz:
    for (int i = 1; i <= 150; i++) {
      int shortcut = 0;
      int TEMP_MAX = 0;
      int n = i;
      TEMP_MAX = n;
      System.out.println("Calculating: " + n);
      System.out.print("[" + n + "] => ");

      int[] mat = new int[1000];
      mat[0] = n;
      int temp = 0, iterations = 0, branchNum = 0;
      boolean branch = false;

      int largestGrowSeq = 0;
      int largestTotalGrowSeq = 0;

      while (n > 1) {
        if (n % 2 == 0) {
          if (mat[temp] == 10 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 20 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 40 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 80 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 160 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 320 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 640 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          n = n / 2;
          temp += 1;
          mat[temp] = n;
          iterations += 1;
        } else {
          if (mat[temp] == 5 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 10 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 20 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 40 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 80 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 160 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 320 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          if (mat[temp] == 640 && branch == false) {
            branch = true;
            branchNum = mat[temp];
          }
          int a = ((n * 3) + 1) / 2;
          if ((a - 1) % 4 == 0 && ((a - 1) / 4) % 2 != 0) largestGrowSeq++;
          while ((n - 1) % 4 == 0 && ((n - 1) / 4) % 2 != 0) {
            //largestGrowSeq++;
            if (largestTotalGrowSeq < largestGrowSeq) largestTotalGrowSeq = largestGrowSeq;
            System.out.print("*" + ((n * 3) + 1) / 2 + "*");
            n = (n - 1) / 4;
            shortcut++;
            largestGrowSeq = 0;
            if (shortcutMax < shortcut) {
              shortcutMax = shortcut;
              indexOfshortcutMax = i;
            }
          }
          n = ((n * 3) + 1) / 2;
          largestGrowSeq++;
          if (largestTotalGrowSeq < largestGrowSeq) largestTotalGrowSeq = largestGrowSeq;
          if (largestTotalGrowSeqOfRange < largestTotalGrowSeq) {
            largestTotalGrowSeqOfRange = largestTotalGrowSeq;
            indexOfLargestGrowSeq = i;
          }
          if (iterationsMax < iterations) {
            iterationsMax = iterations;
            iterationsMaxIndex = i;
          } 
          if (n % 2 == 0) largestGrowSeq = 0;
          temp += 1;
          mat[temp] = n;
          iterations += 1;
          if (n > TEMP_MAX) TEMP_MAX = n;
        }
        //if (iterationsMaxTotal < iterationsMax) iterationsMaxTotal = iterationsMax;
        if (TEMP_MAX > FINAL_MAX) FINAL_MAX = TEMP_MAX;
        System.out.print("[" + mat[temp] + "] => ");
      }
      System.out.println();
      System.out.println("Number of iterations is: " + iterations);
      System.out.println("Branch is: " + branchNum);
      if (branchNum == 0)
        System.out.println("(Binary branch)");
      System.out.println("Largest number is: " + TEMP_MAX);
      System.out.println("Largest total growing sequence: " + largestTotalGrowSeq);
      System.out.println("Number of shortcuts taken: " + shortcut);
      System.out.println();

    }
    System.out.println("Total Largest Number is: " + FINAL_MAX);
    System.out.println("Total Largest Number of iterations: " + (iterationsMax + 2) + " At index: " + iterationsMaxIndex);
    System.out.println("Total Largest growing sequence is: " + largestTotalGrowSeqOfRange + " At index: " + indexOfLargestGrowSeq);
    //System.out.println("Number of Largest growing sequences (eq.) " + totalLargestTotalGrowSeqOfRange);
    System.out.println("Maximum Number of shortcuts: " + shortcutMax + " At index: " + indexOfshortcutMax);
    System.out.println();
  }

}
