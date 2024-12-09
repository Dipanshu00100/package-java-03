package src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Welcome welcome = new Welcome();
        Goodbye goodbye = new Goodbye();

        System.out.println(welcome.getMessage(name));
        System.out.println(goodbye.getMessage(name));

        scanner.close();
    }
}

class Welcome {
    public String getMessage(String name) {
        return "Hello, " + name + "! How are you.";
    }
}

class Goodbye {
    public String getMessage(String name) {
        return "Goodbye, " + name + "! See you next time.";
    }
}
