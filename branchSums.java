import java.util.ArrayList;
import java.util.List;

public class branchSums {



    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.

        ArrayList<Integer> ret = new ArrayList<Integer>();
        getBranchSums(root,ret,0);


        return ret;
    }

    public static void getBranchSums(BinaryTree currNode, ArrayList<Integer> arr, int currBranchSum) {

        if(currNode == null) {
            return;
        }
        // update the currBranchSum
        currBranchSum	+= currNode.value;

        // go left go right
        if(currNode.left == null && currNode.right == null){
            arr.add(currBranchSum);
            return;
        }
        getBranchSums(currNode.left,arr,currBranchSum);
        getBranchSums(currNode.right,arr,currBranchSum);

    }

}
