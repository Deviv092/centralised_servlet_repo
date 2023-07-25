package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

//	PrintWriter out =res.getWriter();
//	out.println("result is "+k);

//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);

//		res.sendRedirect("sq?k=" + k); //url re-writting

//		HttpSession session=req.getSession();
//		session.setAttribute("k", k);

		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);

		res.sendRedirect("sq");

	}
}
