package library_management.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login_page
 */
public class login_page extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public login_page() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			String Email = request.getParameter("email");
			String Password = request.getParameter("password");
			PrintWriter out = response.getWriter();

			RequestDispatcher id = null;
			if (Email.equalsIgnoreCase("kshubhankar2000@gmail.com") && Password.equals("12345")) {
				HttpSession session = request.getSession();
				session.setAttribute("email", id);
				id = request.getRequestDispatcher("homePage");
				id.forward(request, response);
			} else {
				out.print("<h3 style=\"color:crimson\">Sorry UserName or Password Error!  Try Again.....</h3>");
				id = request.getRequestDispatcher("login.html");
				id.include(request, response);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
