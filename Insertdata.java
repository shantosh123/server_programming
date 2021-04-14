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

import dao.Dao;
import data.Participants;

// just testing one more time
@WebServlet(
    name = "Insertdata",
    urlPatterns = {"/Insertdata"}
)
public class Insertdata extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3307/ourelectionproject", "root", "shiva");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException {
		response.sendRedirect("index.html");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		String location=request.getParameter("location");		
		String party=request.getParameter("party");
		String whyparliament=request.getParameter("whyparliament");
		String wanttopromote=request.getParameter("wanttopromote");
		String profession=request.getParameter("profession");
		
		   Participants Parti=new Participants(fullname,email,age, location, party, whyparliament,wanttopromote, profession  ); 
		  try {
			Dao.InsertdataParticipants(Parti);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  response.sendRedirect("Participants");
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/Newdata.jsp");
		rd.forward(request, response);
	}
}