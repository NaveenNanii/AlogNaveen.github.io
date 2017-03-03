package Trees;


public class BinarySearchTree {

	    class Node{
	        int key;
	        Node left,right;

	        public Node(int item){
	            key=item;
	            left=right=null;
	        }
	    }

	    Node root;

	    BinarySearchTree(){
	        root=null;
	    }

	    void insert(int key){
	        root=insertRec(root,key);
	    }

	    Node insertRec(Node root,int key){

	        if (root==null){
	            root=new Node(key);
	            return root;
	        }
	        if (key<root.key)
	            root.left=insertRec(root.left,key);
	        else if (key>root.key)
	            root.right=insertRec(root.right,key);
	        return root;
	    }

	    void inorder(){
	        inorderRec(root);
	    }

	    void inorderRec(Node root){
	        if (root!=null){
	            inorderRec(root.left);
	            System.out.println(root.key);
	            inorderRec(root.right);
	        }
	    }

	    public static void main(String[] args) {
	        BinarySearchTree tree1=new BinarySearchTree();
	        tree1.insert(90);
	        tree1.insert(80);
	        tree1.insert(70);
	        tree1.insert(60);
	        tree1.insert(50);
	        tree1.inorder();
	    }
	}


