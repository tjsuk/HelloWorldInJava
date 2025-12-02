import java.util.Scanner;

public class InputOutput
{
    static void main() {
        Scanner reader = new Scanner(System.in);
        IO.print("Enter name: ");
        String name = reader.nextLine();
        IO.print("Enter age: ");
        byte age = reader.nextByte();
        reader.nextLine();  // Clears the buffer, otherwise kaboom!
        IO.print("Enter last name: ");
        String surname = reader.nextLine();
        IO.println(name + " " + age);
    }
}
