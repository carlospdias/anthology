package com.cpdias.autofac;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Index  extends HttpServlet{
    private String message;

    public void init() throws ServletException {
       // Do required initialization
       message = "Hello World +++++";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
       
        request.setAttribute("origins", getOrigins());
        response.setContentType("text/html");
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setBufferSize(2048);
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        
       // Actual logic goes here.
       //PrintWriter out = response.getWriter();
       //out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {
       // do nothing.
    }
    
    private List<Origin>getOrigins(){
        
        OriginDao originDao = new OriginDao();
        return originDao.getOrigins();
    }
}
