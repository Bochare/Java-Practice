public class CustomPattern {
  public static void main(String[] args) {
      int n = 5; // Change n as per your requirement
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
  }
}
