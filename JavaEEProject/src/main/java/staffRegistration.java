

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class staffRegistration
 */
public class staffRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public staffRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phno=request.getParameter("phno");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String rank=request.getParameter("rank");
		String department=request.getParameter("department");
		String[] subjects=request.getParameterValues("subjects");
		
		
		out.println("<html><head><link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n "
				+ "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
				+ "<link href=\"https://fonts.googleapis.com/css2?family=Kanit:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Mulish:ital,wght@0,200..1000;1,200..1000&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap\" rel=\"stylesheet\"></head><body style=background-color:#35c1d4;font-family:Roboto><h1>Registration is completed!</h1>");
		out.println("<h3>Welcome "+"<span style=color:red>"+ name+"</span></h3>");
		out.println("<h4><u>Your Profile Information</u></h4>");
		out.println("<ul><li><span style='display:inline-block; width:150px;'>Email</span>" + ": "+ email + "</li></ul>");
	    out.println("<ul><li><span style='display:inline-block; width:150px;'>Address</span>" +": "+  address + "</li></ul>");
	    out.println("<ul><li><span style='display:inline-block; width:150px;'>Phone Number</span>" +": "+ phno + "</li></ul>");
	    out.println("<ul><li><span style='display:inline-block; width:150px;'>Date of Birth</span>" +": "+ dob + "</li></ul>");
	    out.println("<ul><li><span style='display:inline-block; width:150px;'>Gender</span>" +": "+ gender + "</li></ul>");
	    out.println("<ul><li><span style='display:inline-block; width:150px;'>Rank</span>" +": "+ rank + "</li></ul>");
	    out.println("<ul><li><span style='display:inline-block; width:150px;'>Department</span>" +": "+ department + "</li></ul>");
	    out.println("<ul><li><span style='display:inline-block; width:150px;'>Subjects</span>");
		if (subjects != null) {
            boolean first = true;
            for (String subject : subjects) {
                if (!first) {
                    out.print(" / ");
                }
                out.print(": "+subject);
                first = false;
            }
        }
		out.println("</li></ul>");
		out.print("</body><footer><h4>If you want to edit your profile, please <a href=staffRegistration.html>go here.</a> </h4></footer></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
