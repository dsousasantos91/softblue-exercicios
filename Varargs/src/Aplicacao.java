
public class Aplicacao {

	public static void main(String[] args) {
		imprimir("a");
		imprimir("a", "b");
		imprimir("a", "b", "c");
		imprimir();
		
		String[] array = {"a", "b", "c"};
		imprimir(array);
	}
	
//	private static void imprimir(String s1) {
//		System.out.println(s1);
//	}
//	
//	private static void imprimir(String s1, String s2) {
//		System.out.println(s1);
//		System.out.println(s2);
//	}
//	
//	private static void imprimir(String s1, String s2, String s3) {
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//	}
	
	public static void imprimir(String... texto) {
		for (int i = 0; i < texto.length; i++) {
			System.out.println(texto[i]);
		}
	}
}
