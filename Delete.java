package app;

import java.io.IOException;
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
    name = "Delete",
    urlPatterns = {"/delete"}
)
public class Delete extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dao dao;
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3308/ourelectionproject", "root", "root");
	}
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	     throws IOException, ServletException {
		String id=request.getParameter("id");
		ArrayList<Participants> list=null;
		if (dao.Connect()) {
			list=dao.deleteParticipants(id);
		}
		request.setAttribute("participantslist", list);
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/ShowParticipants.jsp");
		rd.forward(request, response);
	}
}