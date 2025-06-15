<h1>Stream이란?</h1>

  스트림이란? > 
  Java 8에서 추가된 Stream API의 핵심 메서드.
  Collection(예: List, Set) 인터페이스의 기본 메서드로, 
  해당 컬렉션의 요소들을 기반으로 한 스트림(Stream) 객체를 생성함.
  즉, 데이터 처리 흐름(파이프라인)을 시작하는 입구 역할을 한다고 볼 수 있음 .
  컬렉션, 배열 등의 데이터 소스를 다루기 위한 함수형 프로그래밍 방식이자, 
  스트림을 사용하면 반복문이나 조건문을 하나의 문장에 간략히 작성할 수 있다. 

  Stream API는 IntStream, LongStream, DoubleStream만 제공한다. 
  
* Stream의 filter


```
.filter(FindPrimeNumberStream::isPrimeStream) // 각 숫자에 대해 isPrimeStream 메서드 호출 후 true를 가지는 값만 남겨둠
```
 .filter >> 각 요소에 대해 주어진 조건을 검사해서 true를 반환한 요소만 남기고 나머지는 걸러냄

* Stream의 match

anyMatch	          조건을 만족하는 요소가 하나라도 있으면 true
allMatch	          모든 요소가 조건을 만족해야 true
```
// 소수 찾을 때 anyeMatch를 사용할 경우 
.anyMatch(i -> candidate % i == 0);

return ! .anyMatch(i -> candidate % i == 0);의 결과값 
// 부정 연산자를 붙어 해당 조건이 true일 때, false를 만들어 실수가 아닌 것은 반환 x , false인 실수를 true로 변환시켜 반환한다.
```

noneMatch	          조건을 만족하는 요소가 하나도 없으면 true
```
// 소수 찾을 때 noneMatch를 사용할 경우 
.noneMatch(i -> candidate % i == 0); // 해당 조건을 만족하는 요소가 하나도 없다면 true >> 소수 
```




<h1>FindPrimeNumberStream 설명</h1>


* 로직 설명
hasDivisor >> 소수를 찾는 로직 

넘어오는 숫자 num의 제곱근을 i로 나눴을 때 나머지가 0 >> 소수 

.anyMatch()는 조건에 만족하면 true 반환 , 불만족시에 false 반환 

* 예시 > 2의 경우 1 % 2는 1이기에 조건 만족 x 따라서 hasDivisor은 false

그러나 return문의 !로 인해서 true를 반환하여, 자신을 호출한 
 .filter(FindPrimeNumberStream::isPrimeStream)의 요소에 저장된다. 



```
boolean hasDivisor = IntStream
            .rangeClosed(2, (int)Math.sqrt(num)) // 2 부터 num의 제곱근까지 포함하는 정수 스트림 생성
            .anyMatch(i -> num % i == 0); // 조건 만족시 약수가 존재 >> 소수가 아님 
        return !hasDivisor;  // 약수가 없으면 소수
```