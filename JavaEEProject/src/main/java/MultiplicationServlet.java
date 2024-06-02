

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MultiplicationServlet
 */
public class MultiplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String name=request.getParameter("name");
		
		if(name !=null) {
			try {
				int number=Integer.parseInt(name);
				for(int i=1; i<13;i++) {
					int result = number *i;
					out.println("<html><body style=background-color:#341535;color:aquamarine;margin-left:25px>");
					
					out.println(number + " x "+ i+ " = "+ result+"<br>");
					out.println("</div></body></html>");
				}
				
			}catch(NumberFormatException e){
				out.println("<html><body>");
				out.println("<h2>Error</h2>");
				out.println("<p>The Parameter is not a valid integer.</p>");
				out.println("</body></html>");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
