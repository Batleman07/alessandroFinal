package br.univille.alessandrodacs2021.model;



//import java.util.Date;
//import javax.annotation.Generated;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity 
public class Fornecedor {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long id;
    //@Column(length = 1000)
    private String nome;
    private String urlAPI;
    private String urlAPIAuth;
    private String usuario;
    private String senha;
 

    public long getId(){
        return this.id;
    } public void setId(long id){
        this.id= id;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
        
    }
    public String getUrlAPI(){
        return this.urlAPI;
    }
    public void setUrlAPI(String urlAPI){
        this.urlAPI=urlAPI;
    }
    public String getUrlAPIAuth(){
        return this.urlAPIAuth;
    }
    public void setUrlAPIAuth(String urlAPIAuth){
        this.urlAPIAuth=urlAPIAuth;
    }
    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    




    
}
