<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <link href="style.css" rel="stylesheet" type="text/css">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
      
       

               <h1>Election Questionnaire!</h1>
				
				    <table>
				      <tr>
				        <td colspan="2" style="font-weight:bold;">Select from the options below: (1) Strongly Disagree (2) Disagree (3) Neutral (4) Agree (5) Strongly Agree</td>        
				      </tr>
				      <tr>
				        <td colspan="2" style="font-weight:bold;"> </td>        
				      </tr>
				      <tr>
				        <td colspan="2" style="font-weight:bold;">Your Opinion matters and treated with maximum confidentiality</td>        
				      </tr>
				    </table>
				  </body>
				<style>
				div#test{ border:#000 1px solid; padding:10px 40px 40px 40px; }
				</style>
				<script>
				var pos = 0, test, test_status, question, choice, choices, chA, chB, chC, chD, chE, correct = 0;
				var questions = [
				    [ "Foreign aid: Do you support the foreign assistance budget, which makes up less than 1% of the total federal budget? (Why it’s important: This budget helps build stable economies and infrastructure while giving communities a path out of poverty through access to basics like health facilities, schools, and clean water.)", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
					[ "Human trafficking: Do you see the Finnish Government playing a role in combating human trafficking, also known as modern-day slavery?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
					[ "Disaster response: Would you ensure that Finland is able to respond quickly and effectively to people in other parts of the world suffering from war and/or natural disasters?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
					[ "World hunger: Programs such as Food for Peace and Feed the Future have a history of strengthening U.S. relationships around the world and building self-sustainability for small-scale farmers. Do you see value in these programs and do you see Finland as a country to benefit in continuing programs such as these?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Collaboration: How do you see faith-based organizations, nongovernmental organizations, and the Finnish government working together to help fight extreme poverty?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Do you think the ambit of political branding spread beyond the realms of an election?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Have social media become an effective tool to gauge the performance of products, including that in politics?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Should normal democratic engagement and posturing be expected to work in the face of extreme democratic outcomes?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Do religion influence the outcome of an election and does it have a bearing in the economic outlook of a country?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Does past voting behavior play a role in determining future voting preferences?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "D" ],
				    [ "Is it easy to gauge the effect of social media on the outcome of an election?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Do you as a leader bring to this position what will help to promote growth in the People around you?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Will you increase the awareness of the significance of your position to a wide range of Citizens?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Do you believe is the main mission of EU and how will you spread that mission to your fellow Citizens?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Will your party address the existing constraints to women's time in order to facilitate thier participation in future development projects?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Do you believe in protecting the rights of your constituents, regardless of their faith or beliefs?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Is it appropriate for a candidate to assert personal religious beliefs on the campaign trail?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ],
				    [ "Conflicts in personal values are inevitable. Has the candidate carefully considered how to navigate this inevitable situation?", "Strongly Disagree", "Disagree", "Neutral", "Agree", "Strongly Agree", "E" ]
				];
				function _(x){
					return document.getElementById(x);
				}
				function renderQuestion(){
					test = _("test");
					if(pos >= questions.length){
						test.innerHTML = "<h2>You got "+correct+" of "+questions.length+" questions correct</h2>";
						_("test_status").innerHTML = "Questionnaire Completed";
						pos = 0;
						correct = 0;
						return false;
					}
					_("test_status").innerHTML = "Question "+(pos+1)+" of "+questions.length;
					question = questions[pos][0];
					chA = questions[pos][1];
					chB = questions[pos][2];
					chC = questions[pos][3];
					chD = questions[pos][4];
					chE = questions[pos][5];
					test.innerHTML = "<h3>"+question+"</h3>";
					test.innerHTML += "<input type='radio' name='choices' value='A'> "+chA+"<br>";
					test.innerHTML += "<input type='radio' name='choices' value='B'> "+chB+"<br>";
					test.innerHTML += "<input type='radio' name='choices' value='C'> "+chC+"<br>";
					test.innerHTML += "<input type='radio' name='choices' value='D'> "+chD+"<br>";
					test.innerHTML += "<input type='radio' name='choices' value='E'> "+chE+"<br><br>";
					test.innerHTML += "<button onclick='checkAnswer()'>Submit Answer</button>";
				}
				function checkAnswer(){
					choices = document.getElementsByName("choices");
					for(var i=0; i<choices.length; i++){
						if(choices[i].checked){
							choice = choices[i].value;
						}
					}
					if(choice == questions[pos][18]){
						correct++;
					}
					pos++;
					renderQuestion();
				}
				window.addEventListener("load", renderQuestion, false);
				</script>
				</head>
				<body>
				<h2 id="test_status"></h2>
				<div id="test"></div>
				            
         
                           
                                  
   


</body>
</html>