public class Hund {
	String rasse;
	String name;
	int alter;
	double lautstaerkeDB;
	public static void main(String[] args) { 
	Hund h1 =new  Hund("wau wau", 2, 31.4);
	System.out.println(h1.ausgeben());
	Hund h2 =new  Schaeferhund("wau wau 2", 2, 31.4);
	System.out.println(h2.ausgeben());
	}
	
	public Hund(String name, int alter, double lautstaerkeDB) {
		this.name = name;
		this.alter = alter;
		this.lautstaerkeDB = lautstaerkeDB;
	}

	public Hund(String name) {
		this(name,1, 1);
	}

	public Hund() {
		this("wau wau");
	}
	
	public double ausgeben() {
		return lautstaerkeDB;
	}
}
