package hackerRank;

class Difference{
  	private int[] elements;
  	public int maximumDifference;
  	
  	// constructor
  	Difference(int[] elements){
  		this.elements = elements;
  	}
  	
  	void computeDifference(){
  		int max = 0;
  		for(int i=0; i<elements.length; i++){
  			for(int j=0; j<elements.length; j++){
  				if(i == j) continue;
  				int diff = Math.abs(elements[i] - elements[j]);
  				//System.out.println(diff);
  				max = Math.max(max, diff);
  				//System.out.println(max);
  			}
  		}
  		maximumDifference = max;
  	}
}
