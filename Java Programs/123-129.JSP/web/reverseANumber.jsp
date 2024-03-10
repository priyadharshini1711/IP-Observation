<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Reverse a Number</title>
    </head>
    <body>
        <%
        String rev = "";
        String n = request.getParameter("uname"); 
        int x = Integer.parseInt(n);
        int y = 0;
        if(n != null) { 
            while(x>0){
                y=(y*10)+(x%10);         
                x = x/10;
            }
            out.println("Reverse of Given number "+n+" is :");
            out.println("" + y);
        }
        %>
    </body>
</html>