package generics_tipos_curinga;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<Integer> meusNumeros = Arrays.asList(5,2,10);
		imprimirLista(meusNumeros);
		
		List<String> meusStrings = Arrays.asList("Adriano", "Andre", "Antonio Carlos");
		imprimirLista(meusStrings);
		
		//OBS: Uma List<?>(lista do tipo curinga) não aceita o metodo .add().
	}
	
	public static void imprimirLista(List<?> lista) {
		for(Object obj : lista) {
			System.out.println(obj);
		}
	}

}
