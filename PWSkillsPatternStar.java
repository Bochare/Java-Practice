public class PWSkillsPatternStar {
  public static void main(String[] args) {
      int n = 7;

      // Print P with stars
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n / 2; j++) {
              if (j == 0 || (i == 0 && j != n / 2 - 1) || (i == n / 2 && j != n / 2 - 1) || (i > 0 && i < n / 2 && j == n / 2 - 1)) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
  }
}
