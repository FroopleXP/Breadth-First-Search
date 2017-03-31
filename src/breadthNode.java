/**
 * Created by conno on 31/03/2017.
 */
public class breadthNode {

    // Values of the node
    private breadthNode parentNode;
    private boolean search;
    private int nodeId;
    private breadthNode[] adjNodes;

    // Constructor
    breadthNode(int nodeId) {
        this.nodeId = nodeId;
    }

    // Used to set the parent node
    public void setParentNode(breadthNode parent) {
        this.parentNode = parent;
    }

    // Used to set the search value
    public void setSearch(boolean searched) {
        this.search = searched;
    }

    // Used to get the searched value
    public boolean getSearch() {
        return this.search;
    }

    // Used to set the adjacent nodes
    public void setAdjNodes(breadthNode[] adjNodes) {
        this.adjNodes = adjNodes;
    }

    // Used to return the id of the node
    public int getNodeId () {
        return this.nodeId;
    }

    // Used to return adjNode
    public breadthNode[] getAdjNodes() {
        return this.adjNodes;
    }

    // Used to get the parent node
    public breadthNode getParentNode() {
        return this.parentNode;
    }

}
