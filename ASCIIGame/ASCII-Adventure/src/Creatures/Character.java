package Creatures;
import java.util.Random;

public abstract class Character {
	
	//--------------------------Attributes--------------------------
	protected String Name;
	protected double Height;
	protected int Age;
	protected int Attack;
	protected int Defense;
	protected int Health;
	protected int maxHealth;
	protected int[][] Inventory = new int[10][2];
	protected boolean Player = false;
	Random rand = new Random();
	
	//Number of item equals index of Items-Array
	protected Object[] Items = new Object[10];

	//--------------------------Constructor--------------------------

	
	//--------------------------Methodes----------------------------
	public void getPlayerInfo() {
		System.out.println("____________________________");
		System.out.println("Name: " + Name);
		System.out.println("Height: " + Height);
		System.out.println("Age: " + Age);
		System.out.println("Attack: " + Attack);
		System.out.println("Defense: " + Defense);
		System.out.println("Healt: " + Health);
		System.out.println("----------------------------");
		System.out.println("Inventory: ");
		for(int i = 0; i < Inventory.length; i++) {
				System.out.println(ItemtoString(Inventory[i][0]) + ": " + Inventory[i][1]);
			}
		System.out.println("____________________________");
	}
	
	public void addItem(int item, int amount) {
		Inventory[item][1] += amount;
	}
	
	public String ItemtoString(int index){
		return (String) Items[index];
	}
	
	
	public void getOlder(int i) {
		Age += i;
	}
	
	public boolean isPlayer() {
		return Player;
	}
	
	public void inflictDamage(int d) {
		int deflect = Defense;
		int luck;

		
		//Luck (If character can deflect or not)
		luck = rand.nextInt(3);
		if(luck == 1) {
			if(Defense -d >= 0) {
				deflect = d;
			}
			System.out.println(Name + " deflected " + deflect + " damage!");
			Health -=  d - deflect;
		}
		else {
			deflect = 0;
			Health -= d;
		}
		System.out.println(Name + " gets hit and got " + (d-deflect) + " damage.");
	}
	
	public void Heal(int h) {
		if(Health+h >= maxHealth) {
			Health = maxHealth;
		}
		
		else {
			Health += h;
		}
	}
	
	public int Attack() {
		System.out.println(Name + " attacks with " + Attack+ ".");
		return Attack;
	}
	
	public int getHealth() {
		return Health;
	}
	
	public boolean isDead() {
		if(Health <= 0) {
			return true;
		}
		return false;
	}
	//--------------------------Items----------------------------
	public void fillInventory() {
		
		//Fill with items
		/*
		 * Index of Items
		 * 0: Water
		 * 1: Food
		 * 2: Mug
		 * 3: Arrow
		 * 4: Bow
		 * 5: Sword
		 * 6: Shield
		 * 7: Cloth
		 * 8: Helmet
		 * 9: Shoes
		 */
		Items[0] = "Water"; 
		Items[1] = "Food";
		Items[2] = "Mug"; 
		Items[3] = "Arrow";
		Items[4] = "Bow"; 
		Items[5] = "Sword";
		Items[6] = "Shield"; 
		Items[7] = "Cloth";
		Items[8] = "Helmet"; 
		Items[9] = "Shoes";
		
		//Add basic items
		//Water
		Inventory[0][0] = 0;
		Inventory[0][1] = 6;
		//Food
		Inventory[1][0] = 1;
		Inventory[1][1] = 4;
		//Mug
		Inventory[2][0] = 2;
		Inventory[2][1] = 0;
		//Arrow
		Inventory[3][0] = 3;
		Inventory[3][1] = 0;
		//Bow
		Inventory[4][0] = 4;
		Inventory[4][1] = 0;
		//Sword
		Inventory[5][0] = 5;
		Inventory[5][1] = 1;
		//Shield
		Inventory[6][0] = 6;
		Inventory[6][1] = 1;
		//Cloth
		Inventory[7][0] = 7;
		Inventory[7][1] = 1;
		//Helemt
		Inventory[8][0] = 8;
		Inventory[8][1] = 1;
		//Shoes
		Inventory[9][0] = 9;
		Inventory[9][1] = 1;
	}
}
