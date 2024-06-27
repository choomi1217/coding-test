import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class My {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Set<Character> characterSet = new HashSet<>();
        for(char c : str.toCharArray()){
            characterSet.add(c);
        }

        for (Character c : characterSet) {
            System.out.print(c);
        }
    }
}