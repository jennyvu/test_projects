package BinarySearchTree;

public class BinarySearchTree {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		EmptyBST e = new EmptyBST();
		NonEmptyBST ne = new NonEmptyBST(5);
		TestBST.checkIsEmpty(e);
		TestBST.checkIsEmpty(ne);
		
		TestBST.checkAddMemberCardinality(e, 5);
		TestBST.checkAddMemberCardinality(ne, 5);
		TestBST.checkAddMemberCardinality(ne, 6);
		
		int tests = 1000;
		for (int i = 0; i < tests; i++) {
			Tree t;
			if (i % 10 == 0) {
				t = TestBST.randTree(0);
			} else {
				t = TestBST.randTree(10);
			}
			TestBST.checkAddMemberCardinality(t, i);
		}
	}

}
