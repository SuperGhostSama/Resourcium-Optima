package com.example.resourciumoptima.web;

import com.example.resourciumoptima.model.Employee;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
    /*private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default"); // Replace with your persistence unit name

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String employeeId = request.getParameter("employeeId");

        if (deleteEmployeeById(Integer.parseInt(employeeId))) {
            response.setStatus(HttpServletResponse.SC_NO_CONTENT); // Successful deletion
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND); // Employee not found or deletion failed
        }
    }

    private boolean deleteEmployeeById(int employeeId) {
        EntityManager em = emf.createEntityManager();

        try {
            Employee employee = em.find(Employee.class, employeeId);

            if (employee != null) {
                em.getTransaction().begin();
                em.remove(employee);
                em.getTransaction().commit();
                return true; // Deletion successful
            } else {
                return false; // Employee not found
            }
        } finally {
            em.close();
        }
    }*/

}
