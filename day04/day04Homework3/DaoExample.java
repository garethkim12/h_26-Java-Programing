package day04Homework3;

public class DaoExample {
    
    // 다형성을 활용하여 DataAccessObject 타입의 매개변수를 받는 메서드
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        // OracleDao 객체를 전달하여 Oracle 작업 수행
        dbWork(new OracleDao());
        
        // MySqlDao 객체를 전달하여 MySql 작업 수행
        dbWork(new MySQLDao());
    }
}