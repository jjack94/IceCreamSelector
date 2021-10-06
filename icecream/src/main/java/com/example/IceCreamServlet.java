package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.example.model.IceCreamType;

@WebServlet(name = "icecreamservlet", urlPatterns = "/SelectIceCream")

public class IceCreamServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String icecreamType  =req.getParameter("Type");
        IceCreamService iceCreamService = new IceCreamService();
        IceCreamType i = IceCreamType.valueOf(icecreamType);
        
        List iceCreamFlavors = iceCreamService.getAvailableFlavors(i);

        req.setAttribute("flavors", iceCreamFlavors);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}
