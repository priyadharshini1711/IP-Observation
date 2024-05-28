<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>
<html>  
    <body>  
        <%   
            String name=request.getParameter("uname");
            int num = Integer.parseInt(name);
            String day = "";
                    
            switch(num){
                case 1: day = "monday";break;
                case 2: day = "tuesday";break;
                case 3: day = "wednesday";break;
                case 4: day = "thursday";break;
                case 5: day = "friday";break;
                case 6: day = "saturday";break;
                case 7: day = "sunday";break;
                default: day = "invalid date";             
                
            }
          
        %>
        <p>selected day  : <%= name%> </p>
        <p>is : <%= day%> </p>


    </body>  
</html>  