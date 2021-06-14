package com.bl.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		description = "Login Servelet Testing",
		urlPatterns = {"/LoginServlet" },
		initParams = {
				@WebInitParam(name ="user" , value = "Saket"),
				@WebInitParam(name="password" , value="Saket@420")
		    }
		)

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String user = request.getParameter("user");
	     String pwd = request.getParameter("pwd");
	     
	     String userID = getServletConfig().getInitParameter("user");
	     String password = getServletConfig().getInitParameter("password");
	     if(userID.equals(user) && password.equals(pwd)) {
	    	 request.setAttribute("user", user);
	    	 request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
	     }else {
	    	 RequestDispatcher rd= getServletContext().getRequestDispatcher("/Login.html");
	    	 PrintWriter out = response.getWriter();
	    	 out.println("<font color =red>Either USERNAME or PASSWORD is wrong.</font>");
	    	 rd.include(request, response);
	     }
	
	}

}
