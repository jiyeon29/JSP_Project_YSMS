package com.ysms.homeController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysms.command.Command;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.four")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// * * * * * * * * * * * MEMO * * * * * * * * * * * //
	// 1. 확장자 '.do' 가 '.four'입니다 !!
	// 2. DB name : team4
	// 3. Interface : Command
	// 4. dao & dto 사용시 : Dao_*.java / Dto_*.java 형태로 작성
	// * * * * * * * * * * * * * * * * * * * * * * * * //
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> doGet <<");
		actionFour(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> doPost <<");
		actionFour(request, response);
	}

	protected void actionFour(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> actionFour() <<");
		// 2Byte Encoding 
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		String viewPage = null;
		Command command = null;
		
		
		
		
		
		
		
		
		
	}	
		
	
	
	
	
	
	
}
