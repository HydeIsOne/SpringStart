package gb.servlets;

import gb.model.Product;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductHttpServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    List<Product> list = new ArrayList<>();

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("product", getProduct());
//        getServletContext().getRequestDispatcher("/product.jsp").forward(req, resp);
//    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
            resp.getWriter().printf("<h1> Test" + "</h1>");
        resp.getWriter().printf("</body></html>");
    }

//    public Product getProduct() {
//        Product p1 = new Product(1, "product_1", 10);
//        Product p2 = new Product(2, "product_2", 200);
//        Product p3 = new Product(3, "product_3", 300);
//        Product p4 = new Product(4, "product_4", 400);
//        Product p5 = new Product(5, "product_5", 500);
//        Product p6 = new Product(6, "product_6", 600);
//        Product p7 = new Product(7, "product_7", 700);
//        Product p8 = new Product(8, "product_8", 800);
//        Product p9 = new Product(9, "product_9", 900);
//        Product p10 = new Product(10, "product_10", 1000);
//        list.add(p1);
//        list.add(p2);
//        list.add(p3);
//        list.add(p4);
//        list.add(p5);
//        list.add(p6);
//        list.add(p7);
//        list.add(p8);
//        list.add(p9);
//        list.add(p10);
//        return (Product) list;
//    }
}
