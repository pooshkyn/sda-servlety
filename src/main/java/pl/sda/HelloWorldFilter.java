package pl.sda;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//dodanie filtru do konfiguracji (dla wszystkich dostępnych ścieżek)
@WebFilter(urlPatterns = {"/nieistnieje"})
public class HelloWorldFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {

        //pobranie parametru
        String name = req.getParameter("name");

        //sprawdzenie czy jest parametr
        if(name == null || name.isBlank()) {
            res.getWriter().print("parameter name is required");
        }

        //puszczenie odpowiedzi i rządania do pozostałych filtrów i servletu
        chain.doFilter(req, res);
    }
}


