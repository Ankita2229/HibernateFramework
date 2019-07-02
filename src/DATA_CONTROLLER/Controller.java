package DATA_CONTROLLER;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import DATA_DO.DAO;
import DATA_VO.VO;


/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String f = request.getParameter("flag");
		if(f != null && f.equals("searchData"))
		{
			search(request, response);
		}
		
		if(f != null && f.equals("edit"))
		{
			edit(request,response);
		}
		
		if(f != null && f.equals("delete"))
		{
			delete(request,response);
			search(request, response);
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String flag = request.getParameter("flag");
		
		
		System.out.println(flag);
		
		if (flag != null && flag.equals("insert")) {
			insert(request, response);
		}
		
		if (flag != null && flag.equals("update")) {
			update(request, response);
			search(request, response);
		}
	}
	
		void insert(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			String ui = request.getParameter("Username");
			String pw = request.getParameter("Password");
		
			
			System.out.println(ui);
			System.out.println(pw);
		
			System.out.println("INSERT");
			
			VO dv = new VO();
			dv.setU_name(ui);
			dv.setPass(pw);
			
			System.out.println("inside insert");
			DAO dd = new DAO();
			dd.insert(dv);
			
			PrintWriter out = response.getWriter();
			
			response.sendRedirect("files/logged.jsp");
					
		}
		
		private void search(HttpServletRequest request, HttpServletResponse response)throws IOException {
			// TODO Auto-generated method stub
			
			List ls = new ArrayList();
			DAO dd = new DAO();
			ls = dd.search();
			
			HttpSession session = request.getSession();
			session.setAttribute("dataList", ls);
			response.sendRedirect("user/search.jsp");
			
			
		}
		
		private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
			// TODO Auto-generated method stub
			String s = request.getParameter("dataId");
			int id=Integer.parseInt(s);
			VO dv = new VO();
			dv.setData_Id(id);
			
			DAO dd = new DAO();
			List ls=dd.edit(dv);
			
			HttpSession hs=request.getSession();
			hs.setAttribute("editData", ls);
			
			response.sendRedirect("user/edit.jsp");
			
		}
		
		private void update(HttpServletRequest request, HttpServletResponse response) {
			// TODO Auto-generated method stub
			
			int id=Integer.parseInt(request.getParameter("id"));
			String ui = request.getParameter("u_name");
			String pw = request.getParameter("pass");
		
			VO dv = new VO();
			dv.setData_Id(id);
			
			dv.setU_name(ui);
			dv.setPass(pw);
			
			DAO dd = new DAO();
			dd.update(dv);
		}
		private void delete(HttpServletRequest request, HttpServletResponse response) {
			// TODO Auto-generated method stub
			
			String s = request.getParameter("dataId");
			int id=Integer.parseInt(s);
			VO dv=new VO();
			dv.setData_Id(id);
			
			DAO dd = new DAO();
			dd.delete(dv);
		}
				

	
		
		
	}


