
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(false);
        out.println("uname : "+(String) session.getAttribute("uname"));

        out.println("id : "+session.getId());

        out.println("creation time : "+session.getCreationTime());

        out.print("get last access time : "+session.getLastAccessedTime());

        out.close();
    }
}