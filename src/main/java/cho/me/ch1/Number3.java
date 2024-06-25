package cho.me.ch1;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * */
public class Number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.split(" ");
        String result = "";
        for (String str : array){
            if(str.length() > result.length()){
                result = str;
            }
        }
        System.out.println(result);
    }
}
