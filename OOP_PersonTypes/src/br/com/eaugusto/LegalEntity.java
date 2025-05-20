package br.com.eaugusto;

public class LegalEntity extends Person {

	private String cnpj;
	private String companyType;
	private String corporateName;
	
	@Override
	public void displayInfo() {
		System.out.println("Razão Social: " + this.getCorporateName());
		System.out.println("CNPJ: " + this.getCnpj());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Endereço: " + this.getAddress());
		System.out.println("Tipo De Empresa: " + this.getCompanyType());
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
}
