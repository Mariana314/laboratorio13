import javax.swing.JOptionPane;

public class Flecha {
	int longitud;
	String color;

	public Flecha() {
		longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud a procesar"));
		color="negro";
	}
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	public Flecha(int longitud, String color) {
		this.longitud=longitud;
		this.color=color;
	}
	
	public void construirFlecha(){
		for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}

	private void imprime(String simbolo) {
		if (color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.err.print(simbolo);
		}
	}
	
}
