<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
 <%@ page import="java.util.ArrayList" %>   
 <%@ page import="data.Participants" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>


   <title>Participants</title>
</head>
<body>
    <center>
    
   
    
        <h1> Participants</h1>
        <h2>


    
            <a href="/jsp/Newdata.jsp">Create new Participant</a>
                &nbsp;&nbsp;&nbsp;

         
      
         
        </h2>
    </center>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Participants</h2></caption>
            <tr>
                <th>ID</th>
                <th>Fullname</th>
                <th>Email</th>
                <th>Age</th>
                <th>Location</th>           
                <th>Party</th>
                <th>Why Parliament</th>             
                <th>Want to Promote</th>
                <th>Profession</th>
                <th>Update/delete</th>
            </tr>
            <c:forEach var="participants" items="${participantslist}">
                <tr>
                    <td><c:out value="${participants.id}" /></td>
                    <td><c:out value="${participants.fullname}" /></td>
                    <td><c:out value="${participants.email}" /></td>
                    <td><c:out value="${participants.age}" /></td>
                    <td><c:out value="${participants.location}" /></td>          
                    <td><c:out value="${participants.party}" /></td>
                    <td><c:out value="${participants.whyparliament}" /></td> 
                    <td><c:out value="${participants.wanttopromote}" /></td>
                    <td><c:out value="${participants.profession}" /></td>
                    <td>
                    
                        <a href='/readtoupdate?id=${participants.id}'>update</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href='/delete?id=${participants.id}'>delete</a>                   
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>   
    
    
    <%@ include file="../html/somehtml.html" %>
    
    
    
</body>
</html>
