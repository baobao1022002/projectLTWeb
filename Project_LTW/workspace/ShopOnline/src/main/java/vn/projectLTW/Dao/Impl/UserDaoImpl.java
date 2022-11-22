package vn.projectLTW.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import vn.projectLTW.Dao.DBConnection;
import vn.projectLTW.Dao.IUserDao;
import vn.projectLTW.model.UserRoles;
import vn.projectLTW.model.Users;

public class UserDaoImpl implements IUserDao{
	public Connection conn=null;
	public PreparedStatement ps=null;
	public ResultSet rs=null;
	
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		List<Users> userList = new ArrayList<Users>();
		String sql = "Select * From Users";

		try {
			conn = new DBConnection().getConnection(); // Kết nối CSDL
			ps = conn.prepareStatement(sql); // Ném câu lệnh SQL bằng phát biểu prepareStatement
			rs = ps.executeQuery(); // Thực thi câu query và trả về ResultSet

			while (rs.next()) { // Duyệt từng dòng trong ResultSet và trả về ds đối tượng
				Users users = new Users();
				users.setRoleId(rs.getInt("roleId"));
				users.setUserName(rs.getString("userName"));
				userList.add(users);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return userList;
	}

	@Override
	public Users findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean register(String email, String passWord, String userName, String fullName, String phone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Users login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkExistEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistUserName(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

}
