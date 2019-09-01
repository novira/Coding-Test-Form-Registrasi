/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitrais.dao.impl;

import mitrais.dao.FormSimpanDao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import mitrais.model.Jnskelamin;
import mitrais.model.Registrasi;
import mitrais.model.hibernateutil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 *
 * @author ichigo
 */
@Service
public class formSimpanDaoImpl implements FormSimpanDao{
   
    @Override
    public String simpanRegis(JSONObject isi) {
        String hasilmsg = "";
        String gender = "";
        if(isi.getString("gender") == ""){
            gender = "0";
        }
        else{
             gender = isi.getString("gender");
        }
        try {
            Session session = hibernateutil.getSessionFactory().openSession();
            session.beginTransaction();
            Registrasi regis = new Registrasi();
            int maxid=0;
            int count = ((Long)session.createQuery("select count(*) from Registrasi").uniqueResult()).intValue();
            if(count == 0){
                maxid = 1;
            }
            else{
                maxid = (int)(session.createQuery("select max(idlogin) from Registrasi").uniqueResult());
                maxid = maxid+1;
            }
            regis.setIdlogin(maxid);
            regis.setNohp(isi.getString("mobilenumb"));
            regis.setNamadepan(isi.getString("firstname"));
            regis.setNambelakang(isi.getString("lastname"));
            regis.setTgllahir(isi.getString("tgllahir"));
            regis.setIdkelamin(Integer.parseInt(gender));
            regis.setEmail(isi.getString("email"));
            session.saveOrUpdate(regis);
            session.getTransaction().commit();
            hasilmsg = "1";
        } catch (Exception e) {
            System.out.println("err : " + e.getMessage());
            hasilmsg = e.getMessage();
        }
        String hasilsimpan = hasilmsg;
//        hasilsimpan.put("pesan", hasilmsg);
        return hasilsimpan;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
