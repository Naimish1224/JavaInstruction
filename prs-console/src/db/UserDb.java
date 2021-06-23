package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.User;
import interfrace.DAO;

public class UserDb implements DAO<User> {
	protected Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prsdb";
		String username = "prs_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}




	private User getUserFromRow(ResultSet rs) throws SQLException {
		User user;
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String username = rs.getString(4);
		String password = rs.getString(5);
		String phone = rs.getString(6);
		String email = rs.getString(7) ;
		Integer review = rs.getInt(8) ;
		Integer admin = rs.getInt(9) ;
		user = new User(firstName, lastName, username, password, phone, email, review, admin);
		return user;
	}

	@Override
	public User get(int id) {
		User user = null;
		String sql = "SELECT * FROM user WHERE id = ?";

		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				user = getUserFromRow(rs);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> getAll() {

		List<User> users = new ArrayList<>();

		try (Statement stmt = getConnection().createStatement()) { // Try with resources statement
			ResultSet rs = stmt.executeQuery("SELECT * FROM user ORDER BY id");

			while (rs.next()) { // While there is a next line to get. For each row parse an item.
				User user = getUserFromRow(rs);
				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

	public boolean add(User user) {
		boolean success = false;
		String sql = "INSERT INTO user (firstName, lastName, username, password, "
				+ "phone, email, review, admin) values (?,?,?,?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, user.getFirstName());
			stmt.setString(2, user.getLastName());
			stmt.setString(3, user.getUsername());
			stmt.setString(4, user.getPassword());
			stmt.setString(5, user.getPhone());
			stmt.setString(6, user.getEmail());
			stmt.setInt(7, user.getReview());
			stmt.setInt(8, user.getAdmin());
			

			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	public boolean update(User user) {
		boolean success = false;
		String sql = "UPDATE user SET firstName = ?, lastName = ?, username = ?, password = ?, phone = ?, email = ?, review = ?, admin = ?, WHERE id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, user.getFirstName());
			stmt.setString(2, user.getLastName());
			stmt.setString(3, user.getUsername());
			stmt.setString(4, user.getPassword());
			stmt.setString(5, user.getPhone());
			stmt.setString(6, user.getEmail());
			stmt.setInt(7, user.getReview());
			stmt.setInt(8, user.getAdmin());
			stmt.setInt(9, user.getId());

			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	public boolean delete(User user) {
		boolean success = false;
		String sql = "DELETE FROM user WHERE id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, user.getId());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

}