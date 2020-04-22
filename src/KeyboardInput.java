import java.util.Scanner;

public class KeyboardInput {
    public static void main(String [] args){
        String firstInitial, lastName, streetName, streetType, city;
        int houseNumber,phoneNumber;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first initial: ");
        firstInitial = keyboard.nextLine();

        System.out.println("Enter your last name: ");
        lastName = keyboard.nextLine();

        System.out.println("Enter your house number: ");
        houseNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your street name: ");
        streetName = keyboard.nextLine();

        System.out.println("Enter your street type: ");
        streetType = keyboard.nextLine();

        System.out.println("Enter your city: ");
        city = keyboard.nextLine();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
