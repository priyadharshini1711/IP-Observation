<%@ page errorPage="error.jsp" %>  
<%  
  
String num1=request.getParameter("uname");  
String num2=request.getParameter("uname2");  
  
int a=Integer.parseInt(num1);  
int b=Integer.parseInt(num2);  
int c=a/b;  
out.print("division of numbers is: "+c);  
  
%>  