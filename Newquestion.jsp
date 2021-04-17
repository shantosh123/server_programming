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
    <center><h1>Questions</h1></center>
    <div align="center">
 
        <c:if test="${questions == null}">
            <form action ="/insert" method="post">
        </c:if>
        <table border="1" cellpadding="5"">
            <caption>
                <h2>
              
                    <c:if test="${questions == null}">
                        Add question
                    </c:if>
                </h2>
            </caption>
                <c:if test="${questions != null}">
                    <input type="text" name="question_id" value="<c:out value='${questions.question_id}' />" />
                </c:if>           
            <tr>
                <th>Question</th>
                <td>
                    <input type="text" name="question" size="100"
                            value="<c:out value='${questions.question}' />"
                        />
                </td>
            </tr>
            

            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                    <input type="button" value="Cancel" onclick="javascript:history.go(-1);">
                </td>
            </tr>
            
            
        </table>
        
 
    </div>   
</body>
</html>