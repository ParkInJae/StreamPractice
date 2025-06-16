

import java.util.*;
import java.util.stream.Stream;

public class StreamPractice {


    public static void main (String [] args){

        ArrayList<String> fruits = new ArrayList<String>();
        System.out.println("-logger를 사용할 수 없음 -");        

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");

        
    fruits.stream() // 	fruits 리스트를 기반으로 스트림 생성
        .filter(fruit -> fruit.startsWith("a")) // filter 특정 조건에 부합하는 stream을 전개
        .forEach(System.out::println);; // filter에 걸러진 요소들을 하나씩 처리해줌 
         
        System.out.println("----------------------------------");

    fruits.stream() // fruits 리스트를 기반으로 스트림을 생성 
    .map(fruit -> fruit.toUpperCase())  // .map()을 통해서 리스트 내의 모든 값을 매핑해줌  
                                        //.map(x -> y)의 매핑(map)은 “x를 y로 변환(transform)”
    .forEach(System.out :: println);





    }

    
    
    


}

