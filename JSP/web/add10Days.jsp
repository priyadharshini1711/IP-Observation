<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>
<html>  
    <body>  
        <%Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
 
        // Adding date
        cal.add(Calendar.DATE, 10); 
        Date modifiedDate = cal.getTime();
        %>  
        <p>The current date and time after 10 days is: <%= modifiedDate %></p>


    </body>  
</html>  