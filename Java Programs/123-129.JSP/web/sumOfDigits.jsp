<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>
<html>  
    <body>  
        <%   
            String name=request.getParameter("uname");
            int num = Integer.parseInt(name);
            int sum =0;
            while(num>0){
            sum += (num % 10);
            num = num / 10;
            }
          
        %>
        <p>num : <%= name%> </p>
        <p>sum : <%= sum%> </p>


    </body>  
</html>  