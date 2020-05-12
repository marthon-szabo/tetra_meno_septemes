package hu.tetra_meno_septemes.app;
import com.sun.net.httpserver.HttpServer;
import hu.tetra_meno_septemes.app.config.TemplateEngineUtil;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/"})
public class MainPage extends HttpServlet {


    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws ServletException, IOException {

       /* TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(req.getServletContext());
        WebContext context = new WebContext(req, resp, req.getServletContext());
        engine.process("templates/index.html", context, resp.getWriter());*/
       resp.getWriter().println("ldshflasdflsajfjsf");
    }
}
