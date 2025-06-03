
import java.util.Scanner;
import java.util.stream.*;

public class StringToChar{


    /*
         여러가지 숫자를 받아서 숫자의 합을 구하기 
    */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner로 받아야하는 값
        Stream <Character> st = new Stream<Character>() ;
        
        int sum =0;  // 정수들의 합 
        int N = sc.nextInt();

        String sNum = sc.next();
        char [] cNum = sNum.toCharArray();


        st.Stream(cNum)
        .map(data -> data.IntegerParseInt(cNum))
        .forEach(System.out:: println);
        
    }
}