package ejercicio2;

public class entradas {
	private static int entradasTotales = 1225;
	private static int entradaZonaPrincipal = 100;
	private static int entradaZonaPlatea = 200;
	private static int entradaZonaVip = 25;
	
	public entradas(int entradasTotales, int entradaZonaPrincipal, int entradaZonaPlatea, int entradaZonaVip) {
		this.entradaZonaPrincipal = 1000;
		this.entradaZonaPlatea = 200;
		this.entradaZonaVip = 25;
		this.entradasTotales = 1225;
	}

	public static int getEntradasTotales() {
		return entradasTotales;
	}

	public static int setEntradasTotales(int entradasTotales) {
		return entradasTotales;
	}

	public static int getEntradaZonaPrincipal() {
		return entradaZonaPrincipal;
	}

	public void setEntradaZonaPrincipal(int entradaZonaPrincipal) {
		this.entradaZonaPrincipal = entradaZonaPrincipal;
	}

	public static int getEntradaZonaPlatea() {
		return entradaZonaPlatea;
	}

	public void setEntradaZonaPlatea(int entradaZonaPlatea) {
		this.entradaZonaPlatea = entradaZonaPlatea;
	}

	public static int getEntradaZonaVip() {
		return entradaZonaVip;
	}

	public void setEntradaZonaVip(int entradaZonaVip) {
		this.entradaZonaVip = entradaZonaVip;
	}

	@Override
	public String toString() {
		return "entradas [entradasTotales=" + entradasTotales + ", entradaZonaPrincipal=" + entradaZonaPrincipal
				+ ", entradaZonaPlatea=" + entradaZonaPlatea + ", entradaZonaVip=" + entradaZonaVip + "]";
	}
	
	
}
