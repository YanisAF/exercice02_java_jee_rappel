<%@ page import="java.util.List" %>
<%@ page import="org.example.exercice02_java_jee.Person"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person Servlet</title>
</head>
<body>

    <%
        List<Person> peoples = (List<Person>) request.getAttribute("people");


        if (peoples != null) {

            for (Person person : peoples) {
    %>
    <ul>
        <li><%= person.getName() %></li>
        <li><%= person.getSurname() %></li>
        <li><%= person.getAge() %></li>
    </ul>
    <%
            }
        }
    %>


</body>
</html>
