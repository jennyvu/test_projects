package StarWarInterfacePractice;

public class Hero implements Character {
	public String weapon = "Lightsaber";
	
	public Hero(){}

	@Override
	public void attack() {
		System.out.println("Hero attacks enemy.");
	}

	@Override
	public void heal() {
		System.out.println("Hero heal you.");
	}
	
	public void changeWeapon(String newWeapon){
		weapon = newWeapon;
	}

	public String getWeapon(){
		return weapon;
	}
}
