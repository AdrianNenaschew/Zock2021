
public class TestVertex {

	public static void main(String[] args) {
		/*
		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 23);
		Vertex v3 = new Vertex(0, 0);
		Vertex v4 = new Vertex(42, 23);
		

		System.out.println(v2.toString());
		System.out.println(v2);
		System.out.println(v1.length());
		System.out.println(v2.length());
		System.out.println(v3.length());
		System.out.println(v1.skalarMult(0.8));
		System.out.println(v1);
		v1.skalarMultMod(0.8);
		System.out.println(v1);
		System.out.println(v1.add(v2));
		System.out.println(v1);
		System.out.println(v2);
		v1.addMod(v2);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v2.equals(v3));
		System.out.println(v2.equals(v4));
		System.out.println(v4.equals(v2));
		*/
		GeometricObject o1 = new GeometricObject(17, 4, new Vertex(42, 23));
		GeometricObject o2 = new GeometricObject(17, 4);
		//GeometricObject o3 = new GeometricObject(17);
		GeometricObject o4 = new GeometricObject();

		System.out.println(o1.equals(o2));
		o2.moveTo(42, 23);
		System.out.println(o1.equals(o2));
		// System.out.println(o3.contains(new Vertex (10,3)));
		System.out.println(o4);
	}

}
