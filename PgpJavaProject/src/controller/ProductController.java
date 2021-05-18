package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductController")
public class ProductController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		String productName=request.getParameter("productname");
		String price=request.getParameter("price");
		String desc=request.getParameter("desc");
		String stock=request.getParameter("stock");
		String category=request.getParameter("category");
		String supplier=request.getParameter("supplier");
		
		
		model.Product productObj=new model.Product();
		productObj.setProductName(productName);
		productObj.setStock(Integer.parseInt(stock.trim()));
		productObj.setPrice(Integer.parseInt(price.trim()));
		productObj.setDescription(desc);
		productObj.setCategory(category);
		productObj.setSupplier(supplier);
		
		
		try 
		{
		  dao.ProductDAO productDAO=new dao.ProductDAO();
		  
		  if(productDAO.insertProduct(productObj))
		  {
			  request.setAttribute("productList",productDAO.getProductList());
			  
			  RequestDispatcher dispatcher=request.getRequestDispatcher("ProductDisplay.jsp");
			  dispatcher.forward(request, response);
		  }
		  
		  else
		  {
			  request.setAttribute("errorInfo", "problem occured while for inserting Product");
			  RequestDispatcher dispatcher=request.getRequestDispatcher("FailurePage.jsp");
			  dispatcher.forward(request, response); 
			  
		  }
		  
		}
		catch(Exception e) 
		{
			request.setAttribute("errorInfo", "Exception occured while Inserting"+e.getMessage() +e);
			RequestDispatcher dispatcher=request.getRequestDispatcher("FailurePage.jsp");
			 dispatcher.forward(request, response);
			  
		}
		
	}

}
