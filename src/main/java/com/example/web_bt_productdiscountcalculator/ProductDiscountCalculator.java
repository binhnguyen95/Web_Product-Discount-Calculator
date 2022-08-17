package com.example.web_bt_productdiscountcalculator;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductDiscountCalculator", value = "/display-discount")
public class ProductDiscountCalculator extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float DiscountAmount = (float) (price * discount * 0.01);
        float AfterDiscount = price - DiscountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>Product Description: " + description + "</h2>");
        writer.println("<h2>Price: " + price + "</h2>");
        writer.println("<h2>Discount Amount: " + DiscountAmount + "</h2>");
        writer.println("<h2>Discount Price: " + AfterDiscount + "</h2>");
        writer.println("</html>");

    }


}