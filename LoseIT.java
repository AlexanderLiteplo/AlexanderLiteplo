import java.util.*;

public class LoseIT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(in.next());
        }
        System.out.println(lose(N,a));

    }
    public static int lose(int n, int[] a) {

        //loop through array - number of 4's 8's 15's same
        //

        int[] counts = new int[6];
        int min = 2;
        for (int num : a) {
            switch (num) {
                case 4:
                    counts[0]++;

                    break;
                case 8:
                    counts[1]++;

                    break;
                case 15:
                    counts[2]++;

                    break;
                case 16:
                    counts[3]++;

                    break;
                case 23:
                    counts[4]++;

                    break;
                case 42:
                    counts[5]++;

                    break;
            }

        }
        int remove = 0;
//        remove = n % 6;
//        System.out.println("first remove = " + remove);
        if(n == remove)
            return remove;
        for(int i = 0; i < 6; i++)
            if(min > counts[i])
                min = counts[i];

        for(int num: counts) {
            if(num != min)
                remove += num - min;
        }


        return remove;

    }
}
