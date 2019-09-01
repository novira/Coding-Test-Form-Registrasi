/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatest;

import mitrais.dao.impl.*;
import mitrais.dao.FormSimpanDao;

import model.Jnskelamin;
import model.Registrasi;
import model.hibernateutil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONObject;
import org.junit.Test;
import org.springframework.stereotype.Service;
import static org.junit.Assert.*;
/**
 *
 * @author ichigo
 */
@Service
public class formSimpanDaoImpl {
   
    @Test
    public void simpanRegisreq() {
        boolean b=true;
        InsertRegistrasihibernate hiber = new InsertRegistrasihibernate();
        Registrasi reg=new Registrasi();
        String hp="6285733456506";
        String firstname="novira putri";
        String lastname="ayuningtyas";
        String tgllahir="11-15-1989";
        int genderid=2;
        String email="noru.vira@gmail.com";
	reg.setNohp(hp);
	reg.setNamadepan(firstname);
	reg.setNambelakang(lastname);
	reg.setIdkelamin(genderid);
        reg.setTgllahir(tgllahir);
        reg.setEmail(email);
        assertEquals(b,hiber.insertReg(reg));
    }
   @Test
    public void simpanRegisnon() {
        boolean b=true;
        InsertRegistrasihibernate hiber = new InsertRegistrasihibernate();
        Registrasi reg=new Registrasi();
        String hp="6285733456506";
        String firstname="novira putri";
        String lastname="ayuningtyas";
        String tgllahir="";
        String gender ="";
        int genderid;
        if(gender == ""){
            genderid = 0;
        }
        else{
            genderid = 2;
        }
        String email="noru.vira@gmail.com";
	reg.setNohp(hp);
	reg.setNamadepan(firstname);
	reg.setNambelakang(lastname);
	reg.setIdkelamin(genderid);
        reg.setTgllahir(tgllahir);
        reg.setEmail(email);
        assertEquals(b,hiber.insertReg(reg));
    }
}
