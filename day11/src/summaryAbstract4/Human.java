package summaryAbstract4;

public class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}
	
	void give(Animal ob) {
		String feed = "먹이";
		if(ob instanceof Cat) {
			feed = "츄르";
		}
		else if(ob instanceof Dog) {
			feed = "육포";
		}
		System.out.printf("%s이 %s에게 %s를 준다\n", name, ob.name, feed);
	}
	
	void give(Human ob) {
		String feed = "치즈";
		System.out.printf("%s이 %s에게 %s를 준다\n", name, ob.name, feed);
	}
}
