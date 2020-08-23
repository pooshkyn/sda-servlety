package pl.sda;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/items")
public class ItemServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<Item> items = ItemSerivce.findAll();

        if(items.isEmpty()) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/error");
            requestDispatcher.forward(req, resp);
        }

        req.setAttribute("items", items);
        RequestDispatcher requestDispatcher =
                req.getRequestDispatcher(req.getContextPath() + "/items/all.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        System.out.println("id: " + id + ", name: " + name);
        ItemSerivce.addItem(id, name);
        List<Item> items = ItemSerivce.findAll();


        req.setAttribute("items", items);
        req.getRequestDispatcher("/items/all.jsp").forward(req, resp);
    }
}
