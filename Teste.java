
class Teste {
	public static void main(String args[]) {
		
		Calculo calculo = new Calculo();
		
		calculo.setA(2);
		calculo.setB(3);
		calculo.setC(-5);
		calculo.calcularDelta();

		if (calculo.getA() == 0)
			System.out.println("A equação com coeficiente A igual a 0 não é do segundo grau.");
		else if (calculo.calcularDelta() == 0) {
			double raiz1 = calculo.calcularRaiz1();
			System.out.println(calculo.getA() + "x²" + " + " + calculo.getB() + "x" + " + " + calculo.getC() + " = 0");
			System.out.println("Raiz 1: " + raiz1);
		} else if (calculo.calcularDelta() > 0) {
			double raiz1 = calculo.calcularRaiz1();
			double raiz2 = calculo.calcularRaiz2();

			System.out.println(calculo.getA() + "x²" + " + " + calculo.getB() + "x" + " + " + calculo.getC() + " = 0");
			System.out.println("Raiz 1: " + raiz1);
			System.out.println("Raiz 2: " + raiz2);
		}
	}
}