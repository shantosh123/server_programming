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


@WebServlet("/showparticipants")
public class ShowParticipants extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao dao=null;
	
	@Override
	public void init() {
		dao=new Dao("jdbc:mysql://localhost:3307/ourelectionproject", "root", "shiva");
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowParticipants() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Participants> list=null;
	
			if (dao.Connect()) {
				try {
					list=dao.listAllParticipants();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("No connection to database");
			}


		request.setAttribute("participantslist", list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/jsp/ShowParticipants.jsp");
		rd.forward(request, response);
	}
}
