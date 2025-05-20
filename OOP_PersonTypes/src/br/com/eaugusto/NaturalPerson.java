package br.com.eaugusto;

public class NaturalPerson extends Person {

	private String cpf;
	private String gender;
	private String maritalStatus;
	
	@Override
	public void displayInfo() {
		System.out.println("Nome: " + this.getName());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Gênero: " + this.getGender());
		System.out.println("Estado Civil: " + this.getMaritalStatus());
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
}
