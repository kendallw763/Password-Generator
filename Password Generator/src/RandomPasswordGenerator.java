import java.security.SecureRandom;
import java.util.Scanner;

public class RandomPasswordGenerator {
    //Define the characters that can be used in the password
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the password ");
        int length = scanner.nextInt();

        //Generate the random password
        String password = generatePassword(length);

        //output the generated password
        System.out.print("Generated Password: " + password);

        scanner.close();
    }

        //This method generates the random password
        static String generatePassword(int length){
            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();

            //Generate teh characters for the password
            for(int i = 0; i < length; i++){
                int randomIndex = random.nextInt(CHARACTERS.length());
                password.append(CHARACTERS.charAt(randomIndex));
            }
            return password.toString();
        }



    }


