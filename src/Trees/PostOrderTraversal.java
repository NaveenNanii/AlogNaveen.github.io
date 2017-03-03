package Trees;

public class PostOrderTraversal {
	
	    static class Node{
	        int key;
	        Node left,right;

	        Node(int item){
	            key=item;
	            left=right=null;
	        }
	    }
	    static class BinaryTree{
	        Node root;

	        BinaryTree(){
	            root=null;
	        }

	        void PrintPostorder(Node node){
	            if (node==null)
	                return;
	            PrintPostorder(node.left);
	            PrintPostorder(node.right);
	            System.out.println(node.key+" ");
	        }
	        void PrintPostorder(){
	            PrintPostorder(root);
	        }
	    }

	    public static void main(String[] args) {
	        BinaryTree t=new BinaryTree();
	        t.root=new Node(1);
	        t.root.left=new Node(2);
	        t.root.right=new Node(3);
	        t.root.left.left=new Node(4);
	        t.root.left.right=new Node(5);

	        System.out.println("postorder traversal of binary tree is ");
	        t.PrintPostorder();
	    }

	}



