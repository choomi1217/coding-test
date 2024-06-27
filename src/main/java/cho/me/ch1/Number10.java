package cho.me.ch1;

import java.util.Scanner;

/**
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 */
public class Number10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");

        String string = s[0];
        char target = s[1].charAt(0);

        for (int i = 0; i < string.length(); i++) {
            int counting = 0;
            if(string.charAt(i) == target){
                System.out.println(counting);
                counting = 0;
            }else{
                counting ++;
                for (int j = i + 1; j < string.length(); j++) {
                    if( string.charAt(j) != target ){
                        counting ++;
                    }else{
                        System.out.println(counting);
                        counting = 0;
                        break;
                    }
                }
            }
        }

    }
}
