package Binary;

import java.util.Scanner;

public class BinaryTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = createTree();
        System.out.print("\nInOrder -> ");
        inOrder(root);
        System.out.print("\nPreOrder -> ");
        preOrder(root);
        System.out.print("\nPostOrder -> ");
        postOrder(root);
    }

    static Node createTree(){
        Node root = null;

//      data of the tree
        System.out.print("Enter the data: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

//      Left side of the tree
        System.out.println("Enter left side of "+data);
        root.left = createTree();

//      Right side of the tree
        System.out.println("Enter right side of "+data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root){
        if(root == null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node root){
        if(root == null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
    }

}
