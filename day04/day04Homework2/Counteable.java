package day04Homework2;

//1. Countable 인터페이스 선언
interface Countable {
 void count(); // 추상 메서드 (인터페이스의 메서드는 기본적으로 public abstract)
}





//2. 공통 부모 클래스 또는 이름을 가질 수 있는 상위 클래스 (선택 사항이나, name과 num 관리를 위해 작성)
class CountableBase {
 protected String name;
 protected int num;

 public CountableBase(String name, int num) {
     this.name = name;
     this.num = num;
 }
}





//3. Bird 클래스 (CountableBase를 상속하고 Countable 인터페이스를 구현)
class Bird extends CountableBase implements Countable {
 
 // 생성자에서 name과 num 초기화 (부모 생성자 호출)
 public Bird(String name, int num) {
     super(name, num);
 }

 // 인터페이스의 count() 메서드 구현 (개수를 출력하는 역할)
 @Override
 public void count() {
     System.out.println(name + "가 " + num + "마리 있다.");
 }

 // Bird 클래스만의 고유 메서드
 public void fly() {
     System.out.println(num + "마리 " + name + "가 날아간다.");
 }
}




//4. Tree 클래스 (CountableBase를 상속하고 Countable 인터페이스를 구현)
class Tree extends CountableBase implements Countable {
 
 // 생성자에서 name과 num 초기화
 public Tree(String name, int num) {
     super(name, num);
 }

 // 인터페이스의 count() 메서드 구현
 @Override
 public void count() {
     System.out.println(name + "가 " + num + "그루 있다.");
 }

 // Tree 클래스만의 고유 메서드
 public void ripen() {
     System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
 }
}




//5. Counteable 실행 클래스
public class Counteable {
 public static void main(String[] args) {
     // Countable 배열로 Bird, Tree 객체 생성 (다형성 활용)
     Countable[] list = {
         new Bird("뻐꾸기", 5),
         new Bird("독수리", 2),
         new Tree("사과나무", 10),
         new Tree("밤나무", 7)
     };

     // 1단계: Counteable의 메서드 실행 (count())
     System.out.println(">>> count() 호출 결과");
     for (int i = 0; i < list.length; i++) {
         list[i].count(); // 각 객체에 맞는 오버라이딩된 count() 실행
     }

     System.out.println("\n>>> fly() 또는 ripen() 호출 결과");
     // 2단계: 배열 객체의 타입을 확인(instanceof)하여 타입에 맞는 고유 메서드 실행
     for (int i = 0; i < list.length; i++) {
         if (list[i] instanceof Bird) {
             // Bird 타입으로 다운캐스팅 후 fly() 호출
             ((Bird) list[i]).fly();
         } else if (list[i] instanceof Tree) {
             // Tree 타입으로 다운캐스팅 후 ripen() 호출
             ((Tree) list[i]).ripen();
         }
     }
 }
}