
package com.tem.controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ApproveVendorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.getWriter().println("ApproveVendorServlet working");
    }
}
