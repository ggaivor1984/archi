package day18;

public class Task3 {
    public static void main(String[] args) throws MyException {
        Node root = new Node(20);
        int[] treeNumbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        for (int number : treeNumbers) {
            addToTree(number, root);
        }

        deepSearch(root);
    }

    public static void deepSearch(Node node) {
        if (node == null) return;

        deepSearch(node.getLeft());
        System.out.print(node.getValue() + " ");
        deepSearch(node.getRight());
    }
    public static void addToTree(int neededValue, Node root) throws MyException {
        if (root == null) throw new MyException("Корневой узел не может указывать на null. Создайте корневой узел");

        Node lowerNode = root;
        Node currentNode = null;

        while (lowerNode != null) {
            currentNode = lowerNode;
            if (neededValue < currentNode.getValue()) {
                lowerNode = currentNode.getLeft();
            } else lowerNode = currentNode.getRight();
        }
        if (neededValue < currentNode.getValue()) {
            currentNode.setLeft(new Node(neededValue));
        } else currentNode.setRight(new Node(neededValue));
    }
}