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


@WebServlet(
    name = "Update",
    urlPatterns = {"/update"}
)
public class Update extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3306/ourelectionproject", "root", "shantosh123");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException {
		response.sendRedirect("index.html");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String id=request.getParameter("id");
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		String location=request.getParameter("location");	
		String party=request.getParameter("party");
		String whyparliament=request.getParameter("whyparliament");
		String wanttopromote=request.getParameter("wanttopromote");
		String profession=request.getParameter("profession");
		
		Participants Parti=new Participants( id, fullname, email,age, location,  party, whyparliament,wanttopromote,profession);
		
		ArrayList<Participants> list=null;
		if (dao.Connect()) {
			list=dao.updateParticipants(Parti);
		}
		
		request.setAttribute("participantslist", list);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/ShowParticipants.jsp");
		rd.forward(request, response);
	}
}