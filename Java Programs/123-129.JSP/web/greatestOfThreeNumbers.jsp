<%@ page import="java.util.*" %>
<%@ page import="java.text.DateFormat" %>
<html>  
    <body>  
        <%   
            String name=request.getParameter("uname");
            String name1=request.getParameter("uname2");
            String name2=request.getParameter("uname3");
            int num = Integer.parseInt(name);
            int num1 = Integer.parseInt(name1);
            int num2 = Integer.parseInt(name2);
            
            int greatest = num2;
            
            if(num > num1 && num > num2){
                greatest = num;
            } else if(num1 > num2){
                greatest = num1;
            }
          
        %>
        <p>Number 1 : <%= num%> </p>
        <p>Number 2 : <%= num1%> </p>
        <p>Number 3 : <%= num2%> </p>
        <p>greatest : <%= greatest%> </p>


    </body>  
</html>  