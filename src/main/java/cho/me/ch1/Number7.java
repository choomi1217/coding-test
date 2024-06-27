package cho.me.ch1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 */
public class Number7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        int max = string.length() / 2;
        String result = "YES";
        for (int lt = 0; lt < max; lt++) {
            int rt = string.length()-lt-1;
            if (string.charAt(lt) != string.charAt(rt)) {
                result = "NO";
                break;
            }
        }

        System.out.println(result);

    }
}
