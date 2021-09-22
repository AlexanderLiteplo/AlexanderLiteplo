import java.util.ArrayList;

public class recursivePerumtations {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(3);
        myArr.add(2);
        myArr.add(9);
        myArr.add(5);
//        myArr.add(4);
//        myArr.add(8);
//        myArr.add(6);
        perumations(myArr,3);
        System.out.println(myArr);
    }
    public static void perumations(ArrayList<Integer> arr, int i) {
        if (i == 0) {
            System.out.println(arr.toString());

        } else {
            for (int j = i; j >= 0; j--) {
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                perumations(arr, i-1);

                temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
    }

}
