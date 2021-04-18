package app;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QDao;
import data.Questions;



@WebServlet(
    name = "insert",
    urlPatterns = {"/insert"}
)
public class insert extends HttpServlet {
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
	     throws IOException {
		response.sendRedirect("index.html");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		
		String question=request.getParameter("question");
		
		
		   Questions Que=new Questions(question ); 
		  try {
			QDao.insertQuestions(Que);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  response.sendRedirect("Questions");
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/Newquestion.jsp");
		rd.forward(request, response);
	}
}