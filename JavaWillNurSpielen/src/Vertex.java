public class Vertex {
	public double x;
	public double y;

	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ",  " + y + ")";
	}

	public double length() {
		return Math.sqrt(x * x + y * y);
	}

	public Vertex skalarMult(double s) {
		return new Vertex(x * s, y * s);
	}

	public void skalarMultMod(double s) {
		x = s * x;
		y = s * y;
	}

	public Vertex add(Vertex that) {
		return new Vertex(x + that.x, y + that.y);
	}

	public void addMod(Vertex that) {
		x = x + that.x;
		y = y + that.y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX(double x) {
		return x;
	}

	public double getY(double y) {
		return y;
	}

	public boolean equals(Object thatObject) {
		if (thatObject instanceof Vertex) {
			Vertex that = (Vertex) thatObject;
			return this.x == that.x && this.y == that.y;
		} else {
			return false;
		}

	}

	public Vertex sub(Vertex that) {
		return new Vertex(x - that.x, y - that.y);
	}

	public double distance(Vertex that) {
		double a = that.x - this.x;
		double b = that.y - this.y;
		return Math.sqrt(a * a + b * b);
	}

	public void normalize() {
		double factor = this.length();
		this.x = x / factor;
		this.y = y / factor;
	}

}
