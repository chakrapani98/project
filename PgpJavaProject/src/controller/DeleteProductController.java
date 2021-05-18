package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		
		try
		{
			int productId=Integer.parseInt(request.getParameter("productid"));
			
			dao.ProductDAO productDAO=new dao.ProductDAO();
			
			if(productDAO.deleteProduct(productId))
			{
				 request.setAttribute("productList",productDAO.getProductList());
				  
				  RequestDispatcher dispatcher=request.getRequestDispatcher("ProductDisplay.jsp");
				  dispatcher.forward(request, response);
			  }
			  
			  else
			  {
				  request.setAttribute("errorInfo", "problem occured while inserting Product");
				  RequestDispatcher dispatcher=request.getRequestDispatcher("FailurePage.jsp");
				  dispatcher.forward(request, response); 
				  
			  }
			  
			}
			catch(Exception e) 
			{
				request.setAttribute("errorInfo", "Exception occured while Inserting"+e.getMessage());
				RequestDispatcher dispatcher=request.getRequestDispatcher("FailurePage.jsp");
				 dispatcher.forward(request, response);
				  
			}	
			}
}
