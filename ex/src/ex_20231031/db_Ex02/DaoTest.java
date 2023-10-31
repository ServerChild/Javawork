package ex_20231031.db_Ex02;

public class DaoTest {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		
		System.out.println();
		
		dbWork(new MySqlDao());
	}
}
