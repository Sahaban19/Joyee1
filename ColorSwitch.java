import java.util.Scanner;

public class ColorSwitch {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a color value (1-5): ");
        int colorValue = sc.nextInt();

        
        switch (colorValue) {
            case 1:
                System.out.println("The color is Red.");
                break;
            case 2:
                System.out.println("The color is Blue.");
                break;
            case 3:
                System.out.println("The color is Green.");
                break;
            case 4:
                System.out.println("The color is Yellow.");
                break;
            case 5:
                System.out.println("The color is Orange.");
                break;
            default:
                System.out.println("Invalid color value. Please enter a value between 1 and 5.");
        }

        
        sc.close();
    }
}
