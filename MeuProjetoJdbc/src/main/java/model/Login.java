package model;



public class Login {
 private Integer id;
 private String nome;
 private String email;
 private Integer telefone;
 
 
public Login(String nome, String email, Integer telefone) {
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getTelefone() {
	return telefone;
}
public void setTelefone(Integer telefone) {
	this.telefone = telefone;
}
 
 
}
