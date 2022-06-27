package curso.java.bruno;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int Idade;
	private Date dataNascimento;
	
	
		
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	

}
