

import java.util.*;
import java.util.stream.Stream;

/*
  스트림이란? > 
  Java 8에서 추가된 Stream API의 핵심 메서드.
  Collection(예: List, Set) 인터페이스의 기본 메서드로, 
  해당 컬렉션의 요소들을 기반으로 한 스트림(Stream) 객체를 생성함.
  즉, 데이터 처리 흐름(파이프라인)을 시작하는 입구 역할을 한다고 볼 수 있음 .
  컬렉션, 배열 등의 데이터 소스를 다루기 위한 함수형 프로그래밍 방식이자, 
  스트림을 사용하면 반복문이나 조건문을 하나의 문장에 간략히 작성할 수 있다. 


 */
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

