package cho.me.ch1;


import java.util.Scanner;

/**
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 * */
public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (string.length() > 100){
            throw new IllegalArgumentException("문자열의 길이는 100을 넘지 않습니다.");
        }
        char c = scanner.next().charAt(0);

        String upperStr = string.toUpperCase();
        char upperChar = Character.toUpperCase(c);

        int result = 0;
        for(char idx : upperStr.toCharArray()){
            if (upperChar == idx){
                result ++;
            }
        }

        System.out.println(result);

    }
}
