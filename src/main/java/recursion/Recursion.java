package recursion;

public class Recursion {

    // 등차수열에 관한 함수인 것인가?
    // n은 n번째 항이며 difference는 공차이다.
    // 두개의 매개변수를 받는다.
    public static int arithmeticSequence(int n, int difference) {

        if (n == 1) {  // 첫 항을 설정해 준다.
            return 3;

        } else {        // 첫 항이 3이고, 등차가 diffennce일때 n번째 항을 구한다.
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
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void hanoiTower(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            // Step 1: Move n-1 disks from start to auxiliary, so they are out of the way
            hanoiTower(n - 1, from, aux, to);

            // Step 2: Move the nth disk from start to target
            System.out.println("Disk " + n + " from " + from + " to " + to);

            // Step 3: Move the n-1 disks that we left on auxiliary to target
            hanoiTower(n - 1, aux, to, from);
        }
    }

    // 선택정렬 메소드
    // 선택정렬이란
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // 배열의 끝까지 반복
        for (int i = 0; i < n - 1; i++) {
            // i 번째 위치에 들어갈 최소 원소의 위치를 찾는다.
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 최소 원소를 i 번째 위치로 옮긴다.
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSrot(int[] arr) {
        int n = arr.length;         // 배열의 길이이다.

        for (int i = 0; i < n - 1; i++) {
            // i번 째 위치에 들어갈 최소 원소의 위치를 찾는다.
            int minIndex = i;



        }

        // 최소 원소를 i 번재 위치로 옮기는 것이다.
        int temp = arr[minIndex]; // 최소 원소를 i 번째 위치로 옮긴다.
        arr[minIndex] = arr[i];
        arr[int] = temp;
    }
}
