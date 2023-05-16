
public class Administrador extends Funcionario{

	public Administrador(String nome, double totalHoras, double valorHora) {
		super(nome, totalHoras, valorHora);
		// TODO Auto-generated constructor stub
	}

	private final double BONIFICACAO = 0.06;
	
	@Override
	public double valorTotalAReceber() {
		double salario = super.totalHoras * super.valorHora;
		double bonificacao = this.BONIFICACAO * salario;
		return salario + bonificacao;
	}
}
