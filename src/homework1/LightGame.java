package homework1;

import java.util.Scanner;

/**
 *
 * @author prakash
 */
public class LightGame {

    public static void main(String[] args) {

        System.out.print("Enter number of rows and columns: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        LightsOut game = new LightsOut(rows, cols);
        System.out.println();
        System.out.println(game);
        
        while(!game.over()) {
            System.out.println("What is your move ");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println();
            game.move(a,b);
            System.out.println(game);
        }
        System.out.println("\nLights out!");
    }

}
