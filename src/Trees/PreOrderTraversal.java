package Trees;

public class PreOrderTraversal {
	
	    static class Node {
	        int key;
	        Node left, right;

	        public Node(int item) {
	            key = item;
	            left = right = null;
	        }
	    }

	   static class BinaryTree {
	        Node root;

	        public BinaryTree() {
	            root = null;
	        }

	        void printPreorder(Node node) {
	            if (node == null)
	                return;

	            System.out.println(node.key + " ");
	            printPreorder(node.left);
	            printPreorder(node.right);
	        }

	        void printPreorder() {
	            printPreorder(root);
	        }
	    }


	        public static void main(String[] args) {
	            BinaryTree b=new BinaryTree();
	            b.root=new Node(1);
	            b.root.left=new Node(2);
	            b.root.right=new Node(3);
	            b.root.left.left=new Node(4);
	            b.root.left.right=new Node(5);
	            System.out.println("Preorder traversal of binary tree is ");
	            b.printPreorder();
	        }
	    }


