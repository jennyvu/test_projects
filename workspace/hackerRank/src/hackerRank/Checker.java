package hackerRank;

import java.util.Comparator;

public class Checker implements Comparator<Player>{
	public int compare(Player a, Player b){
		
		if(b.score > a.score){
			return 1;
		} else if(a.score == b.score){
			return a.name.compareTo(b.name);
		} else{
			return -1;
		}
		
		// or
		/*
		if(a.score == b.score){
			return a.name.compareTo(b.name);
		}
		return b.score - a.score;
		*/
	}
}
