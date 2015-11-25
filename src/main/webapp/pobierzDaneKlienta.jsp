<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dodaj Klienta</title>
</head>

 <style rel="stylesheet" type="text/css">
 body {  background: url('silownia1.jpg');}
 .contentbox {
    margin-top: 150px;
     margin-left: 600px;
    width: auto;
    height: 100%;
  
    border-color: black;
    overflow: auto;
    font-family: Arial;   
    font-size: 60px; 
           }
    .klasa1 {color:white;  font-weight: bold; }
	.sumbit { text-align: center;}
       .klasa2 {color:white; font-size: 50px font-weight: bold; text-align: center;}
       .klasa { font-weight: bold;  margin-left: 100px; color: white}
        </style>

<body>

	<jsp:useBean id="klient" class="main.java.com.dkasztelan.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="manager" class="main.java.com.dkasztelan.service.KlientManager"
		scope="application" />
		
		<div class="contentbox">
            <form action="dodajKlienta.jsp">
            <table class="operationtable">
                <tr class='tableheader'>
                    <td class = klasa2 colspan='2'>Dodaj Klienta</td>
                </tr>
				 
                <tr>
                    <td class = klasa1>Imię:</td>
                    <td><input type="text" name="imie" value="" /></td>
                </tr>
                <tr>
                    <td class = klasa1>Nazwisko:</td>
                    <td><input type="text" name="nazwisko" value="" /></td>
                </tr>
                <tr>
                    <td class = klasa1>Telefon:</td>
                    <td ><input type="number" name="telefon" value="" /></td>
                </tr>
                <tr>
                    <td  class = sumbit colspan="2"><input type="submit" value=" DODAJ " align="right"></td>
                </tr>
            </table>
            </form>
        </div>

     <a class=klasa2 href="http://localhost:8080/silownia/">Powrót do strony głównej</a>
    
</body>
</html>
