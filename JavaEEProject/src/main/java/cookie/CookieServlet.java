package cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CookieServlet
 */
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
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
		
		Cookie ck=new Cookie("cookie1","user");
		ck.setMaxAge(60);
		response.addCookie(ck);
		
		out.println("Cookie Name: " +ck.getName());
		out.println("Cookie Vluse: "+ck.getValue());
		out.println("Life Time: "+ck.getMaxAge());
		out.println("Path: "+ck.getPath());
		out.println("Version:"+ck.getVersion());
		
		Cookie cookies[]=request.getCookies();
		if(cookies!=null) {
		for(Cookie c:cookies) {
			if(c.getName().equals("cookie1")) {
				out.println("Cookie Exist");
			}
//			else if(c.getName().equals("cookie2")) {
//				out.println("Cookie Name: " +c.getName());
//				out.println("Cookie Vluse: "+c.getValue());
//				out.println("Life Time: "+c.getMaxAge());
//				out.println("Path: "+c.getPath());
//				out.println("Version:"+c.getVersion());
//				}
			}
		}
		else {
			out.println("Null");
		}
		
		
		
		
//		Cookie ck2=new Cookie("cookie2","admin");
//		ck2.setMaxAge(365*24*3600);
//		response.addCookie(ck2);
		
		
		out.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
