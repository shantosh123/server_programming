package dao;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;

import data.Questions;

import java.awt.List;
	import java.sql.Connection;

	public class QDao {
		private String url;
		private String user;
		private String pass;
		 private static Connection jdbcConnection;
		
		public QDao(String url, String user, String pass) {
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
		
	    
	    public static boolean insertQuestions(Questions questions) throws SQLException {
	      

		 
			String sql = "INSERT INTO questions (question) VALUES (?)";
		
		         
		        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		        statement.setString(1, questions.getQuestion());
	
		        
		         
		        boolean rowInserted = statement.executeUpdate() > 0;
		        statement.close();
		    
		        return rowInserted;
		    }

		
	    public ArrayList<Questions> listAllQuestions() throws SQLException {
	    	ArrayList<Questions> questionslist = new ArrayList<>();
	         
	        String sql = "SELECT * FROM questions";
	         
	   
	         
	        Statement statement = jdbcConnection.createStatement();
	        ResultSet resultSet = statement.executeQuery(sql);
	         
	        while (resultSet.next()) {
	           String question_id = resultSet.getString("question_id");
	            String question = resultSet.getString("question");
	        
	         Questions questions = new Questions(question_id, question);
	           questionslist.add(questions);
	        }
	         
	        resultSet.close();
	        statement.close();
	         
	  
	         
	        return questionslist;
	    }

		public ArrayList<Questions> deleteQuestions(String question_id) {
			try {
				String sql="delete from questions where question_id=?";
				PreparedStatement pstmt=jdbcConnection.prepareStatement(sql);
				pstmt.setString(1, question_id);
				pstmt.executeUpdate();
				return listAllQuestions();
			}
			catch(SQLException e) {
				return null;
			}
		}

		public Questions readQuestions(String question_id) {
			Questions Que =null;
			try {
				String sql="select * from questions where question_id=?";
				PreparedStatement pstmt=jdbcConnection.prepareStatement(sql);
				pstmt.setString(1, question_id);
				ResultSet RS=pstmt.executeQuery();
				while (RS.next()){
					Que=new Questions();
					Que.setQuestion_id(RS.getInt("question_id"));
					Que.setQuestion(RS.getString("question"));
					
				}
				return Que;
			}
			catch(SQLException e) {
				return null;
			}
		}
	}