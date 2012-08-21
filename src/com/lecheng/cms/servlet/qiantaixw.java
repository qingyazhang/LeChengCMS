package com.lecheng.cms.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lecheng.cms.dao.qiantailm;
import com.lecheng.cms.pojo.qiantaixinwenPojo;


public class qiantaixw extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public qiantaixw() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		qiantailm qtlm = new qiantailm();//����CusSelectBean����
		ArrayList<qiantaixinwenPojo> list = new ArrayList<qiantaixinwenPojo>();//���弯�϶���
		list = qtlm.selectlm();//���ò�ѯ�ķ���
		request.setAttribute("list", list);
		HttpSession session = request.getSession();//��servlet�е�û��session������Ҫ��ʵ���������session����
		session.setAttribute("list", list);//���ϱߵļ��ϴ����session��Χ��
		response.sendRedirect("../xianshinews.jsp");//��ת��ǰ̨ҳ��
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