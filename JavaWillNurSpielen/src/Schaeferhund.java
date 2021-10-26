
public class Schaeferhund extends Hund{

	public static void main(String[] args) {
		

	}
 
		public Schaeferhund(String name, int alter, double lautstaerkeDB) {
		super(name, alter, lautstaerkeDB);
		this.rasse= "Schaeferhund";
	}
@Override public double ausgeben() {
	return lautstaerkeDB*1.5;
}
}
