package Trees;

	public class InorderTraversal {
	    static class Node{
	        int key;
	        Node left,right;

	        Node(int item){
	            key=item;
	            left=right=null;

	        }
	    }
	    static class BinaryTree {
	        Node root;

	    BinaryTree(){
	        root=null;
	    }
	    void printInorder(Node node){
	    if (node==null)
	        return;
	    printInorder(node.left);
	        System.out.println(node.key+" ");
	        printInorder(node.right);
	    }

	    void printInorder(){
	        printInorder(root);
	        }

	        public static void main(String[] args) {
	            BinaryTree tt=new BinaryTree();
	            tt.root=new Node(1);
	            tt.root.left=new Node(2);
	            tt.root.right=new Node(3);
	            tt.root.left.left=new Node(4);
	            tt.root.left.right=new Node(5);
	            System.out.println("inorder traversal of binary tree is ");
	            tt.printInorder();
	        }
	    }
	}


