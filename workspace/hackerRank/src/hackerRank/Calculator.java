package hackerRank;

class Calculator implements AdvancedArithmetic{
	int power(int n, int p){
		if(n < 0 || p < 0){
			throw new IllegalArgumentException("n and p should be non-negative");
		}
		return (int)Math.pow(n, p);
	}

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		for(int i=1; i <= n; i++){
			if(n % i == 0){
				sum += n / i;
			}
		}
		return sum;
	}

}
