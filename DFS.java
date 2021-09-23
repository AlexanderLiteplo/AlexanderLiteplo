import java.util.*;

public class DFS {

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch() {
            // Write your code here.
            List<String> array = new ArrayList<>();
            Stack<Node> myStack = new Stack<Node>();
            System.out.println("test");

            myStack.add(this);

            while(!myStack.isEmpty()) {
                Node curr = myStack.pop();
                array.add(curr.name);

                for(Node node: curr.children) {
                    myStack.push(node);
                }
                System.out.println(curr.name);
            }


            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
