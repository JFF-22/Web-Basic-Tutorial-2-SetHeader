/*
Case Study 1
Yeo Ewe Wen
20DDT20F1016
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Application"})
public class Application extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String fullname = request.getParameter("name");
        String IC = request.getParameter("IC");
        String address = request.getParameter("address");
        int age = Integer.parseInt(request.getParameter("age"));
                
         response.setHeader("Accept-Language", "Bahasa Malaysia");
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Malaysia Job Application</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='index.html'>Home</a>");
            out.println("<h2>Malaysia Job Application</h2>");
            if ((age >= 18) && (age<=25)){
                out.println("<h3>Congratulations! You are eligible to work.</h3>");
            }
            else{
                out.println("<h3>Sorry. You are not eligible to work.</h3>");
            }
            out.println("<h3>Your Application Details:</h3>");
            out.println("Full Name: " + fullname + "<br>");
            out.println("IC Number: " + IC + "<br>");
            out.println("Address: " + address + "<br>");
            out.println("Age: " + age);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
