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
    background-color: white;
    border-color: black;
    overflow: auto;
    font-family: Arial;   
    font-size: 40px; 
           }
    .tak {color:red;  font-weight: bold; }
	.sumbit { text-align: center;}
       .tak3 {color:white;  font-weight: bold; text-align: center;}
       .stronka { font-weight: bold;  margin-left: 100px; color: black}
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
                    <td class = tak3 colspan='2'>Dodaj Klienta</td>
                </tr>
				 
                <tr>
                    <td class = tak>Imię:</td>
                    <td><input type="text" name="imie" value="" /></td>
                </tr>
                <tr>
                    <td class = tak>Nazwisko:</td>
                    <td><input type="text" name="nazwisko" value="" /></td>
                </tr>
                <tr>
                    <td class = tak>Telefon:</td>
                    <td ><input type="number" name="telefon" value="" /></td>
                </tr>
                <tr>
                    <td  class = sumbit colspan="2"><input type="submit" value=" DODAJ " align="right"></td>
                </tr>
            </table>
            </form>
        </div>

     <a class=stronka href="http://localhost:8080/silownia/">Powrót do strony głównej</a>
    
</body>
</html>
