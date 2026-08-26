package day04Homework3;

//DataAccessObject 인터페이스를 구현하여 Oracle DB 작업을 처리하는 클래스
public class OracleDao implements DataAccessObject {

 @Override
 public void select() {
     System.out.println("Oracle DB에서 검색");
 }

 @Override
 public void insert() {
     System.out.println("Oracle DB에 삽입");
 }

 @Override
 public void update() {
     System.out.println("Oracle DB를 수정");
 }

 @Override
 public void delete() {
     System.out.println("Oracle DB에서 삭제");
 }
}