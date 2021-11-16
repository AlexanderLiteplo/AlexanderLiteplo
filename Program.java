////import java.util.*;
////
////class Program {
////    public static List<Integer> riverSizes(int[][] matrix) {
////        // Write your code here.
////        ArrayList<Integer> sizes = new ArrayList<>();
////        int numRivers = 0;
////        int matrixWidth = matrix[0].length;
////        int matrixHeight = matrix.length;
////
////        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
////
////        for(int y = 0; y < matrixHeight; y++)
////            for(int x = 0; x < matrixWidth; x++)
////                visited[y][x] = false;
////
////        for (int y = 0; y < matrix.length; y++) {
////            for (int x = 0; x < matrix[0].length; x++) {
////
////                if (visited[y][x] || matrix[y][x] == 0)
////                    continue;
////                //now we are at an unvisited river
////                //do BFS on the adjacent nodes
////                //init new river size
////                sizes.add(1);
////                Coordinate curr = new Coordinate(x, y);
////                Stack<Coordinate> frontier = new Stack<Coordinate>();
////                //DFS On the river we just found
////                while (!frontier.isEmpty()) {
////                    curr = frontier.pop();
////                    //if curr is not part of river go to next iteration
////                    if (visited[curr.y][curr.x] || matrix[curr.y][curr.x] == 0)
////                        continue;
////                    //mark curr as visited
////                    visited[curr.y][curr.x] = true;
////                    //increment current river's length
////                    sizes.set(numRivers, sizes.get(numRivers) + 1);
////                    //add neighbors to the queue
////                    for (Coordinate adjacentNode : getNeighbors(curr.y, curr.x, ))
////                        frontier.add(adjacentNode);
////                }
////                //increment numRivers (this is the index of the next river we will explore)
////                numRivers++;
////            }
////        }
////
////        return sizes;
////    }
////
////    public static ArrayList<Coordinate> getNeighbors(int x, int y, int arrwidth, int arrheight) {
////        ArrayList<Coordinate> neighbors = new ArrayList<Coordinate>();
////        int yup = y - 1;
////        int ydown = y + 1;
////        int xleft = x - 1;
////        int xright = x + 1;
////
////        if (yup >= 0) {
////            neighbors.add(new Coordinate(x, yup));
////        }
////        if (ydown <= arrheight)
////            neighbors.add(new Coordinate(x, ydown));
////        if (xleft >= 0)
////            neighbors.add(new Coordinate(xleft, y));
////        if (xright <= arrwidth)
////            neighbors.add(new Coordinate(xright, y));
////        return neighbors;
////    }
////
////    public static class Coordinate {
////        int x;
////        int y;
////
////        public Coordinate(int x, int y) {
////            this.x = x;
////            this.y = y;
////        }
////    }
////
////
////}
//
//import java.util.*;
//
//class Program {
//
//    Map<Integer,Boolean> visitedNodes;
//
//    public boolean cycleInGraph(int[][] edges) {
//        // Write your code here.
//        visitedNodes = new HashMap<Integer,Boolean>();
//        Stack<Node> frontier = new Stack<Node>();
//        frontier.push(new Node(0, edges[0]));
//
//        while(!frontier.isEmpty()) {
//            Node curr = frontier.pop();
//
//            if(visitedNodes.get(curr.nodeNumber))
//                return true;
//
//            for(Node neighbor: curr){
//                frontier.push(new Node(neighbor, edges[edge]));
//            }
//
//        }
//
//
//
//
//        return false;
//    }
//
//    public class Node{
//        int[] edges;
//        int nodeNumber;
//        public Node(int nodeNumber, int[] edges) {
//            this.edges = edges;
//            this.nodeNumber = nodeNumber;
//        }
//
//    }
//
//
//}
//
