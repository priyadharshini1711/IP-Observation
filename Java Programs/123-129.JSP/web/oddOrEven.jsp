<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>
<html>  
    <body>  
        <%   
            String name=request.getParameter("uname");  
            int x = Integer.parseInt(name);
            String val = "";
                    
            if(x%2==0)
            val = "Even";
            else
            val = "Odd";
        %>
        <p>The current data <%= name%> is : <%= val %></p>


    </body>  
</html>  