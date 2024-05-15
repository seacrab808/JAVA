package ch_05;

abstract class Food {
	private String foodName;
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodName() {
		return foodName;
	}
	public Food(String foodName) {
		this.foodName = foodName;
	}
	public abstract void cook();
	public abstract void taste();
}

class Noodle extends Food {
	public Noodle(String foodName) {
		super(foodName);
	}
	public void cook() {
		System.out.println("끓는 물에 라면과 스프를 넣고 2분간 끓인다.");
	}
	public void taste() {
		System.out.println("개운하고 구수한 맛이 난다.");	
	}
}

class FriedRice extends Food {
	public FriedRice(String foodName) {
		super(foodName);
	}
	public void cook() {
		System.out.println("밥과 각종 야채를 기름에 볶는다.");
	}
	public void taste() {
		System.out.println("밥이 고슬고슬하고 잘 볶아진 야채가 잘 어우러진다.");	
	}
}

public class FoodTest {
	public static void main(String[] args) {
		Food[] f = new Food[2];
		f[0] = new Noodle("라면");
		f[1] = new FriedRice("볶음밥");
		
		for(int i = 0; i < f.length; i++) {
			System.out.println("음식명: " + f[i].getFoodName());
			f[i].cook();
			if(f[i] instanceof Noodle) {
				System.out.println("파를 넣는다.");
			}
			f[i].taste();
			System.out.println("**********************************");
		}
	}
}
