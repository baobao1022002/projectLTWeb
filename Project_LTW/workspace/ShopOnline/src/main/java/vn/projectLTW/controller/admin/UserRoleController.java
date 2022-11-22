package vn.projectLTW.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.projectLTW.model.UserRoles;
import vn.projectLTW.service.IUserRoleService;
import vn.projectLTW.service.Impl.UserRoleServiceImpl;


@WebServlet("/UserRole")
public class UserRoleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//truy xuất vào Interface  userRoleService để lấy  các hàm implement  Service userRole
    IUserRoleService userRoleService= new UserRoleServiceImpl();
    
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<UserRoles> roleList = userRoleService.findAll();//lấy toàn bộ dữ liệu  bản UserRole đưa vào List
		request.setAttribute("roleList", roleList);// đẩy dữ liệu  từ List lên View JSP
		
		//View sẽ nhận dữ liệu là View nào 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/admin/userRole-List.jsp");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
