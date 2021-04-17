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
    <center><h1>Participants</h1></center>
    <div align="center">
 
        <c:if test="${participants == null}">
            <form action ="/insertdata" method="post">
        </c:if>
        <table border="1" cellpadding="5"">
            <caption>
                <h2>
                    <c:if test="${participants != null}">
                        Edit participants
                    </c:if>
                    <c:if test="${participants == null}">
                        Add participants
                    </c:if>
                </h2>
            </caption>
                <c:if test="${participants != null}">
                    <input type="hidden" name="id" value="<c:out value='${participants.id}' />" />
                </c:if>           
            <tr>
                <th>Fullname</th>
                <td>
                    <input type="text" name="fullname" size="45"
                            value="<c:out value='${participants.fullname}' />"
                        />
                </td>
            </tr>
            <tr>
                <th>Email</th>
                <td>
                    <input type="email" name="email" size="45"
                            value="<c:out value='${participants.email}' />"
                    />
                </td>
            </tr>
            
            
              <tr>
                <th>Age</th>
                <td>
                    <input type="text" name="age" size="5"
                            value="<c:out value='${participants.age}' />"
                    />
                </td>
            </tr>
            
              <tr>
                <th>Location</th>
                <td>
                    <input type="text" name="location" size="45"
                            value="<c:out value='${participants.location}' />"
                    />
                </td>
            </tr>
            
            
            
            <tr>
                <th>Party </th>
                <td>
                    <select id="party" name="party">
                    <option>---Select Party---</option>
                           value="<c:out value='${participants.party}' />"
                            <option>Left Alliance</option>
                            <option>Green Union</option>
                            <option>Finnish Social Democratic Party</option>
                            <option>Independence Party</option>
                             <option>Swedish People's Party</option>
              
                            
                    </select>       
                            
                    
                </td>
            </tr>
                   <tr>
                <th>Why Parliament </th>
                <td>
                    <input type="text" name="whyparliament" size="45"
                            value="<c:out value='${participants.whyparliament}' />"
                    />
                </td>
            </tr>
            
            
              <tr>
                <th>Want to Promote</th>
                <td>
                    <input type="text" name="wanttopromote" size="45"
                            value="<c:out value='${participants.wanttopromote}' />"
                    />
                </td>
            </tr>
            
            
            
                   <tr>
                <th>Profession</th>
                <td>
                    <input type="text" name="profession" size="15"
                            value="<c:out value='${participants.profession}' />"
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
        
 
        </form>
    </div>   
</body>
</html>