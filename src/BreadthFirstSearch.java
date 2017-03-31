/**

    BREADTH FIRST SEARCH ALGORITHM
    Written by: Connor Edwards

 */
import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {

        // Creating the nodes of the network
        breadthNode node1 = new breadthNode(1);
        breadthNode node2 = new breadthNode(2);
        breadthNode node3 = new breadthNode(3);
        breadthNode node4 = new breadthNode(4);
        breadthNode node5 = new breadthNode(5);
        breadthNode node6= new breadthNode(6);
        breadthNode node7 = new breadthNode(7);
        breadthNode node8 = new breadthNode(8);
        breadthNode node9 = new breadthNode(9);
        breadthNode node10 = new breadthNode(10);

        // Creating adjacent nodes
        node1.setAdjNodes(new breadthNode[] { node2, node3 });
        node2.setAdjNodes(new breadthNode[] { node1, node3 });
        node3.setAdjNodes(new breadthNode[] { node1, node2, node4, node5, node6, node7 });
        node4.setAdjNodes(new breadthNode[] { node3, node7 });
        node5.setAdjNodes(new breadthNode[] { node3 });
        node6.setAdjNodes(new breadthNode[] { node3, node7, node8 });
        node7.setAdjNodes(new breadthNode[] { node4, node3, node6, node10 });
        node8.setAdjNodes(new breadthNode[] { node6, node9 });
        node9.setAdjNodes(new breadthNode[] { node8 });
        node10.setAdjNodes(new breadthNode[] { node7 });

        // Creating the network
        breadthNode[] network = new breadthNode[] { node1, node2, node3, node4, node5, node6, node7, node8, node9, node10 };

        // Getting the starting time
        final long startTime = System.currentTimeMillis();

        // Start the algorithm
        breadthNode finalNode = search(network, 1, 9);

        // Getting the end time
        final long endTime = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime - startTime) );

        // Getting the final path by traversing the network
//        String finalPath = findPath(finalNode, network);

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

    // Used to traverse the final path and present it in string form
//    public static String findPath(breadthNode finalNode, breadthNode[] network) {
//
//        return <String> finalNode.getParentNode();
//
//    }

}
