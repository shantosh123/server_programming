<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
 <%@ page import="java.util.ArrayList" %>   
 <%@ page import="data.Questions" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>


   <title>Questions</title>
</head>
<body>
    <center>
    
   
    
        <h1> Questions</h1>
        <h2>


    
            <a href="/jsp/Newquestion.jsp">Create new Question</a>
                &nbsp;&nbsp;&nbsp;
      
         
         
         
        </h2>
    </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Questions</h2></caption>
            <tr>
                <th>Question Id</th>
                <th>Question</th>         
                <th>Delete</th>
            </tr>
            <c:forEach var="questions" items="${questionslist}">
                <tr>
                    <td><c:out value="${questions.question_id}" /></td>
                    <td><c:out value="${questions.question}" /></td>
                
                    <td>
                    
                        <a href='/qdelete?question_id=${questions.question_id}'>delete</a>                   
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div> 
    
    <%@ include file="../html/somehtml.html" %>
      
</body>
</html>
