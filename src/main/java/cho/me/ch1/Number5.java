package cho.me.ch1;

import java.util.*;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요
 * */
public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] charArray = string.toCharArray();

        int length = charArray.length;

        int lt = 0;
        int rt = length - 1;

        for (int i = 0; lt < rt; i++){
            if(!Character.isAlphabetic(charArray[lt])){
                lt ++;
            }else if(!Character.isAlphabetic(charArray[rt])){
                rt --;
            }else{
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt ++;
                rt --;
            }
        }

        System.out.println(charArray);

    }
}
