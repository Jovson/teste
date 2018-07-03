
public class Teste {
	public static void main(String[] args) {

		Ingresso i1 = new Ingresso();
		IngressoVIP i2 = new IngressoVIP();

		i1.setValor(12);
		i2.setValorAdicional(15);

		System.out.println(i1.toString());
		System.out.println(i2.toString());

	}
}