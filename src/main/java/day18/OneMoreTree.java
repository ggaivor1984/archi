package day18;

public class OneMoreTree {
    public static void main(String[] args) {
        Node root1 = new Node(50);
        int [] numbers1 = {12,34,3,56,4,89,100,45,9,6,899};
        for(int digit : numbers1){
        add(digit,root1);
            //System.out.println(root1);
        }
        searchAndPrint(root1);
    }
    private static void add(int valueToAdd, Node root){
        if(root == null) throw new IllegalArgumentException("корень не может быть пустым");

        Node nextNode = root;
        Node current = null;

        while(nextNode != null){
            current = nextNode;
            if(valueToAdd < current.getValue()){
                nextNode = current.getLeft();
            }else nextNode = current.getRight();
        }

        if(valueToAdd < current.getValue()){
            current.setLeft(new Node(valueToAdd));
        } else current.setRight(new Node(valueToAdd));
    }

    public static void searchAndPrint(Node root){
        if(root == null) return;

        searchAndPrint(root.getLeft());
        System.out.print(root.getValue() + " ");
        searchAndPrint(root.getRight());
    }
}
