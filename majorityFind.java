import java.util.Arrays;

public class majorityFind {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 1, 4, 1, 5, 1};
        System.out.println(findMajority(arr));
        arr = new int[] {1, 2, 2, 2, 3, 3, 3, 4, 2, 2, 2, 2};
        System.out.println(findMajority(arr));
    }

    public static int findMajority(int[] arr) {
        if (arr.length <= 2)
            return arr[0];
        int n = arr.length;
        int[] left = Arrays.copyOfRange(arr, 0, n / 2);
        int[] right = Arrays.copyOfRange(arr, n / 2, n);
        int leftM = findMajority(left);
        int rightM = findMajority(right);
        int majority = leftM;
        int leftMCount = 0;
        int rightMCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == leftM)
                leftMCount++;
            if (arr[i] == rightM)
                rightMCount++;
        }
        if (leftMCount < rightMCount)
            majority = rightMCount;
        return majority;

    }
}
