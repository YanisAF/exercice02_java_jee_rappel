package org.example.exercice02_java_jee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "personServlet", value = "/person-servlet")
public class PersonServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Luc", "Bonnie", 36));
        people.add(new Person("Dame", "Bonnie", 57));
        people.add(new Person("Bernard", "Bonnie", 46));

        req.setAttribute("people", people);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/person.jsp");
        dispatcher.forward(req, res);

    }

}
