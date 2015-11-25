<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="main.java.com.dkasztelan.domain.Klient"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Edytuj Klienta</title>
</head>

<style rel="stylesheet" type="text/css">
	body{
		background: url('silownia1.jpg'); background-position: center top; no-repeat;
		background-position: center top; no-repeat;
	}
	.przedrostki{ 
   margin-top: 150px;
     margin-left: 600px;
    width: auto;
    height: 100%;
  
    border-color: white;
    overflow: auto;
    font-family: Arial;   
    font-size: 60px; 
           }
	
	.zapisz{ 
		margin-left:100px; 
		margin-top: 20px;
	}
	a{ 
color:white;  font-weight: bold; 
	}
    h1{
    	margin-left: 16cm;
    	color: white; 
    	font-size: 50px; 
    	font-style: italic;
        font-family: "Arial"; 
        margin-top: -12cm;
	}
</style>



<body>
	<jsp:useBean id="klient" class="main.java.com.dkasztelan.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="klientmanager" class="main.java.com.dkasztelan.service.KlientManager" scope="application" />
	<%
        String ID = request.getParameter("update");
     	int telefon = 0;
    	String  imie = "",  nazwisko = "";
        for (Klient k : klientmanager.pobierzKlientow()){
          if (k.getId_klient() == Integer.parseInt(ID)){
      		imie = k.getImie();
       		nazwisko = k.getNazwisko();
        	telefon = k.getTelefon();
        	break;
        	}
        }
        
   		out.println("<div class = 'przedrostki'><form action='updateKlient'><input type='hidden' name='id' value='" + ID +
		   "' /><tr><td colspan='2'><b></b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  " + ID +
		   "</td></tr><br><tr><td><b>Imie: </b> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp; </td><td><input type='text' name='imie' pattern='[A-Za-z]*' title='Imie powinno sk³adaæ siê tylko z liter' value='" + imie +
		   "' /></td></tr><br><tr><td><b>Nazwisko:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td><input type='text' name='nazwisko' pattern='[A-Za-z]*' title='Nazwisko powinno sk³adaæ sie tylko z liter' value='" + nazwisko +
		   "' /></td></tr><tr><br><td><b>Telefon:</b></td><td><input type='text' name='telefon'value='" + telefon + 
		   "' /></td></tr><tr><br><td colspan='2'><div class='zapisz'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>");
		%>
	<br>
	<a href="index.jsp"><h3><center><font color="white">Powrot do strony glownej</a></h3></center>
	<h1>Edytuj Klienta</h1>
</body>
</html>
