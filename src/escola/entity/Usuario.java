package escola.entity;
// Generated Apr 7, 2019 7:04:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String cpf;
     private String rg;
     private String senha;
     private String tipo;
     private Date dtNascimento;
     private String nrTelefone;
     private String dsEndereco;
     private Set alunoLinguas = new HashSet(0);
     private Set professorLinguas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String tipo) {
        this.tipo = tipo;
    }
    public Usuario(String nome, String cpf, String rg, String senha, String tipo, Date dtNascimento, String nrTelefone, String dsEndereco, Set alunoLinguas, Set professorLinguas) {
       this.nome = nome;
       this.cpf = cpf;
       this.rg = rg;
       this.senha = senha;
       this.tipo = tipo;
       this.dtNascimento = dtNascimento;
       this.nrTelefone = nrTelefone;
       this.dsEndereco = dsEndereco;
       this.alunoLinguas = alunoLinguas;
       this.professorLinguas = professorLinguas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Date getDtNascimento() {
        return this.dtNascimento;
    }
    
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getNrTelefone() {
        return this.nrTelefone;
    }
    
    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }
    public String getDsEndereco() {
        return this.dsEndereco;
    }
    
    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }
    public Set getAlunoLinguas() {
        return this.alunoLinguas;
    }
    
    public void setAlunoLinguas(Set alunoLinguas) {
        this.alunoLinguas = alunoLinguas;
    }
    public Set getProfessorLinguas() {
        return this.professorLinguas;
    }
    
    public void setProfessorLinguas(Set professorLinguas) {
        this.professorLinguas = professorLinguas;
    }




}


