package com.parking.parkinglot.servlets;

import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.ejb.CarsBean;
import com.parking.parkinglot.ejb.UserBean;
import com.parking.parkinglot.entities.User;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name= "AddCar", value = "/AddCar")
public class AddCar extends HttpServlet {

    @Inject
    UserBean usersBean;
    @Inject
    CarsBean carsBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
            List<UserDto> users =usersBean.findAllUsers();
            req.setAttribute("users",users);


       req.getRequestDispatcher("/WEB-INF/pages/addCar.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String licensePlate = req.getParameter("license_plate");
        String parkingSpot = req.getParameter("parking_spot");
        Long userId = Long.parseLong(req.getParameter("owner_id"));
        carsBean.createCar(licensePlate, parkingSpot, userId);

        resp.sendRedirect(req.getContextPath() + "/Cars");
    }
}
