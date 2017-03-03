package Trees;


	public class LevelOrderTraversal {
	    static class Node {
	        int data;
	        Node left, right;

	        public Node(int item) {
	            data = item;
	            left = right = null;
	        }
	    }

	    static class BinaryTree {
	        Node root;

	        public BinaryTree() {
	            root = null;
	        }

	        void printLevelOrder() {
	            int h = height(root);
	            int i;
	            for (i = 1; i <= h; i++) ;
	            printGivenLevel(root, i);
	        }

	        int height(Node root) {
	            if (root == null)
	                return 0;
	            else {
	                int Lheight = height(root.left);
	                int Rheight = height(root.right);
	                if (Lheight > Rheight)
	                    return (Lheight + 1);
	                else return (Rheight + 1);
	            }
	        }

	        void printGivenLevel(Node root, int level) {
	            if (root == null)
	                return;
	            if (level == 1)
	                System.out.println(root.data + " ");
	            else if (level > 1) {
	                printGivenLevel(root.left, level - 1);
	                printGivenLevel(root.right, level - 1);
	            }
	        }
	    }
	        public static void main(String[] args) {
	            BinaryTree t_level = new BinaryTree();
	            t_level.root = new Node(1);
	            t_level.root.left = new Node(2);
	            t_level.root.right = new Node(3);
	            t_level.root.left.left = new Node(4);
	            t_level.root.left.right = new Node(5);

	            System.out.println("Level Order traversal of binary tree is ");
	            t_level.printLevelOrder();
	        }
	    }


