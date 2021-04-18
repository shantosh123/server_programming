package data;

public class Questions {
	
	private int question_id;
	private String question;
	
	

		public Questions(String question_id, String question) {
			// TODO Auto-generated constructor stub
			setQuestion_id(question_id);
			this.question=question;
		
			
			
		}

		public Questions() {
		    }
		 
		    public Questions(int question_id) {
		        this.question_id = question_id;
		    }
		 
		
		     
		    public Questions(String question) {
		
				this.question=question;
			
		        
		    }

			public int getQuestion_id() {
				return question_id;
			}

			public void setQuestion_id(int question_id) {
				this.question_id = question_id;
				
			}
			public void setQuestion_id(String question_id) {
				try {
					this.question_id = Integer.parseInt(question_id);
				}
				catch(NumberFormatException | NullPointerException e) {
					//Do nothing - the value of id won't be changed
				}
			}

			public String getQuestion() {
				return question;
			}

			public void setQuestion(String question) {
				this.question = question;
			}

			

		
		
		}


