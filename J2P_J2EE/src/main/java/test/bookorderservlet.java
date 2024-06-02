package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class bookorderservlet
 */
public class bookorderservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookorderservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookcategory=request.getParameter("bookcategory");
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String edition=request.getParameter("edition");
		String year=request.getParameter("year");
		String isbn=request.getParameter("isbn");
		
		HttpSession session=request.getSession();
		ArrayList<String> orders = (ArrayList<String>) session.getAttribute("orders");
		
		if(orders==null) {
			orders= new ArrayList<>();
		}
		
		int orderCount = orders.size() + 1;
        String bookID = "Bk" + orderCount;

        
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
        out.println("<head>");
        out.println("<title>Order Confirmation</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container mt-5 bg-warning'>");
		
		
		String orderInfo = "BookID: " + bookID+", <br> Category: " + bookcategory + ", <br> Book Title: " + title + ", <br> Book Author: " + author + ", <br> Book Edition: " + edition + ", <br> Year: " + year + ", <br> ISBN: " + isbn + " <br> *****************************************************<br>";
        orders.add(orderInfo);
        session.setAttribute("orders", orders);
		
		

        out.println("<ul>");
        for (String order : orders) {
            out.println("<li>" + order + "</li>");
        }
        out.println("</ul>");
        out.println("<a href='bookOrderForm.html' class='btn btn-primary'>Back to Order Form</a>");
        
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
