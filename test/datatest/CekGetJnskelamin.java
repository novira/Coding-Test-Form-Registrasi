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

public class CekGetJnskelamin {

	@Test
	public void test() {
		String nmkelamin="frmale";
                int idkelamin=2;
		Jnskelamin klmn=new Jnskelamin();
		klmn.setIdkelamin(idkelamin);
		klmn.setJnskelamin(nmkelamin);
		assertEquals(idkelamin,klmn.getIdkelamin());
                assertEquals(nmkelamin,klmn.getJnskelamin());                
	}

}