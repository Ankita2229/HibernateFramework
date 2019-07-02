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

import DATA_DO.CLASS_DAO;

import DATA_VO.CLASS_VO;
/**
 * Servlet implementation class CLASS_Controller
 */
public class CLASS_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CLASS_Controller() {
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
		
		String nam = request.getParameter("person_name");
		int num = Integer.parseInt(request.getParameter("mob_num"));
		String ad = request.getParameter("home_add");
		String em = request.getParameter("e-id");
		String pro_name = request.getParameter("p_name");
		int quant_ity = Integer.parseInt(request.getParameter("quant"));
		String pmt = request.getParameter("p_modes");
		
		System.out.println(nam);
		System.out.println(num);
		System.out.println(ad);
		System.out.println(em);
		System.out.println(pro_name);
		System.out.println(quant_ity);
		System.out.println(pmt);
		
		System.out.println("INSERT");
		
		CLASS_VO dv = new CLASS_VO();
		dv.setUr_name(nam);
		dv.setPh_no(num);
		dv.setH_ad(ad);
		dv.setElec_id(em);
		dv.setItem(pro_name);
		dv.setQuos(quant_ity);
		dv.setMoney(pmt);
		
		System.out.println("inside insert");
		CLASS_DAO dd = new CLASS_DAO();
		dd.insert(dv);
		
		PrintWriter out = response.getWriter();
		
		response.sendRedirect("files/cart.jsp");
		
	}
	
	private void search(HttpServletRequest request, HttpServletResponse response)throws IOException {
		// TODO Auto-generated method stub
		
		List ls = new ArrayList();
		CLASS_DAO dd = new CLASS_DAO();
		ls = dd.search();
		
		HttpSession session = request.getSession();
		session.setAttribute("dataList", ls);
		response.sendRedirect("user/search_info.jsp");
		
		
	}
	
	private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String s = request.getParameter("dataId");
		int id=Integer.parseInt(s);
		CLASS_VO dv = new CLASS_VO();
		dv.setData_Id(id);
		
		CLASS_DAO dd = new CLASS_DAO();
		List ls=dd.edit(dv);
		
		HttpSession hs=request.getSession();
		hs.setAttribute("editData", ls);
		
		response.sendRedirect("user/edit_info.jsp");
		
	}
	
	private void update(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int id=Integer.parseInt(request.getParameter("id"));
		String nam = request.getParameter("person_name");
		int num = Integer.parseInt(request.getParameter("mob_num"));
		String ad = request.getParameter("home_add");
		String em = request.getParameter("e-id");
		String pro_name = request.getParameter("p_name");
		int quant_ity = Integer.parseInt(request.getParameter("quant"));
		String pmt = request.getParameter("p_modes");
	
		CLASS_VO dv = new CLASS_VO();
		dv.setData_Id(id);
		
		dv.setUr_name(nam);
		dv.setPh_no(num);
		dv.setH_ad(ad);
		dv.setElec_id(em);
		dv.setItem(pro_name);
		dv.setQuos(quant_ity);
		dv.setMoney(pmt);
		
		CLASS_DAO dd = new CLASS_DAO();
		dd.update(dv);
	}
	
	private void delete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String s = request.getParameter("dataId");
		int id=Integer.parseInt(s);
		CLASS_VO dv=new CLASS_VO();
		dv.setData_Id(id);
		
		CLASS_DAO dd = new CLASS_DAO();
		dd.delete(dv);
	}
		

}
