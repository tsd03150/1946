import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{
    int pr; // 서류 등수
    int mr; // 면접 등수

    Person(int pr, int mr) {
        this.pr = pr;
        this.mr = mr;
    }

    @Override
    public int compareTo(Person p) {
        return this.pr - p.pr;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] answer = new int[n];

        // 전체 테스트 수
        for (int i = 0; i < n; i++) {

            int t = kb.nextInt();
            ArrayList<Person> arr = new ArrayList<>();

            // 테스트 하나 입력
            for (int j = 0; j < t; j++) {
                int a = kb.nextInt();
                int b = kb.nextInt();
                arr.add(new Person(a, b));
            }

            Collections.sort(arr);
            int end = Integer.MAX_VALUE;

            // 입력한 테스트를 토대로 선별
            for (Person ob : arr) {
                if (end > ob.mr) {
                    end = ob.mr;
                    answer[i] += 1;
                }
            }
        }

        // 출력
        for (int num : answer) {
            System.out.println(num);
        }

    }
}
