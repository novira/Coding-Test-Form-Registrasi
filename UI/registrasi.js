/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $('#btnlgn').hide();
     var bulan= ["","Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"];
     var tahun = ["2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019"]
     for(var i=1;i<bulan.length;i++){
            if(i<10){
                $('#mnthbirth').append('<option value="0'+i+'">'+bulan[i]+'</option>');
            }
            else{
                $('#mnthbirth').append('<option value="'+i+'">'+bulan[i]+'</option>');
            }
       }
        for(var i=1;i<=31;i++){
            if(i<10){
               $('#datebirth').append('<option>0'+i+'</option>');
           }
           else{
               $('#datebirth').append('<option>'+i+'</option>');
           }
       }
        for(var i=0;i<tahun.length;i++){
            if(i<10){
                $('#yearbirth').append('<option value="'+tahun[i]+'">'+tahun[i]+'</option>');
            }
            else{
                $('#yearbirth').append('<option value="'+tahun[i]+'">'+tahun[i]+'</option>');
            }
        }
        
        $('#mblnmb').focusout(function() {
            var mobilenumb = $('#mblnmb').val();
            var regex = /^[62]{2}/g;
            if(mobilenumb.match(regex)){
                 $(".tooltiptext").css("visibility", "hidden");
            }
            else{
                $(".tooltiptext").css("visibility", "visible");
                $(".tooltiptext").css("opacity", 1);
            }
        });
    $( "#target" ).submit(function( event ) {
            var form = document.getElementById("target");
            var formData = new FormData(form);
            event.preventDefault();
            var mobilenumb = $('#mblnmb').val();
            var firstname = $('#firstname').val();
            var lastname = $('#lastname').val();
            var mnthbirth = $('#mnthbirth').val();
            var datebirth = $('#datebirth').val();
            var yearbirth = $('#yearbirth').val();
            var gender = $('input[name=gender]:checked').val();
            var email = $('#email').val();
              $.ajax({
                     type: 'POST',
                     data: formData,    
                     processData: false, 
                     contentType: false,
                     headers: {"mobilenumb": mobilenumb,"firstname": firstname,"lastname": lastname,"mnthbirth": mnthbirth,"datebirth": datebirth,"yearbirth": yearbirth,"gender": gender,"email": email},  
                     url: "http://localhost:8085/mitraisapp/jsp/updregis",
                     success: function(data1){
                         if(data1 === "1"){
                            $('#btnlgn').show();
                            $(".hs").attr("disabled", "disabled"); 
                         }
                         else{
                             alert(data1);
                         } 
                     },
                     error: function (doata1) {
                         alert("error"+data1);        
                     }

                 });
    });
});

