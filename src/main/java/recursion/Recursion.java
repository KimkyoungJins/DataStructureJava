package recursion;

public class Recursion {

    // 등차수열에 관한 함수인 것인가?
    // n은 n번째 항이며 difference는 공차이다.
    // 두개의 매개변수를 받는다.
    public static int arithmeticSequence(int n, int difference) {

        if (n == 1) {  // 첫 항을 설정해 준다.
            return 3;

        } else {        // 첫 항이 1이고, 등차가 diffennce일때 n번째 항을 구한다.
            return arithmeticSequence(n - 1, difference) + difference;
        }

    }

    // 피보나치 수열 재귀함수로 나타낸다면??
    // n번째 항의 숫자를 구하는 것이다.
    public int fibonacci(int n) {

        // base case
        if (n <= 0) { // 예외처리를 해야한다.
            throw new IllegalArgumentException("n must be positive integer");

            // recursive case
        } else if (n == 1 || n == 2) {
            return 1;

        } else {
            return fibonacci(n - 1) + fibonacci(n - 2 );
        }
    }

    // 하노이 타워
    public int hanoitower(int n, char formRod, char toRod, char endRod) {

        if (n == 1) {
            System.out.println("Only on disk is meaningless");
        }

        

    }

}
