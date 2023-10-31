import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");


        PrintWriter out = resp.getWriter();

        String uname = req.getParameter("uname");

        Cookie ck = new Cookie("uname", uname);

        resp.addCookie(ck);

        out.println("<a href='servlet2'><button>visit servlet 2 </button></a> ");

        out.close();

    }
}