//package master.servlet;
//
//public class TourServe {
//
//	public TourServe() {
//		// TODO Auto-generated constructor stub
//	}
//
//}
package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.Tourdao;
import master.dto.Tourdto;
/**
 * Servlet implementation class DetailServe
 */
@WebServlet("/TourServe")
public class TourServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html");
		String tname=request.getParameter("tour_name");
		
		Tourdto tdto=new Tourdto();
		tdto.setTname(tname);
		
		Tourdao tdao=new Tourdao();
		//fdao.insertData(fdto);
		tdao.searchData(tdto);
		//response.sendRedirect("Show.jsp");
		response.sendRedirect("SearchResult.jsp");
		
	}

}
