package hackerRank;

public class BinarySearchTreeTest {
	
	public class Node{
		int data;
		Node left;
		Node right;
	}

	boolean checkBST(Node root) {
        return isBST(root, 0, 10000);
    }

    boolean isBST(Node node, int min, int max){
        if(node == null) {
            return true;
        }
        if(node.data < min || node.data > max) {
            return false;
        }
        return isBST(node.left, min, node.data - 1) && isBST(node.right, node.data + 1, max);
    }
    
	public static int getHeight(Node root){
		int leftH = 0, rightH = 0;
		if (root == null) {
			return -1;
		} else {
			if (root.left != null) {
				leftH = 1 + getHeight(root.left);
			} 
			if (root.right != null) {
				rightH = 1 + getHeight(root.right);
			}
			return Math.max(leftH, rightH); 
		}      
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
