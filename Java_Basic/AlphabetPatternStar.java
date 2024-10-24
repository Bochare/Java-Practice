public class AlphabetPatternStar {
    public static void main(String[] args) {
        int n = 7;  // Height of the letter

        // Print Alphabet A using stars
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                // Print stars in "A" shape
                if ((i == 0 && j != 0 && j != n / 2) ||  // Top bar
                    (i != 0 && (j == 0 || j == n / 2)) ||  // Two sidebars
                    (i == n / 2))  // Middle bar
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
