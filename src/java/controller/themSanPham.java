/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.addSanPham;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SanPham;
import model.sanPhamThem;

/**
 *
 * @author Mai Ly
 */
@WebServlet(name = "themSanPham", urlPatterns = {"/themSanPham"})
public class themSanPham extends HttpServlet {

    addSanPham addDao = new addSanPham();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("maSanPham");
            String tenSanPham = request.getParameter("tenSanPham");
            String hinhAnh = request.getParameter("hinhAnh");
            String gia = request.getParameter("giaSanPham");
            String soLuong = request.getParameter("soLuong");
            String action = request.getParameter("action");
            
          
            switch (action) {
                case "add":
                    SanPham sp = new SanPham(id, tenSanPham, hinhAnh, gia, soLuong);
                    addDao.add(sp);
//                spDAO.Add_sanpham(sp);
//                    request.setAttribute("LIST_SANPHAM", spDAO.get_all());
//                    System.out.println( spDAO.get_all().size());
                    request.getRequestDispatcher("/insert.jsp").forward(request, response);
                    break;
                case "delete":
                    addDao.de(id);
                      request.getRequestDispatcher("/insert.jsp").forward(request, response);
                    break;
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
