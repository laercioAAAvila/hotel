package br.com.laercio.hotel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "hospedes")
public class HospedeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private String nome;
	private int cpf;
	private long cnpj;
	private int phone;
	private double valorAPagar;
	private String estadoCivil;
	private String entrada;
	private String saida;
	private String vemCidade;
	private String vemUF;
	private String destinoCidade;
	private String destinoUf;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public double getValorAPagar() {
		return valorAPagar;
	}

	public void setValorAPagar(double valorAPagar) {
		this.valorAPagar = valorAPagar;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public String getVemCidade() {
		return vemCidade;
	}

	public void setVemCidade(String vemCidade) {
		this.vemCidade = vemCidade;
	}

	public String getVemUF() {
		return vemUF;
	}

	public void setVemUF(String vemUF) {
		this.vemUF = vemUF;
	}

	public String getDestinoCidade() {
		return destinoCidade;
	}

	public void setDestinoCidade(String destinoCidade) {
		this.destinoCidade = destinoCidade;
	}

	public String getDestinoUf() {
		return destinoUf;
	}

	public void setDestinoUf(String destinoUf) {
		this.destinoUf = destinoUf;
	}

}
