package StarWarInterfacePractice;

public class Enemy implements Character {
	
	public String weapon = "Lightsaber";
	
	public Enemy(){}

	public void attack() {
		System.out.println("Enemy attacks you.");
	}

	public void heal() {
		System.out.println("Enemy heals himself.");

	}
	
	public void drawWeapon(){
		System.out.println("Enemy draw weapon.");
	}
	
	public String getWeapon(){
		return weapon;
	}

}
