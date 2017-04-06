package simpleTests;

public class Deck3 {
	private static Card3[] cards = new Card3[52];
	
	public Deck3(){
		int i = 0;
		for(Suit suit : Suit.values()){
			for(Rank rank: Rank.values()){
				cards[i++] = new Card3(rank, suit);
			}
		}
	}
	
	public Card3 getCard(Rank rank, Suit suit){
		return new Card3(rank, suit);
	}
	
	public static void main(String[] args) {
        Deck3 deck = new Deck3();
        for(Suit suit : Suit.values()){
			for(Rank rank: Rank.values()){
				System.out.println(deck.getCard(rank, suit));
			}
		}
    }

}
