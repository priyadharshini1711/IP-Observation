<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>
<html>  
    <body>  
        <%   
            String name=request.getParameter("uname");  
            String name2=request.getParameter("uname2");  
            int x = Integer.parseInt(name);
            int y = Integer.parseInt(name2);
            String val = "";
                    
            if(x>y)
            val = x+" is greater";
            else if(x==y)
            val = " is equal ";
            else
            val = y+" is greater";
        %>
        <p>result of greatest of 2 numbers <%= name%> and <%= name2%>  are : <%= val %></p>


    </body>  
</html>  