
package app;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QDao;
import data.Questions;


@WebServlet(
    name = "Qdelete",
    urlPatterns = {"/qdelete"}
)
public class Qdelete extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private QDao dao;
	public void init() {
		dao=new QDao("jdbc:mysql://localhost:3307/ourelectionproject", "root", "shiva");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String question_id=request.getParameter("question_id");
		ArrayList<Questions> list=null;
		if (dao.Connect()) {
			list=dao.deleteQuestions(question_id);
		}
		request.setAttribute("questionslist", list);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/ShowQuestions.jsp");
		rd.forward(request, response);
	}
}
	
