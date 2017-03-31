/**

    BREADTH FIRST SEARCH ALGORITHM
    Written by: Connor Edwards

 */
public class BreadthFirstSearch {

    public static void main(String[] args) {

        // Creating a mock network, this will later be created via a JSON file
        breadthNode nodeOne = new breadthNode(1);
        breadthNode nodeTwo = new breadthNode(2);
        breadthNode nodeThree = new breadthNode(3);
        breadthNode nodeFour = new breadthNode(4);
        breadthNode nodeFive = new breadthNode(5);

        // Creating adjacent nodes for each node
        nodeOne.setAdjNodes(new breadthNode[] { nodeTwo, nodeFive });
        nodeTwo.setAdjNodes(new breadthNode[] { nodeOne, nodeThree, nodeFour });
        nodeThree.setAdjNodes(new breadthNode[] { nodeTwo, nodeFour, nodeThree });
        nodeFour.setAdjNodes(new breadthNode[] { nodeTwo, nodeThree });
        nodeFive.setAdjNodes(new breadthNode[] { nodeThree, nodeOne});

        // Creating the network
        breadthNode[] network = new breadthNode[] { nodeOne, nodeTwo, nodeThree, nodeFour, nodeFive };

        // Start the algorithm
        String path = search(network, 1, 5);

    }

    // Used to actually search through the network
    public String search(breadthNode[] network, int start, int goal) {

    }

}
