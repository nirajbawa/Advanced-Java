import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String uname = req.getParameter("uname");
        String password = req.getParameter("password");

        String u = "niraj";
        String p = "niraj1234";

        if(uname.equals(u) && password.equals(p))
        {
            out.println("<html><head><title>dashboard</title></head><body>credentials are correct "+uname+" "+password+"</body></html>");
        }
        else{
            out.println("<html><head><title>dashboard</title></head><body>credentials are incorrect "+uname+" "+password+" </body></html>");
        }

        out.close();
    }
}