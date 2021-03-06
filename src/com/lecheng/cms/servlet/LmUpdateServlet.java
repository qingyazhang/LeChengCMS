package com.lecheng.cms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lecheng.cms.dao.LmDao;

public class LmUpdateServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LmUpdateServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LmDao ld = new LmDao();
		request.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("lmname");
		int rst=0;
		 rst=ld.UpdateLm(id, name);
		 if(rst>0){
			 request.setAttribute("rst", rst);
		RequestDispatcher dp = request.getRequestDispatcher("../servlet/SelectServlet");  //请求转发
		dp.forward(request, response); 
		 }
	}


	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
