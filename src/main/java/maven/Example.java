package maven;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String usersWord = input.nextLine();
        System.out.printf("You Entered: %s\n", usersWord);
    }


}
