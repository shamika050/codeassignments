package counting;

import com.butterfly.Flyable;
import com.butterfly.Walkable;
import com.coding.add.birds.Animal;
import com.coding.add.birds.Singable;
import com.coding.add.birds.SwimmingAnimal;
import com.coding.main.Bird;

public class CountingAnimals {
	
	public void count(Animal[] animals) {
		
		//Animals who can walk
		int walkableCount = 0;
		int flyableCount = 0;
		int swimableCount = 0;
		int singableCount = 0;
		for(Animal animal : animals) {
			if(animal instanceof Walkable) {
				walkableCount++;
			}
			if(animal instanceof Flyable) {
				flyableCount++;
			}
			if(animal instanceof Singable) {
				singableCount++;
			}
			if(animal instanceof SwimmingAnimal) {
				swimableCount++;
			}
		}
		System.out.println(walkableCount);
		System.out.println(flyableCount);
		System.out.println(swimableCount);
		System.out.println(singableCount);
		
	}

}
