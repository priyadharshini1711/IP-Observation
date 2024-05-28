<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
         pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html> 
<html> 
    <head> 
        <meta charset="ISO-8859-1"> 
        <title>Select</title> 
    </head> 
    <body> 
        <sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/jdbc?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false"
                           user="root" password="root"/> 
        <sql:query dataSource="${ds}" var="rs"> 
            SELECT * FROM employee; 
        </sql:query> 
        <table border = "1" width = "100%">
            <tr>
                <th>Emp ID</th>
                <th>Name</th>
                <th>Dep</th>
            </tr>

            <c:forEach var = "row" items = "${rs.rows}">
                <tr>
                    <td> <c:out value = "${row.id}"/></td>
                    <td> <c:out value = "${row.name}"/></td>
                    <td> <c:out value = "${row.dep}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body> 
</html>
