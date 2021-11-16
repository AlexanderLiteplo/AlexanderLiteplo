import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateFiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Pair> compsAndCables = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            compsAndCables.add(new Pair(in.nextLong(), in.nextLong()));
        }

        for (Pair pair : compsAndCables) {
            System.out.println(getNumHours(pair));
        }

    }

    private static long getNumHours(Pair pair) {
        long numComps = pair.key;
        long numCompsLeft = pair.key - 1;
        long numCables = pair.value;
        if (numCompsLeft == 0)
            return 0;
        if (numCables == 1)
            return numCompsLeft;

        int numHours = 0;
        int numCompsUpdated = 1;

        numHours += numCables - 1;
//


        for (int i = 1; i < numCables && numCompsUpdated < numComps; i++) {
            numCompsUpdated += numCompsUpdated;
        }
        System.out.println("number of computers updated after" +
                "exponential rise = " + numCompsUpdated);

        numHours += (numComps - numCompsUpdated) / numCables;


        return numHours;
    }

    public static long log2(int N) {

        // calculate log2 N indirectly
        // using log() method
        long result = (long) (Math.log(N) / Math.log(2));

        return result;
    }

    public static class Pair {
        long key;
        long value;

        public Pair(long key, long value) {
            this.key = key;
            this.value = value;
        }
    }

}
