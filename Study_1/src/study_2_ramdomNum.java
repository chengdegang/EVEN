import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class study_2_ramdomNum {

	static String phonenum() {
		String[] snum = { "13", "15", "16", "17", "18" };
		int seq = snum.length;

		int xia = (int) (Math.random() * seq);
		long num = (long) (Math.random() * 1000000000l);
		String num2 = Long.toString(num);

		while (num2.length() < 9) {
			num2 = "0" + num2;
		}
		return snum[xia] + num2;
	}

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int loop = a.nextInt();
		sql(loop);
		a.close();
	}

	public static void sql(int loop) {
		try {
			// 加载数据驱动，密码等
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("加载数据库驱动成功");
			String url = "jdbc:mysql://10.100.1.170:3306";
			String user = "test";
			String password = "passwd";
			// 建立数据库连接
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("连接数据库成功");
			// 生成sql语句及关闭连接
			for (int i = 0; i < loop; i++) {
				int risk = (int) (Math.random() * 10);
				String sql = "INSERT INTO ds_cloud.hunter_blacklist_mobile (mobile,risk,last_update_time) VALUES('"
						+ phonenum() + "','" + risk + "',NOW())";
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("sql执行成功");
			}

			conn.close();
			System.out.println("关闭数据库成功");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
