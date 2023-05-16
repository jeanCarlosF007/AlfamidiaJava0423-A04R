
public class Principal {

	public static void main(String[] args) {
		
		Funcionario adm = new Administrador("Fulano", 260, 20);
		Funcionario contador = new Contador("Beltrano", 260, 20);
		Funcionario programador = new Programador("Ciclano", 260, 20);
		
		System.out.println(adm);
		System.out.println();
		System.out.println(contador);
		System.out.println();
		System.out.println(programador);
		
		
	}

}
