public class Challenge_39 {
    public static void main(String[] args) {
        System.out.println("Right Half Pyramid:");
        rightHalfPyramid();
        
        System.out.println("\nReverse Right Half Pyramid:");
        reverseRightHalfPyramid();
        
        System.out.println("\nLeft Half Pyramid:");
        leftHalfPyramid();
    }

    // 1. Right Half Pyramid
    public static void rightHalfPyramid() {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // 2. Reverse Right Half Pyramid
    public static void reverseRightHalfPyramid() {
        int i = 5;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    // 3. Left Half Pyramid
    public static void leftHalfPyramid() {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5 - i) {  // spaces before stars
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= i) {  // stars
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
