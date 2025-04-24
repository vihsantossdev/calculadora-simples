
class Calculadora {
	private double soma(double a, double b) {
		return a + b;
	}

	private double subtracao(double a, double b) {
		return a - b;
	}

	private double multiplicacao(double a, double b) {
		return a * b;
	}

	private double divisao(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Erro: divisão por zero!");
		}
		return a / b;
	}

	public double calcular(double a, double b, char operador) {
		switch (operador) {
		case '+':
			return soma(a, b);
		case '-':
			return subtracao(a, b);
		case '*':
			return multiplicacao(a, b);
		case '/':
			return divisao(a, b);
		default:
			throw new IllegalArgumentException("Erro: operador inválido!");
		}
	}
}
