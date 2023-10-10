package Trees.BinaryTree;
import java.util.*;
public class KKImplementation {

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;


    public void addVal(Scanner sc){
        System.out.println("Enter the root value:");
        root = new Node(sc.nextInt());
        addVal(sc, root);
    }

    private void addVal(Scanner sc, Node root){
        System.out.println("Do you want to add left child of "+root.val);
        boolean isLeft = sc.nextBoolean();
        if(isLeft){
            System.out.println("Enter the value of left of the "+root.val);
            root.left = new Node(sc.nextInt());
            addVal(sc,root.left);
        }

        System.out.println("Do you want to add right child of "+root.val);
        boolean isRight = sc.nextBoolean();
        if(isRight){
            System.out.println("Enter the value of right of the "+root.val);
            root.right = new Node(sc.nextInt());
            addVal(sc,root.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node root,String indent){
        if(root == null) return;
        System.out.println(indent+root.val);
        display(root.left,indent+"\t");
        display(root.right,indent+"\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KKImplementation tree = new KKImplementation();
        tree.addVal(sc);
        tree.display();
    }
}
