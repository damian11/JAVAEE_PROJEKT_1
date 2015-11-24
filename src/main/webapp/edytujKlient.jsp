<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="main.java.com.dkasztelan.domain.Klient"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Edycja</title>
</head>
<style rel="stylesheet" type="text/css">
body {    background-color: #ffcc66; }
.klasa1 { margin-top: 4cm; margin-left: 15cm; font-size: 24px;}
.klasa2 { margin-left:3cm; margin-top:1cm;}
a { color:black; font-size:24px; font-weight:bold; margin-left: 15cm; margin-top: 2cm;}
            h1 	    {text-align: center; color: black; font-size: 70px; font-style: italic;
                    text-decoration:  ; font-family: "Arial"; margin-top: -12cm;}
</style>
<body>
	<jsp:useBean id="klient" class="main.java.com.dkasztelan.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="klientmanager" class="main.java.com.dkasztelan.service.KlientManager"
		scope="application" />

     <%
        String ID = request.getParameter("update");
    	
    	String  imie = "", nazwisko = "";
    	int telefon = 0; 
        for (Klient kl : klientmanager.pobierzKlientow())
        {
          if (kl.getId_klient() == Integer.parseInt(ID))
          {
      	
        imie = kl.getImie();
        nazwisko = kl.getNazwisko();
        telefon = kl.getTelefon();
    
 
        break;
             }
         }
         
      out.println("<div class = 'klasa1'><form action='updateKlient'><input type='hidden' name='id' value='" + ID + "' /><tr><td colspan='2'><b>ID Klienta:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  " + ID + "</td></tr><br><tr><td><b>Imie: </b> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp; </td><td><input type='text' name='imie' pattern='[A-Za-z]*' title='Imie powinno zawierac tylko z liter' value='" + imie + "' /></td></tr><br><tr><td><b>Nazwisko:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td><input type='text' name='nazwisko' pattern='[A-Za-z]*' title='Nazwisko powinno składac sie tylko z liter' value='" + nazwisko + "' /></td></tr><tr><br><td><b>Numer telefonu:</b></td><td><input type='text' name='numertelefonu'  pattern='[0-9]*' title='Numer telefonu powinien zawierać tylko z liczb' value='" + telefon +  "' /></td></tr><tr><br><td colspan='2'><div class='klasa2'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>"); %>

                
<a class="btn btn-default" href="index.jsp"><b><font color="black">Powrot do strony glownej</a> 
<h1>Edycja</h1>
</body>
</html>
