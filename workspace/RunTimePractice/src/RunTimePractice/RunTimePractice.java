package RunTimePractice;

import java.util.HashMap;

public class RunTimePractice {
	
	public static int findNumsOfRepetition(String s, char c) {
		// linear time O(n)
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] findNumsOfRepetitionV1(String s, char[] c) {
		// quaratic time O(n*m)
		int[] count = new int[c.length];
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < c.length; j++){
				if(s.charAt(i) == c[j]) {
					count[j] += 1;
				}
			}
		}
		return count;
	}
	
	public static int[] findNumsOfRepetitionV2(String s, char[] c) {
		// linear time O(n + m)
		int[] count = new int[c.length];
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++){
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				int num = map.get(s.charAt(i));
				map.put(s.charAt(i), num + 1);
			}
		}
		
		for(int j = 0; j < c.length; j++) {
			if(!map.containsKey(c[j])){
				count[j] = 0;
			} else {
				count[j] = map.get(c[j]);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(findNumsOfRepetition("ddadfdfjtrtldfjabcabcieurouaskdfj", 'a'));
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Start at: " + startTime);
		System.out.println("End at: " + endTime);
		System.out.println("Test: " + duration + "ms");
		
		char[] a = {'a', 'd', 'c', 'f', 'e'};
		String s = "ddadfdfjtrtldfjabcabcieurouaskdfjldfhalkererkhdferyiydfadffdfjerwerersdfasfsdfeuryqw" +
		"ddadfdfjtrtldfjabcabcieurouaskdfjldfhalkererkhdferyiydfadffdfjerwerersdfasfsdfeuryqw" +
				"ddadfdfjtrtldfjabcabcieurouaskdfjldfhalkererkhdferyiydfadffdfjerwerersdfasfsdfeuryqw";
		long startTime2 = System.currentTimeMillis();
		System.out.println(findNumsOfRepetitionV1(s, a));
		long endTime2 = System.currentTimeMillis();
		long duration2 = endTime2 - startTime2;
		System.out.println("Start at: " + startTime2);
		System.out.println("End at: " + endTime2);
		System.out.println("Test: " + duration2 + "ms");
		
		long startTime3 = System.currentTimeMillis();
		System.out.println(findNumsOfRepetitionV2(s, a));
		long endTime3 = System.currentTimeMillis();
		long duration3 = endTime3 - startTime3;
		System.out.println("Start at: " + startTime3);
		System.out.println("End at: " + endTime3);
		System.out.println("Test: " + duration3 + "ms");
	}

}
