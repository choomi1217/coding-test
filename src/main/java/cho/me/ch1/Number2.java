package cho.me.ch1;

import java.util.Scanner;

/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요
 * */
public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else {
                result.append(Character.toLowerCase(c));
            }
        }

        System.out.println(result);
    }
}
