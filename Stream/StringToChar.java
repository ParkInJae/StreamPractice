
import java.util.Scanner;
import java.util.stream.*;

public class StringToChar{


    /*
         여러가지 숫자를 받아서 숫자의 합을 구하기 
    */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner로 받아야하는 값

        String sNum = sc.next();
        /*
         * nextInt() : 정수를 입력받아서 정수 하나를 읽어서 반환합니다. 
         * next() : 단어를 입력받음 > 입력에서 공백 전까지의 문자열을 읽어서 반환하며, 단어를 읽는다고 보면 됨.
         */

        int sum =0;  // 정수들의 합 


        // Stream을 활용한 문자 배열을 숫자로 바꾸고 합산
        
        sum = sNum.chars() // IntStream으로 반환함 
        .map( c -> c - '0') // 해당 문자의 아스키 코드에 '0'을 뺀 값을 숫자로 변환 
        .sum();

        System.out.println("입력한 숫자들의 합계" + sum ) ;
    }
}