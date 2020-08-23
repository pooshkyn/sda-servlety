package pl.sda;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String initParam = getInitParameter("initName");

        PrintWriter writer = resp.getWriter();
        writer.print("<div>Hello world " + name + "</div>");
        writer.print("<div>Init param " + initParam + "</div>");
    }
}
