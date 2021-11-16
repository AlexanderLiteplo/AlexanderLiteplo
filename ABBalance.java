import java.util.Scanner;

public class ABBalance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = in.nextLine();
//            System.out.println(strings[i]);
//            System.out.println(strings[i].length());
        }

        for (String string : strings)
            printBalancedStrings(string);

    }

    static final char b = 'b';
    static final char a = 'a';

    private static void printBalancedStrings(String sequence) {
        if (sequence.length() == 1) {
            System.out.println(sequence);
            return;
        }
        sequence = sequence.substring(0,sequence.length() - 1);
        System.out.println(sequence + sequence.charAt(0));

    }



}
