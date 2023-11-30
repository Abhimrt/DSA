package Trees.BinaryTree;

import java.util.Scanner;

/*
* THERE are 2 types of implementation
*   1. Linked representation
*   2. Sequential representation i.e. array (mainly we use for complete binary tree)
* */
public class Implementation {

    public Implementation(){

    }

//    Node template
    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

//    Root node
    private Node root;

//    insert Element
    public void populate(Scanner scanner){
        System.out.print("Enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        System.out.println("All the question was to be answer in 'true' or 'false'");
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.print("Do you want to enter the left node of "+node.val+" : ");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.print("Enter the left node value: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.print("Do you want to enter the right node of "+node.val+" : ");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.print("Enter the right node value: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }

    }

//    Display Elements
     public void display(){
        display(root,"");
     }

     private void display(Node node,String indent){
        if(node==null) return;
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
     }

     public void prettyDisplay(){
        prettyDisplay(this.root,0);
     }

     private void prettyDisplay(Node node,int level){
         if(node==null) return;
         prettyDisplay(node.right,level+1);
         if(level !=0){
             for (int i = 0; i < level - 1; i++) {
                 System.out.print("|\t\t");
             }
             System.out.println("|------->"+node.val);
         }else{
             System.out.println(node.val);
         }
         prettyDisplay(node.left,level+1);
     }

//     main function starts here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Implementation tree = new Implementation();
        tree.populate(sc);
        tree.prettyDisplay();
    }

}