// CS210 Assignment #2 "Space Needle"
// David Johnson
// Prints an ASCII Space Needle of varying sizes as defined by the SIZE constant

public class SpaceNeedle {
    
    public static final int SIZE = 4;
    public static final int MAXWIDTH = SIZE * 6;

    public static void main(String[] args) {
        drawSpaceNeedle();
    }

    public static void drawSpaceNeedle() {
        drawNeedle();
        drawTopTop();
        drawMiddleTop();
        drawBottomTop();
        drawNeedle();
        drawTube();
        drawTopTop();
        drawMiddleTop();
    }
    
    public static void drawTopTop() {
        // Top of top is SIZE tall
        for (int i = 1; i <= SIZE; i++) {
            int maxFiller = 3 * (i - 1);
            // Start with spaces
            for (int j = 1; j <= MAXWIDTH / 2 - (3 + maxFiller); j++) {
                System.out.print(" ");
            }
            // Then print left edge
            System.out.print("__/");
            // Then print any filler
            drawFiller(maxFiller);
            // Then print middle
            System.out.print("||");
            // Then print filler again
            drawFiller(maxFiller);
            // Then print right edge
            System.out.println("\\__");
        }
    }
    
    public static void drawFiller(int maxFiller) {
        for (int j = 1; j <= maxFiller; j++) {
            System.out.print(":");
        }        
    }
    
    public static void drawNeedle() {
        // Needle is SIZE tall
        for (int i = 1; i <= SIZE; i++) {
            // Print spaces until the halfway point
            for (int j = 1; j <= MAXWIDTH / 2; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    private static void drawMiddleTop() {
        System.out.print("|");
        for (int i = 1; i <= MAXWIDTH - 2; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    private static void drawBottomTop() {
        
        for (int i = 1; i <= SIZE; i++) {
            // Start with spaces
            for (int j = 1; j <= (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int j = 1; j <= MAXWIDTH / 2 - i * 2 + 1; j++) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }

    private static void drawTube() {
        for (int i = 1; i <= SIZE * 4; i++) {
            int supports = SIZE / 2;
            //Start with spaces
            for (int j = 1; j <= MAXWIDTH / 2 - 1 - supports; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 1; j <= supports; j++) {
                System.out.print("%");
            }
            System.out.print("||");
            for (int j = 1; j <= supports; j++) {
                System.out.print("%");
            }
            System.out.println("|");
        }
    }
}
