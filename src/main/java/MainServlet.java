import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/greeting")

public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("main!");

        String name = req.getParameter("name");
        if (name == null) {
            resp.getWriter().println("Hello Anonymous!");
        } else {
            resp.getWriter().println("Hello " + name + "!");
        }
    }
}

