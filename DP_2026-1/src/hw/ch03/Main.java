//동작 확인용 메인 클래스 

public class Main {
    public static void main(String[] args) {

        System.out.println("20230831 심소현\n");

        // 3-1 기본 테스트 / 기존 코드 호환성 확인:
        AbstractDisplay d1 = new CharDisplay('H'); // 출력 기본 5회
        AbstractDisplay d2 = new StringDisplay("Hello"); //박스 기본 5회
        d1.display();
        d2.display();

        // 반복 횟수 테스트 Main 에서 다양한 반복 횟수로 테스트
        //**[3-2] Step 1 테스트: 반복 횟수를 받아서 횟수대로 출력
        AbstractDisplay d3 = new CharDisplay('X', 3); // 3회
        AbstractDisplay d4 = new StringDisplay("Test", 7); // 7회

        d3.display();
        d4.display();

        //**[3-3] Step 2 테스트: 새로운 Display 인 NumberDisplay 
        AbstractDisplay d = new NumberDisplay(42, 4); // 42를 4회 반복하여 출력
        d.display();
    } // <<Number>>을 위아래로 출력하고 42를 4회 반복하여 출력
}