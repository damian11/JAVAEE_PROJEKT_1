package main.java.com.dkasztelan.web;
import main.java.com.dkasztelan.domain.Klient;
import main.java.com.dkasztelan.service.KlientManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/updateKlient")  
public class KlientUpdate  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        int ID = Integer.parseInt(request.getParameter("id"));
        String imie = request.getParameter("imie");          
        String nazwisko = request.getParameter("nazwisko");        
        int telefon = Integer.parseInt(request.getParameter("telefon"));  
        
        KlientManager km = (KlientManager) getServletContext().getAttribute("klientmanager");

        for (int i=0; i<km.pobierzKlientow().size(); i++){
            if (km.pobierzKlientow().get(i).getId_klient() == ID){
                Klient k = km.pobierzKlientow().get(i);
                k.setId_klient(ID);
                k.setImie(imie);
                k.setNazwisko(nazwisko);
                k.setTelefon(telefon);
                break;
            }
        }
        this.getServletContext().getRequestDispatcher("/pokazWszystkoKlient.jsp").forward(request, response);
    }
}
