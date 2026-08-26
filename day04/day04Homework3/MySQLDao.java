package day04Homework3;

//DataAccessObject 인터페이스를 구현하여 MySql DB 작업을 처리하는 클래스
public class MySQLDao implements DataAccessObject {

 @Override
 public void select() {
     System.out.println("MySql DB에서 검색");
 }

 @Override
 public void insert() {
     System.out.println("MySql DB에 삽입");
 }

 @Override
 public void update() {
     System.out.println("MySql DB를 수정");
 }

 @Override
 public void delete() {
     System.out.println("MySql DB에서 삭제");
 }
}