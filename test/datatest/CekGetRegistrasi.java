/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatest;


import model.Jnskelamin;
import model.Registrasi;
import static org.junit.Assert.*;

import org.junit.Test;

public class CekGetRegistrasi {

	@Test
	public void test() {
		String hp="6285733456506";
                String firstname="novira putri";
                String lastname="ayuningtyas";
                String tgllahir="11-15-1989";
                int genderid=2;
                String email="noru.vira@gmail.com";
		Registrasi reg=new Registrasi();
		reg.setNohp(hp);
		reg.setNamadepan(firstname);
		reg.setNambelakang(lastname);
		reg.setIdkelamin(genderid);
                reg.setTgllahir(tgllahir);
                reg.setEmail(email);
		assertEquals(hp,reg.getNohp());
                assertEquals(firstname,reg.getNamadepan());
                assertEquals(lastname,reg.getNambelakang());
                assertEquals(tgllahir,reg.getTgllahir());
                assertEquals(String.valueOf(genderid),String.valueOf(reg.getIdkelamin()));
                assertEquals(email,reg.getEmail());
	}

}