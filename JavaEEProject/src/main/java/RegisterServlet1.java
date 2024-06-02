

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegisterServlet1
 */
public class RegisterServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet1() {
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
		
		String name=request.getParameter("uname");
		String rollno=request.getParameter("rno");
		String pass=request.getParameter("pass");
		String gender=request.getParameter("gender");
		String hobbies[]=request.getParameterValues("value");
		
		
		out.println("<h1>Name : "+name+"<br>");
		out.println("Roll No : "+rollno+"<br>");
		out.println("Password : "+pass+"<br>");
		out.println("Gender : "+gender+"<br>");
		out.println("Hobby : ");
		for(String hobby:hobbies) {
			out.println(hobby+"&nbsp&nbsp</h1>");
		}
		
		out.println("<a href=RegisterServlet2>Next Page</a>");
		
		HttpSession session=request.getSession();
		session.setAttribute("sname",name);
		session.setAttribute("srno",rollno);
		session.setAttribute("spassword",pass);
		session.setAttribute("sgender",gender);
		session.setAttribute("shobbies",hobbies);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
