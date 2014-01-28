/**
 *
 */
package jp.co.servlet.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author nose
 *
 */
public class HelloServlet extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/* (非 Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello Servlet!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Servletとは、Webサーバ上で実行されるモジュール(部品)化されたJavaプログラムらしいよ！</h2>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello Servlet!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Servletとは、Webサーバ上で実行されるモジュール(部品)化されたJavaプログラムらしいよ！</h2>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}
}
