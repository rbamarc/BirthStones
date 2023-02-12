package netbeans.birthstones;
import java.util.Scanner;

/**
 *
 * @author halfrikan
 */
public class BirthStones {

    public static void main(String[] args) {
        //define variables to be used
        String userInput = "";
        String monthStone = "";
        int month = 0;
        
        //initialize scanner object
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please enter a number for a month: ");
        userInput = inputReader.nextLine();
        month = Integer.parseInt(userInput);
        
        switch (month) {
            case 1:
                monthStone = "Month is Jan, birthstone is: Garnet";
                break;
            case 2:
                monthStone = "Month is Feb, birthstone is: Amethyst";
                break;
            case 3:
                monthStone = "Month is March, birthstone is: Aquamarine";
                break;
            case 4:
                monthStone = "Month is April, birthstone is: Diamond";
                break;
            case 5:
                monthStone = "Month is May, birthstone is: Emerald";
                break;
            case 6:
                monthStone = "Month is June, birthstone is: Pearl";
                break;
            case 7:
                monthStone = "Month is July, birthstone is: Ruby";
                break;
            case 8:
                monthStone = "Month is Aug, birthstone is: Peridot";
                break;
            case 9:
                monthStone = "Month is Sep, birthstone is: Sapphire";
                break;
            case 10:
                monthStone = "Month is Oct, birthstone is: Opal";
                break;
            case 11:
                monthStone = "Month is Nov, birthstone is: Topaz";
                break;
            case 12:
                monthStone = "Month is Dec, birthstone is: Turquoise";
                break;
            default:
                monthStone = "you entered a wrong number, now you die!";
                    
        }
        
        System.out.println(monthStone);
    }
}
