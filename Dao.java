package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import data.Participants;

public class Dao {
	private String url;
	private String user;
	private String pass;
	 private static Connection jdbcConnection;
	
	public Dao(String url, String user, String pass) {
		this.url=url;
		this.user=user;
		this.pass=pass;
	}
	
	public boolean Connect() {
		try {
	        if (jdbcConnection== null || jdbcConnection.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver").newInstance();
	            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	                throw new SQLException(e);
	            }
	            jdbcConnection = DriverManager.getConnection(url, user, pass);
	        }
	        return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
    
    public static boolean InsertdataParticipants(Participants participants) throws SQLException {
      

	 
		String sql = "INSERT INTO participants (fullname, email, age, location, party, whyparliament, wanttopromote, profession) VALUES ( ?, ?, ?,?,?,?,?,?)";
	
	         
	        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
	        statement.setString(1, participants.getFullname());
	        statement.setString(2, participants.getEmail());
	        statement.setString(3, participants.getAge());
	        statement.setString(4, participants.getLocation());
	        statement.setString(5, participants.getParty());
	        statement.setString(6, participants.getWhyparliament());
	        statement.setString(7, participants.getWanttopromote());
	        statement.setString(8, participants.getProfession());
	        
	        
	         
	        boolean rowInserted = statement.executeUpdate() > 0;
	        statement.close();
	    
	        return rowInserted;
	    }

	
    public ArrayList<Participants> listAllParticipants() throws SQLException {
    	ArrayList<Participants> participantslist = new ArrayList<>();
         
        String sql = "SELECT * FROM participants";
         
   
         
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
           String id = resultSet.getString("id");
            String fullname = resultSet.getString("fullname");
            String email = resultSet.getString("email");
            String age = resultSet.getString("age");
            String location = resultSet.getString("location");
            String party = resultSet.getString("party");
            String whyparliament = resultSet.getString("whyparliament");
            String wanttopromote = resultSet.getString("wanttopromote");
            String profession = resultSet.getString("profession");
             
           Participants participants = new Participants(id, fullname, email,age, location, party,whyparliament,wanttopromote,profession);
            participantslist.add(participants);
        }
         
        resultSet.close();
        statement.close();
         
  
         
        return participantslist;
    }
	public ArrayList<Participants> updateParticipants(Participants Parti) {
		try {
			String sql="update participants set fullname=?, email=?, age =?, location=?, party=?,whyparliament=?, wanttopromote=?, profession=?  where id=?";
			PreparedStatement pstmt=jdbcConnection.prepareStatement(sql);
	
			pstmt.setString(1, Parti.getFullname());
			pstmt.setString(2, Parti.getEmail());
			pstmt.setString(3, Parti.getAge());
			pstmt.setString(4, Parti.getLocation());
			pstmt.setString(5, Parti.getParty());
			pstmt.setString(6, Parti.getWhyparliament());
			pstmt.setString(7, Parti.getWanttopromote());
			pstmt.setString(8, Parti.getProfession());
			pstmt.setInt(9, Parti.getId());
	
			pstmt.executeUpdate();
			return listAllParticipants();
		}
		catch(SQLException e) {
			return null;
		}
	}


	public ArrayList<Participants> deleteParticipants(String id) {
		try {
			String sql="delete from participants  where id=?";
			PreparedStatement pstmt=jdbcConnection.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			return listAllParticipants();
		}
		catch(SQLException e) {
			return null;
		}
	}

	public Participants readParticipants(String id) {
		Participants Parti =null;
		try {
			String sql="select * from participants where id=?";
			PreparedStatement pstmt=jdbcConnection.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet RS=pstmt.executeQuery();
			while (RS.next()){
				Parti=new Participants();
				Parti.setId(RS.getInt("id"));
				Parti.setFullname(RS.getString("fullname"));
				Parti.setEmail(RS.getString("email"));
				Parti.setAge(RS.getString("age"));
				Parti.setLocation(RS.getString("location"));
				Parti.setParty(RS.getString("party"));
				Parti.setWhyparliament(RS.getString("whyparliament"));
				Parti.setWanttopromote(RS.getString("wanttopromote"));
				Parti.setProfession(RS.getString("profession"));

			}
			return Parti;
		}
		catch(SQLException e) {
			return null;
		}
	}
}