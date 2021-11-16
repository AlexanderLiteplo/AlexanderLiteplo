import javafx.util.Pair;

import java.util.*;

public class DropLoot {
    public static void main(String[] args) {
        int customers = 0;
        int desks = 0;
        Scanner in = new Scanner(System.in);
        customers = in.nextInt();
        desks = in.nextInt();

        Person[] people = new Person[customers];
        for (int i = 0; i < customers; i++) {
            people[i] = new Person(in.nextInt(), -1);
        }

//        LinkedList<Pair<Integer,Integer>> lines = new LinkedList<>();
        PriorityQueue<Pair<Double, Integer>> minHeap = new PriorityQueue<>(desks, new Paircomparator());
        //pair<x value then desk index
        ArrayList[] lines = new ArrayList[desks];
        for (int i = 1; i <= desks; i++) {
            minHeap.add(new Pair<>(0.0, i));
            lines[i - 1] = new ArrayList<>();
        }
//        System.out.println(lines.toString());


//        ArrayList<Pair<Integer,Integer>> people = new ArrayList<>();

        //look at the number of people in the queue
        //and at the number of purchases the two last people in queue must make
        //choose desk for which value
        //pair value = index || pair key = x
        for (Person person : people) {
            Pair<Double, Integer> bestLine = minHeap.poll();

            person.queue = bestLine.getValue();
            // x = numPeopleInLine * p
            ArrayList<Person> bestLineList = lines[bestLine.getValue() - 1];
            bestLineList.add(person);

            //three cases
            //case 1: two or more people: p = (lastPerson +nextPerson)/2
            //case 2: one person in line p = person
            //case 3: 0 in line p = 0
            //choose minimum x
            //ties are broken by ith desk
            //update line info
            if (bestLineList.size() > 1) {
                double p = bestLineList.get(bestLineList.size() - 1).purchases;
                p += bestLineList.get(bestLineList.size() - 2).purchases;
                p /= 2.0;
                p = bestLineList.size() * p;
                bestLine = new Pair<>(p,bestLine.getValue());
            } else if (bestLineList.size() == 1) {
                bestLine = new Pair<Double, Integer>(bestLineList.get(0).purchases + 0.0,bestLine.getValue());
            } else {

            }
            minHeap.add(bestLine);


        }

        for (Person person : people) {
            System.out.print(person.queue + " ");
        }


    }

    public static class Paircomparator implements Comparator<Pair<Double, Integer>> {

        @Override
        public int compare(Pair<Double, Integer> o1, Pair<Double, Integer> o2) {
            if(o1.getKey() == o2.getKey())
                return o1.getValue()-o2.getValue();
            return (int) (o1.getKey() - o2.getKey());
        }
    }

    public static class Person {
        int purchases;
        int queue;

        public Person(int purchases, int queue) {
            this.purchases = purchases;
            this.queue = queue;
        }
    }

    public static void printArray(int[] arr) {
        System.out.println("printing array: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println(" done printing");
    }

}
