package Creatures;

public class testCreature extends Character{
	public testCreature(String Name, double Height, int Age) {
		super.Name = Name;
		super.Height = Height;
		super.Age= Age;
		super.Attack = 5;
		super.Defense = 5;
		super.Health = 20;
		super.maxHealth = 20;
		super.fillInventory();
	}
}
