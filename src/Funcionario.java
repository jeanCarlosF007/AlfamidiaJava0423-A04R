
public abstract class Funcionario {
	
	protected String nome;
	protected double totalHoras;
	protected double valorHora;
	
	public Funcionario (String nome, double totalHoras, double valorHora) {
		this.nome = nome;
		this.totalHoras = totalHoras;
		this.valorHora = valorHora;
	}
	
	public abstract double valorTotalAReceber();
	
	public String toString() {
		return "Nome: " + this.nome + "\nTotal a receber: R$" + this.valorTotalAReceber();
	}

}
