<%! int fontSize = 21; %>
<html>
   <head>
      <title>WHILE LOOP Example</title>
   </head>
   <body>
      <%while ( fontSize <= 30){ %>
         <font color = "green" size = "<%= fontSize %>">
            JSP Tutorial
         </font><br />
         <%fontSize++;%>
      <%}%>
   </body>
</html>