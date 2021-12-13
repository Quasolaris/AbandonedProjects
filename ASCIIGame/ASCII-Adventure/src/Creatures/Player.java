package Creatures;
public class Player extends Character{
	
	int money = 100;
	//--------------------------Constructor--------------------------
	public Player(String Name, double Height, int Age) {
		super.Name = Name;
		super.Height = Height;
		super.Age= Age;
		super.Player = true;
		super.Attack = 10;
		super.Defense = 20;
		super.Health = 30;
		super.maxHealth = 30;
		super.fillInventory();
	}
	
	public int getMoney() {
		return money;
	}
	
	public boolean buy(int i) {
		if(money-i >=0) {
			money -= i;
			return true;
		}
		
	return false;
	}
	
}
