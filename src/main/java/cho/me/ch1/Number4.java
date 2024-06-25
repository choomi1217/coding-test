package cho.me.ch1;

import java.util.*;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * */
public class Number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> array = new ArrayList<>();
        for (int i = 0; i <= count; i++) {
            array.add(scanner.nextLine());
        }
        for (String str : array) {
            Deque<Character> stack = new ArrayDeque<>();
            for ( char c : str.toCharArray()){
                stack.push(c);
            }
            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
