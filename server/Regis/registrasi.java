/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitrais.Regis;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletContext;
import mitrais.dao.FormSimpanDao;
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author HP
 */
@Controller
public class registrasi extends HttpServlet {
    @Autowired
    private FormSimpanDao frmsimpan;
    @RequestMapping(value = "/registrasi", method = RequestMethod.GET)
    public ModelAndView home_upload(HttpServletRequest request, HttpServletResponse response) {
        ServletContext sc = request.getServletContext().getContext(request.getContextPath() + "/registrasi");
        String path = request.getServletContext().getRealPath("/");
        sc.setAttribute("pathkonteks",path);
        return new ModelAndView("login/registrasi");
    }
    @RequestMapping(value = "/updregis", headers = "Accept=*/*", method = RequestMethod.POST)
    public ResponseEntity upd(HttpServletRequest request, HttpServletResponse response) throws IOException, FileUploadException, InterruptedException {
        String mobilenumb = request.getHeader("mobilenumb");
        String firstname = request.getHeader("firstname");
        String lastname = request.getHeader("lastname");
        String mnthbirth = request.getHeader("mnthbirth");
        String datebirth = request.getHeader("datebirth");
        String yearbirth = request.getHeader("yearbirth");
        String gender = request.getHeader("gender");
        String email = request.getHeader("email");
        JSONObject kirimhiber = new JSONObject();
        String tanggallahir = "";
        if(mnthbirth.equalsIgnoreCase("Month Birth") || datebirth.equalsIgnoreCase("Date Birth") || yearbirth.equalsIgnoreCase("Year Birth")){
            tanggallahir = "00-00-0000";
        }
        else{
            tanggallahir = mnthbirth+"-"+datebirth+"-"+yearbirth;
        }
        if(gender == null || gender.length() == 0){
            gender = "";
        }
        else{
            gender = gender;
        }
        kirimhiber.put("mobilenumb", mobilenumb);
        kirimhiber.put("firstname", firstname);
        kirimhiber.put("lastname", lastname);
        kirimhiber.put("tgllahir", tanggallahir);
        kirimhiber.put("gender", gender);
        kirimhiber.put("email", email);
        String hasilpsn = frmsimpan.simpanRegis(kirimhiber);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        return new ResponseEntity(hasilpsn,HttpStatus.OK);  
    }
}
