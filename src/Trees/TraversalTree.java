package Trees;


public class TraversalTree {
	
	
	    static class Node{
	        int key;
	        Node left,right;

	        public Node(int item){
	            key=item;
	            left=right=null;
	        }
	    }
	    static class BinaryTree {
	        Node root;

	        BinaryTree() {
	            root = null;
	        }

	        void printPostorder(Node node) {
	            if (node == null)
	                return;
	            printPostorder(node.left);
	            printPostorder(node.right);
	            System.out.println(node.key + " ");
	        }

	        void printInorder(Node node) {
	            if (node == null)
	                return;
	            printInorder(node.left);
	            System.out.println(node.key + " ");
	            printInorder(node.right);
	        }

	        void printPreorder(Node node) {
	            if (node == null)
	                return;
	            System.out.println(node.key + " ");
	            printPreorder(node.left);
	            printPreorder(node.right);
	        }

	        void printPostorder() {
	            printPostorder(root);
	        }

	        void printInorder() {
	            printInorder(root);
	        }

	        void printPreorder() {
	            printPreorder(root);
	        }
	    }
	        public static void main(String[] args) {
	         BinaryTree tree=new BinaryTree();

	         tree.root=new Node(1);
	         tree.root.left=new Node(2);
	         tree.root.right=new Node(3);
	         tree.root.left.left=new Node(4);
	         tree.root.right.right=new Node(5);

	            System.out.println("preorder traversal of binarytree is ");
	            tree.printPreorder();
	            System.out.println("\ninorder traversal of binarytree is ");
	            tree.printInorder();
	            System.out.println("postorder traversal of binarytree is ");
	            tree.printPostorder();
	        }
	    }



