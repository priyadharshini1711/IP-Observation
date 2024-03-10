<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>
<html>  
    <body>  
        <%   
            String name=request.getParameter("uname");  
            String name2=request.getParameter("uname2");  
        %>
        <p>number 1 : <%= name%> </p>
        <p>number 2 : <%= name2%> </p>


    </body>  
</html>  