package fr.eni.spring.Controllers;

import fr.eni.spring.Model.BO.Mediatheque;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "index", urlPatterns = "/index")
public class Controller extends HttpServlet implements Servlet {
    private static final long serialVersionUID = 1L;
    private static Mediatheque mediatheque;

    public void setMediatheque(Mediatheque mediatheque) {
        Controller.mediatheque = mediatheque;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("mediatheque", Controller.mediatheque);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
