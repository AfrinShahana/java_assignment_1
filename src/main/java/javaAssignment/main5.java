import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to be encrypted: ");
        String input = sc.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (char c : input.toCharArray()) {
            switch (c) {
                case 'A':
                    encrypted.append('F');
                    break;
                case 'p':
                    encrypted.append('u');
                    break;
                case 'l':
                    encrypted.append('q');
                    break;
                case 'e':
                    encrypted.append('j');
                    break;
                default:
                    encrypted.append(c);
            }
        }

        System.out.println("Encrypted word: " + encrypted.toString());
    }
}