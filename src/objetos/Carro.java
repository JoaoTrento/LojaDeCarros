package objetos;

public class Carro {
	private Integer id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private String cor;
	private double quilometragem;
	private double preco;
	
	// GETTERS E SETTERS
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// CONSTRUTORES
	public Carro(Integer id, String marca, String modelo, int anoFabricacao, String cor, double quilometragem,
			double preco) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.quilometragem = quilometragem;
		this.preco = preco;
	}
	public Carro() {
		super();
	}
	
	// TO STRING
	@Override
	/*public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao
				+ ", cor=" + cor + ", quilometragem=" + quilometragem + ", preco=" + preco + "]";
	}*/
	public String toString() {
		return "Carro [ID=" + id + ", " + marca + ", " + modelo + ", " + anoFabricacao
				+ ", " + cor + ", " + quilometragem + "Km, R$" + preco + "]";
	}
	
	
	
}