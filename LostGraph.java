import java.util.Scanner;

public class LostGraph {
    static int numSentences;
    static int[] rememberLengths;
    static int[] writeTime;
    static int numStudents;
    static int[] noiseDuration;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        numSentences = in.nextInt();
        rememberLengths = new int[numSentences];
        writeTime = new int[numSentences];
        for (int j = 0; j < numSentences; j++) {
            rememberLengths[j] = Integer.parseInt(in.next());
        }

        for (int j = 0; j < numSentences; j++) {
            writeTime[j] = Integer.parseInt(in.next());
        }

        numStudents = in.nextInt();

        noiseDuration = new int[numStudents];
        for (int j = 0; j < numStudents; j++) {
            noiseDuration[j] = Integer.parseInt(in.next());
        }

//        System.out.println("Num students: " + numStudents);
//        printArray(writeTime);
//        printArray(rememberLengths);
//        printArray(noiseDuration);

        //find max of remembering times
        //do (num students - 1 ) * max remember times
        // then add that to the sum of the student noise times
        int maxRemember = 0;
        for (int time : rememberLengths)
            if (maxRemember < time)
                maxRemember = time;

        int timeDelayed = maxRemember*(numStudents);
        for( int time: noiseDuration)
            timeDelayed += time;

        System.out.println(timeDelayed);

    }


    public static void printArray(int[] arr) {
        System.out.println("printing array: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println(" done printing");
    }

}
