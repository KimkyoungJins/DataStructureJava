package recursion;

public class Recursion {

    // 등차수열에 관한 함수인 것인가?
    // n은 n번째 항이며 difference는 공차이다.
    // 두개의 매개변수를 받는다.
    public static int arithmeticSequence (int n, int difference) {

        if (n == 1) {  // 첫 항을 설정해 준다.
            return 3;

        } else {        // 첫 항이 1이고, 등차가 diffennce일때 n번째 항을 구한다.
            return arithmeticSequence(n - 1, difference) + difference;
        }

    }




}
