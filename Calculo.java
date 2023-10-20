class Calculo {

	private int a;
	private int c;
	private int b;
	private double delta;

	public Calculo() {
	}

	double calcularDelta() {
		double delta = (Math.pow(b, 2) - (4 * a * c));
		this.delta = delta;
		if (delta < 0) {
			System.out.println("A equação não possui raízes reais.");
			System.exit(0);
		}
		return delta;
	}

	public double calcularRaiz1() {
		return (((b * -1) + Math.sqrt(calcularDelta())) / (2 * a));
	}

	public double calcularRaiz2() {
		return (((-b) - Math.sqrt(calcularDelta())) / (2 * a));
	}

	public double getDelta() {
		return delta;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void setB(int b) {
		this.b = b;
	}

}