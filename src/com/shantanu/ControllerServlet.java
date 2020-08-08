package com.shantanu;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ControllerServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("lfname");
		String password=request.getParameter("lpwd");
		/*HttpSession session = new HttpSession(false);
		LoginBean bean = new */
		String myObjectId = request.getParameter("myObjectId");
		LoginBean obj =(LoginBean) request.getSession().getAttribute(myObjectId);
boolean status=obj.validate(name,password);
		
		if(status){
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			request.getSession().setAttribute("bean", obj);
			rd.forward(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}

	}
}
