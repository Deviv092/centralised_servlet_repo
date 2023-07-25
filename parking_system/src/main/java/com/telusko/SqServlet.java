package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends AddServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//		int k =(int) req.getAttribute("k");

//		int k = Integer.parseInt(req.getParameter("k"));

//		HttpSession session=req.getSession();
//		int k=(int) session.getAttribute("k");

		int k = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}

		k *= k;
		PrintWriter out = res.getWriter();
		out.println("The result is " + k);
	}

}
