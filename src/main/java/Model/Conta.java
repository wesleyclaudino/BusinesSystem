package Model;

public class Conta {
	private int id;
	private String nomeDeUsuario;
	private String email;
	private String senha;
	//private User usuario;
	private Contatos contatos;
	private boolean valido;
	
	public Conta() {}
	
	public Conta (String email, String senha) {
		this.email = email;
		this.senha = senha;		
	}
	
	public Conta(String nomeDeUsuario, String email, String senha, String nomeDaEmpresa, String cep, String cnpj) {
		this.nomeDeUsuario = nomeDeUsuario;
		this.email = email;
		this.senha = senha;
		//usuario = new User(nomeDaEmpresa, cep, cnpj);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//	public User getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(User usuario) {
//		this.usuario = usuario;
//	}

	public Contatos getContatos() {
		return contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}
	
	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}
	
	// Usuario

	private String nomeDaEmpresa;
	private String endDaEmpresa;
	private String cep;
	private String cnpj;
	private String pais;
	private String estado;

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getEndDaEmpresa() {
		return endDaEmpresa;
	}

	public void setEndDaEmpresa(String endDaEmpresa) {
		this.endDaEmpresa = endDaEmpresa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}