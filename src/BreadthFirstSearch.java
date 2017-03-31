/**
 * Created by conno on 31/03/2017.
 */
public class BreadthFirstSearch {

    // Creating a mock network, this will later be generated via JSON
    private breadthNode nodeOne = new breadthNode(1);
    private breadthNode nodeTwo = new breadthNode(2);
    private breadthNode nodeThree = new breadthNode(3);
    private breadthNode nodeFour = new breadthNode(4);
    private breadthNode nodeFive = new breadthNode(5);

    // Creating the adjacent nodes for each node
    private breadthNode[] nodeOneAdj = new breadthNode[] { nodeTwo, nodeFive };
    private breadthNode[] nodeTwoAdj = new breadthNode[] { nodeOne, nodeThree, nodeFour };
    private breadthNode[] nodeThreeAdj = new breadthNode[] { nodeTwo, nodeFour, nodeFive };
    private breadthNode[] nodeFourAdj = new breadthNode[] { nodeTwo, nodeThree };
    private breadthNode[] nodeFiveAdj = new breadthNode[] { nodeThree, nodeOne };

    // Adding the adjacent nodes to the nodes

    // Adding the nodes to the network
    breadthNode[] network = new breadthNode[] {
            nodeOne, nodeTwo, nodeThree, nodeFour, nodeFive
    };

    public static void main(String[] args) {
        System.out.print("This is a test...");
    }


}
