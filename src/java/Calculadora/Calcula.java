
package Calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calcula extends HttpServlet {
    Double operando1;
    Double operando2;
    int operacion;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         operando1 = Double.parseDouble(request.getParameter("operando2"));
         operando2 = Double.parseDouble(request.getParameter("operando1"));
         operacion = Integer.parseInt(request.getParameter("operacion"));
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcula</title>");            
            out.println("</head>");
            out.println("<body><script language=\"JavaScript\" type=\"text/javascript\">\n" +
            "alert(\"" + operacion + "\");\n" +
            "</script>");
            out.println("<h1>Servlet Calcula at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    public int Calcula() {
        
        switch(operacion){
            case 1:
            return (int) (operando1 + operando2); 
            case 2:
            return (int) (operando1 - operando2); 
            case 3:
            return (int) (operando1 / operando2); 
            case 4:
            return (int) (operando1 * operando2); 
            
        }
        
        return operacion;
    }// </editor-fold>

}
