package mitrais.model;
// Generated Sep 1, 2019 6:25:34 PM by Hibernate Tools 4.3.1



/**
 * Registrasi generated by hbm2java
 */
public class Registrasi  implements java.io.Serializable {


     private int idlogin;
     private String namadepan;
     private String nambelakang;
     private String tgllahir;
     private Integer idkelamin;
     private String email;
     private String nohp;

    public Registrasi() {
    }

	
    public Registrasi(int idlogin, String namadepan, String nambelakang, String email, String nohp) {
        this.idlogin = idlogin;
        this.namadepan = namadepan;
        this.nambelakang = nambelakang;
        this.email = email;
        this.nohp = nohp;
    }
    public Registrasi(int idlogin, String namadepan, String nambelakang, String tgllahir, Integer idkelamin, String email, String nohp) {
       this.idlogin = idlogin;
       this.namadepan = namadepan;
       this.nambelakang = nambelakang;
       this.tgllahir = tgllahir;
       this.idkelamin = idkelamin;
       this.email = email;
       this.nohp = nohp;
    }
   
    public int getIdlogin() {
        return this.idlogin;
    }
    
    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }
    public String getNamadepan() {
        return this.namadepan;
    }
    
    public void setNamadepan(String namadepan) {
        this.namadepan = namadepan;
    }
    public String getNambelakang() {
        return this.nambelakang;
    }
    
    public void setNambelakang(String nambelakang) {
        this.nambelakang = nambelakang;
    }
    public String getTgllahir() {
        return this.tgllahir;
    }
    
    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }
    public Integer getIdkelamin() {
        return this.idkelamin;
    }
    
    public void setIdkelamin(Integer idkelamin) {
        this.idkelamin = idkelamin;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNohp() {
        return this.nohp;
    }
    
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }




}


