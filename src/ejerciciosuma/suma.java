package ejerciciosuma;

public class suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche = new Coche();
		miCoche.sumarpuerta();
		System.out.println("se agrego 1 puerta, el total de puerta del coche es:  "+ miCoche.numPuerta);
		
		int resul=sumar(2,5,6);
		System.out.println("el resultado de la suma es: " + resul);
		

	}
	
	public static int sumar(int a,int b, int c) {
		return a+b+c;
	}
	
	static class Coche {
		
		public int numPuerta=3;
		
		public void sumarpuerta() {
			this.numPuerta++;
		}

	}

}
