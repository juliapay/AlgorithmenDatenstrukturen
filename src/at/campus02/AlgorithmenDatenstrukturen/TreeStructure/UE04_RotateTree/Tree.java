package at.campus02.AlgorithmenDatenstrukturen.TreeStructure.UE04_RotateTree;

public class Tree {
    private Node root;

    public void addNode(TvShow newTvShow) {
        Node newNode = new Node(newTvShow);

        if (root == null) {
            root = newNode;
        } else {
            addNodeRecursive(root, newNode);
        }
    }

    private void addNodeRecursive(Node currentNode, Node newNode) {
        // TODO: Implementierung hinzufügen
    }

    public int getMaxDepth() {
        return getMaxDepth(root);
    }

    private int getMaxDepth(Node currentTree) {
        if (currentTree == null)
            return 0;
        else {
            int leftDepth = getMaxDepth(currentTree.getLeft());
            int rightDepth = getMaxDepth(currentTree.getRight());

            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

    /**
     * Knoten nach rechts rotieren:
     * <p>
     * N				 L
     * / \             / \
     * L   r     =>    ll  N
     * / \			      / \
     * ll lr               lr  r
     */
    public void rotateRight() {
        // TODO: Implementierung hinzufügen
    }


    /**
     * Knoten nach links rotieren:
     * <p>
     * N				 R
     * / \             / \
     * l   R     =>    N  rr
     * / \	      / \
     * rl rr       l  rl
     */
    public void rotateLeft() {
        // TODO: Implementierung hinzufügen
    }

    public int getNodeCount() {
        return getNodeCount(root);
    }

    private int getNodeCount(Node currentNode) {
        if (currentNode == null)
            return 0;
        else {
            Node leftNode = currentNode.getLeft();
            if (leftNode != null)
                return (1 + getNodeCount(leftNode));

            Node rightNode = currentNode.getRight();
            if (rightNode != null)
                return (1 + getNodeCount(rightNode));

            return 1;
        }
    }
}
