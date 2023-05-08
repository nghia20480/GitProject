package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductSeverlet", urlPatterns = "/products")
public class ProductSeverlet extends HttpServlet {
private ProductService productservice=new ProductServiceImpl();
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{
String action =request.getParameter("action");
if (action==null){
    action="";
}
switch (action){
    case "create":
        createProduct(request, response);
        break;
    case "edit":
        break;
    case "delete":
        break;
    default:
        break;
}
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   String action=request.getParameter("action");
    if (action==null){
        action="";
    }
    switch (action){
        case "create":
            showCreateForm(request,response);
            break;
        case "edit":

            break;
        case "delete":
            break;
        default:
            listCustomers(request, response);
            break;
    }
}
    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = this.productservice.findAll();
        request.setAttribute("products", productList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("ten");
        int gia = Integer.parseInt(request.getParameter("gia"));
        String nhasx=request.getParameter("nhasx");
        String mota =request.getParameter("thongtin");




        Product product = new Product(id,name,gia,nhasx,mota);
        this.productservice.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        request.setAttribute("message", "New customer was created");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

