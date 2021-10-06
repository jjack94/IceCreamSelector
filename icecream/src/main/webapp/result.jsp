<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<body>
<center>
<h1>
    Available Flavors
</h1>

<%
List result= (List) request.getAttribute("flavors");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>