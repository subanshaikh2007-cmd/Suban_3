import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Form_2")
public class Form_2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String s1 = request.getParameter("t1");
        String s2 = request.getParameter("t2");
        String op = request.getParameter("s1");

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if(op.equals("+"))
            out.println("Answer is " + (n1+n2));
        else if(op.equals("-"))
            out.println("Answer is " + (n1-n2));
        else if(op.equals("*"))
            out.println("Answer is " + (n1*n2));
        else if(op.equals("/"))
            out.println("Answer is " + (n1/n2));
        else if(op.equals("%"))
            out.println("Answer is " + (n1%n2));
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private int parseInt(int n1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}