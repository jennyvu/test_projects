package BinarySearchTree;

import java.util.Random;

public class TestBST {
	public static int randInt(int min, int max) {
		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
		// if min = 5 and max = 15
		// then rand.nextInt(11) --> take random number 0 to 10
		// min is 5 so random number from 0 to 10 add 5 will range from 5 to 15.
	}
	
	public static Tree randTree(int count) {
		if (count == 0) {
			return new EmptyBST();
		} else {
			return randTree(count - 1).add(randInt(0, 50));
		}
	}
	
	public static void checkIsEmpty(Tree t) throws Exception {
		if (t instanceof EmptyBST){
			if (!t.isEmpty()) {
				throw new Exception("It's not good. The tree is EmptyBST and it's non-empty");
			}
		} else if (t instanceof NonEmptyBST) {
			if (t.isEmpty()) {
				throw new Exception("It's not good. The tree is NonEmptyBST and it's empty");
			}
		}
	}

	public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
		int nt = (t.add(x)).cardinality();
		if (nt == (t.cardinality() + 1)) {
			if (t.member(x)) {
				throw new Exception("The Cardinality increased by 1, but the elt " +
			"added already member of the tree.");
			} //else { System.out.println("Adding is good..."); }
		} else if (nt == t.cardinality()) {
			if (!t.member(x)) {
				throw new Exception("The Cardinality did not increase by 1, " +
						"the elt add not member of the tree.");
			} //else { System.out.println("No adding is good..."); }
		} else {
			throw new Exception("Something goes wrong with program.");
		}
	}
}
