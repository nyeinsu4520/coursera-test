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
 * Servlet implementation class ClientAccessCount
 */
public class ClientAccessCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientAccessCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
//    	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//    		String countString="1";
//    		Cookie[ ] cookies = request.getCookies();
//    		if (cookies != null) {
//    		for(Cookie cookie: cookies) {
//    		if
//    		(cookie.getName().equals("accessCount"))
//    			countString=cookie.getValue();
//    		}
//    		}
//    		int count = 1;
//    		try {
//    		count =
//    		Integer.parseInt(countString);
//    		} catch(NumberFormatException nfe) { }
//    		Cookie c = new
//    		Cookie("accessCount",String.valueOf(count+1));
//    		response.addCookie(c);
//    		response.setContentType("text/html");
//    		PrintWriter out = response.getWriter();
//    		out.println("<HTML>\n");
//    		out.println("<HEAD><TITLE> <H1>Access Count Servlet </H1> </TITLE>");
//    		out.println("<BODY BGCOLOR=\"#FDF5E6\">\n<CENTER>\n");
//    		out.println("<H2>This is visit number " +
//    		count + " by this browser.</H2>\n");
//    		}
    		
    		
    		
    		
    			
    	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
    		String cValue="1";
    		Cookie cookies[]=request.getCookies();
		
		if(cookies!=null) {
			for(Cookie c:cookies) {
				if(c.getName().equals("access")) 
					cValue=c.getValue();
				
////					
				
				
			}
			int count=1;
			try {
				count=Integer.parseInt(cValue);
			}catch(NumberFormatException nfe){
////				
				}
			Cookie c=new Cookie("access",String.valueOf(count +1));
			response.addCookie(c);
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
////			
			out.println("<h2>THis is visit number"+count+" by this browser.</h2>");
		}
		
		
////		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
