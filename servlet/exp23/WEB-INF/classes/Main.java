import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");


        PrintWriter out = resp.getWriter();

        String name = req.getParameter("uname");

        HttpSession session  = req.getSession();
        session.setAttribute("uname", name);


        out.println("<a href='servlet2'><button>visit servlet 2 </button></a> ");

        out.close();

    }
}