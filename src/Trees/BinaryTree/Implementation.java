package Trees.BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class Implementation {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        // from the preorder
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }



    public static void inorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    public static void postorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root){
        if(root == null )return;

        Queue<Node> traverse = new LinkedList<>(){};
        traverse.add(root);
        traverse.add(null);

        while(!traverse.isEmpty()){
            Node temp = traverse.remove();

            if(temp == null){
                System.out.println();
                if(traverse.isEmpty()) break;
                traverse.add(null);
            }else {
                System.out.print(temp.data + " ");
                if(temp.left!=null)traverse.add(temp.left);
                if(temp.right!=null)traverse.add(temp.right);
            }
        }
    }

    static int count(Node root){
        if(root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }

    static int sum(Node root){
        if(root == null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }

    static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }

    static class Data{
        int height;
        int diameter;

        Data(int height,int diameter){
            this.diameter = diameter;
            this.height = height;
        }
    }

    static int diameter(Node root){
        Data value = diameter2(root);
        return value.diameter;
    }


    static Data diameter2(Node root){
        if(root == null) return new Data(0,0);
        Data left = diameter2(root.left);
        Data right = diameter2(root.right);

        //height
        int height = Math.max(left.height, right.height) +1;

        //diameter
        int leftdia = left.diameter;
        int rightdia = right.diameter;
        int currdia = 1 + left.height + right.height;
        int diameter = Math.max(leftdia,Math.max(rightdia,currdia));

        Data ans = new Data( height,diameter);
        return ans;
    }



    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // preorder
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println("Count = "+count(root));
        System.out.println("Sum = "+sum(root));
        System.out.println("height = "+height(root));
        System.out.println("diameter = "+diameter(root));

    }

}
