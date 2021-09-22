import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestBranchSums {
    branchSums b;
    BinaryTree tree;
    List<Integer> soln;
    @BeforeEach
    void before(){
        b = new branchSums();
        tree = new BinaryTree(1);
        tree.left = new BinaryTree(1);
        tree.right = new BinaryTree(1);
        tree.left.left = new BinaryTree(1);
        tree.left.right = new BinaryTree(1);
        soln = new ArrayList<>();
        soln.add(3);
        soln.add(3);
        soln.add(2);
    }

    @Test
    void testBranchSums(){
        System.out.println("Solution is: ");
        System.out.println(soln.toString());

        List<Integer> output = b.branchSums(tree);

        System.out.println("Output is: ");
        System.out.println(output.toString());


    }

}
