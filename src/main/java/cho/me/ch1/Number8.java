package cho.me.ch1;

import java.util.Scanner;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 */
public class Number8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        String string2 =new StringBuilder(string1).reverse().toString();

        String result = "YES";
        for (int lt = 0; lt < string1.length(); lt++) {
            if(string1.charAt(lt) != string2.charAt(lt)){
                result = "NO";
                break;
            }
        }

        System.out.println(result);

    }
}
