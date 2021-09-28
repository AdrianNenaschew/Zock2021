
public class TestVertex {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 0);
		Vertex v3 = v1.skalarMult (45.5);

		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v2.length());

	}

}
