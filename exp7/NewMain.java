package exp7;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        String name, address;
        Scanner kevs = new Scanner(System.in);
        System.out.println("Enter your fullname. Including Middle Initial, Separated by spaces.");
        name = kevs.nextLine();
        System.out.println("\nEnter your address. Separated by spaces.");
        address = kevs.nextLine();
        String initials = "";
        char c = name.charAt(0);
        initials += c;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == ' ') {
                initials += name.charAt(i + 1);
            }
        }
        String addressNum = "";
        boolean finished = false;
        for (int i = 0; i < address.length(); i++) {
            if (!finished) {
                char num = address.charAt(i);
                if (num != ' ') {
                    addressNum += num;
                } else
                {
                    finished = true;
                }
            } else
            {
                break;
            }
        }
        System.out.println(initials + addressNum);
    }
}

