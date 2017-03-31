/**
 * Created by conno on 31/03/2017.
 */
public class breadthNetwork {

    // Used to create a network of nodes
    breadthNode[] breadthNetwork() {

        // Creating the nodes of the network
        breadthNode nodeOne = new breadthNode(1);
        breadthNode nodeTwo = new breadthNode(2);
        breadthNode nodeThree = new breadthNode(3);
        breadthNode nodeFour = new breadthNode(4);
        breadthNode nodeFive = new breadthNode(5);

        // Creating adjacent nodes
        nodeOne.setAdjNodes(new breadthNode[] { nodeTwo, nodeFive });
        nodeTwo.setAdjNodes(new breadthNode[] { nodeOne, nodeThree, nodeFour });
        nodeThree.setAdjNodes(new breadthNode[] { nodeThree, nodeFour, nodeFive });
        nodeFour.setAdjNodes(new breadthNode[] { nodeTwo, nodeThree });
        nodeFive.setAdjNodes(new breadthNode[] { nodeOne, nodeThree });

        // Returning the network
        breadthNode[] network = new breadthNode[] { nodeOne, nodeTwo, nodeThree, nodeFour, nodeFive };

        return network;

    }

}
