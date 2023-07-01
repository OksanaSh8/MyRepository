package by.itclass.servlets;

import by.itclass.beans.Conference;
import by.itclass.memory.ConferenceMemory;
import sun.security.util.Event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

@WebServlet(name = "ConferenceServlet", value = "/servlet")

public class ConferenceServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name1 = request.getParameter("name");
        Event data=null;
        InputStream in=
        Conference findValue = ConferenceMemory.getConference(request.getParameter("name"));

        request.setAttribute("conferenceAttr", findValue);
        request.setAttribute("conferenceAttr1", findValue.getEvent());
        RequestDispatcher rd = request.getRequestDispatcher("/view.jsp");
        rd.forward(request, response);
    }
}
