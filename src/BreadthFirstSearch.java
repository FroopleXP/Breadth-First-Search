/**

    BREADTH FIRST SEARCH ALGORITHM
    Written by: Connor Edwards

 */
import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {

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

        // Creating the network
        breadthNode[] network = new breadthNode[] { nodeOne, nodeTwo, nodeThree, nodeFour, nodeFive };

        // Start the algorithm
        breadthNode finalNode = search(network, 1, 4);

        // Getting the final path
        System.out.print(finalNode.getParentNode().getNodeId());

    }

    // This is used to actually search through the network
    public static breadthNode search(breadthNode[] network, int start, int goal) {

        // Creating the a placeholder for the final node
        breadthNode finalNode = null;

        // Creating the queue
        Stack<breadthNode> queue = new Stack<>();

        // Creating a new instance of the root node
        breadthNode root = network[start - 1];

        // Changing the searched flag and adding it to the queue
        root.setParentNode(null);
        root.setSearch(true);

        // Adding the root to the Queue
        queue.push(root);

        // Looping through the node
        while (!queue.empty()) {
            breadthNode current = queue.pop();
            if (current.getNodeId() == goal) {
                finalNode = current;
                break;
            } else {
                for (breadthNode edge : current.getAdjNodes()) {
                    if (!edge.getSearch()) {
                        edge.setSearch(true);
                        edge.setParentNode(current);
                        queue.push(edge);
                    }
                }
            }
        }

        // Returning the final node
        return finalNode;

    }

}
