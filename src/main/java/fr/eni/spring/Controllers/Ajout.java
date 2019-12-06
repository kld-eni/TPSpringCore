package fr.eni.spring.Controllers;

import fr.eni.spring.Model.BO.Media;
import fr.eni.spring.Model.BO.Mediatheque;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ajout", urlPatterns = "/ajout")
public class Ajout extends HttpServlet implements Servlet {
    private static final long serialVersionUID = 1L;

    private static Mediatheque mediatheque;

    public void setMediatheque(Mediatheque mediatheque) {
        Ajout.mediatheque = mediatheque;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("mediatheque", Ajout.mediatheque);
        req.getRequestDispatcher("/ajout.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("ajout-nom").trim();
        String titre = req.getParameter("ajout-titre").trim();
        Media newMedia = new Media(nom, titre);
        Ajout.mediatheque.addMedia(newMedia);
        resp.sendRedirect(req.getContextPath() + "/");
    }
}
