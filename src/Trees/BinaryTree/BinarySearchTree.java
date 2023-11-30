package Trees.BinaryTree;
// for BST the tree was to be balanced
/*
* for Bst
*   smaller element go to the left side
*   greater element go to the right side
*
* */
public class BinarySearchTree {
      public static class Node{
          int val;
          int height;
          Node left;
          Node right;

          public Node (int Value) {
              val = Value;
          }
      }

      private Node root;

      public int hight(Node node){
          if(node == null) return -1;
          return node.height;
      }

      public boolean isEmpty(){
          return root == null;
      }


//      Display
      public void display(){
          display(root,"Root Node: " );
      }

      private void display(Node node, String details){
          if(node == null) return;
          System.out.println(details+node.val);

          display(node.left,"Left child of "+node.val+" : ");
          display(node.right,"Right child of "+node.val+" : ");
      }

//     Insertion

    public void insertion(int val){
        if(root == null){
            root = new Node(val);
            return;
        }
        if(root.val >val){
//            left
            insertion(val,root.left);
        }else{
//            right
            insertion(val,root.right);
        }
    }
    private void insertion(int val,Node node){
          if(node == null){
              node = new Node(val);
              return;
          }
         if(node.val >val){
//            left
            insertion(val,node.left);
         }else{
//            right
             insertion(val,node.right);
         }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertion(15);
        tree.insertion(10);
        tree.insertion(20);
        tree.insertion(5);
        tree.insertion(12);
        tree.display();

    }

}
