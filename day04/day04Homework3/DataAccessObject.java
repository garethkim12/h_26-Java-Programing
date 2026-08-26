package day04Homework3;

public interface DataAccessObject {
	void select(); //검색기능 추상 메서드
	void insert(); //삽입기능 추상 메서드
	void update(); //수정기능 추상 메서드
	void delete(); //삭제기능 추상 메서드
}
