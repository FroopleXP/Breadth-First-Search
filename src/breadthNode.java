/**

    BREADTH FIRST SEARCH ALGORITHM
    Written by: Connor Edwards

 */
public class breadthNode {

    private int nodeId; // Holds the ID of the Node

    private breadthNode[] adjNodes; // Holds the adjacent nodes
    private boolean searched; // Holds the value of whether or not this node has been searched
    private breadthNode parent; // Will contain the ID of it's parent

    // When a new Node is created it is given an ID
    breadthNode(int nodeId) {
        this.nodeId = nodeId;
        this.searched = false;
    }

    // Used to set the adjacent node of the node
    public void setAdjNodes(breadthNode[] nodes) {
        this.adjNodes = nodes;
    }

    // Used to set the searched value (True/false)
    public void setSearched(boolean searched) {
        this.searched = searched;
    }

    // Used to set the parent node
    public void setParent(breadthNode parentNode) {
        this.parent = parentNode;
    }

    // Used to return the id of the node
    public int getNodeId () {
        return this.nodeId;
    }

}
