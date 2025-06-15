import java.util.stream.IntStream;

public class FindPrimeNumberStream {
    // 스트림 기반 소수 판별 메서드: 소수이면 true, 아니면 false 반환
    static boolean isPrimeStream(int num) {
        if (num < 2) return false;  
        // 2부터 √num까지 어떤 i라도 num % i == 0 이면 약수가 존재하는 것
        boolean hasDivisor = IntStream
            .rangeClosed(2, (int)Math.sqrt(num)) // 2 부터 num의 제곱근까지 포함하는 정수 스트림 생성
            .anyMatch(i -> num % i == 0); // 조건 만족시 true 반환 
        return !hasDivisor;  // 약수가 없으면 소수
    }

    public static void main(String[] args) {
        int num = 10;

        // 소수만 필터링하여 출력
        System.out.println("소수 리스트:");
        IntStream.range(2, num)
        // .filter >> 각 요소에 대해 주어진 조건을 검사해서 true를 반환한 요소만 남기고 나머지는 걸러냄
                 .filter(FindPrimeNumberStream::isPrimeStream) // 각 숫자에 대해 isPrimeStream 메서드 호출 
                 .forEach(i -> System.out.println(i + "는 소수입니다."));

        // 소수 개수 세기
        long count = IntStream.range(2, num)
                              .filter(FindPrimeNumberStream::isPrimeStream)
                              .count();
        System.out.println("2부터 " + num + "까지 총 소수의 개수: " + count);
    }
}
