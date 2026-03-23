package contarpares;

public class ContarPares {

	private static final int CERO = 0;

	public static void main(String[] args) {
		MostrarCantidadPares(100);
	}

	private static int MostrarCantidadPares(int n) {
		int contadorPares = CERO;
		for (int i = CERO; i <= 10; i++) {
			if (i % 2 == CERO)
				contadorPares++;
		}
		System.out.println("Hay " + contadorPares + " numeros pares del 0 al 10");
		return contadorPares;
	}
}
