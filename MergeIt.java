import java.util.Scanner;

public class MergeIt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        int[] answers = new int[N];

        for (int i = 0; i < N; i++) {
            int len = Integer.parseInt(in.next());
            int[] arr = new int[len];
            for(int j = 0; j < len; j++) {
                arr[j] = Integer.parseInt(in.next());
            }
            answers[i] = query( arr);
        }

        for (int num : answers)
            System.out.println(num);


    }

    public static int query( int[] arr) {


        if(arr.length == 1) {
            if(arr[0] % 3 == 0)
                return 1;
            else
                return 0;
        }


        if(arr.length == 2) {
            if(arr[0] + arr[1] < 3)
                return 0;
        }

        int ret = 0;
        //any odd plus even divis by three
        //count number of odd even pairs
        //odd++ even++'
        //
        int odds = 0, evens = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                ret++;
                continue;
            } else if ((num & 1) == 1) {
                odds++;
            } else {
                evens++;
            }

        }

        if(odds < evens)
            ret += odds;
        else {
            ret += evens;
            ret += (odds - evens) / 3;
        }



        return ret;
    }

}
