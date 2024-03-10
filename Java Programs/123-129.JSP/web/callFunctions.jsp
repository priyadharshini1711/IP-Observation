<html>  
    <body>  
        <%   
            String name=request.getParameter("uname");  
            String name2=request.getParameter("uname2");  
        %>
        <%!
        public int sum(String a, String b)
        {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            return x + y;
        }
        %>

        <p>number 1 : <%= name%> </p>
        <p>number 2 : <%= name2%> </p>
        <p>sum : <%= sum(name, name2) %> </p>


    </body>  
</html>  