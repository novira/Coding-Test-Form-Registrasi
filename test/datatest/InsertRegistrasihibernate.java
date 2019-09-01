/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatest;

import model.Registrasi;
import model.hibernateutil;
import org.hibernate.Session;
import org.json.JSONObject;

/**
 *
 * @author HP
 */
public class InsertRegistrasihibernate {
     public boolean insertReg(Registrasi regis){
        boolean balik = false;
        try {
            Session session = hibernateutil.getSessionFactory().openSession();
            session.beginTransaction();
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
            session.saveOrUpdate(regis);
            session.getTransaction().commit();
            balik =  true;
        } catch (Exception e) {
            System.out.println("err : " + e.getMessage());
        }
        return balik;
    }
}
