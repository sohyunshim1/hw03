// Template Method 패턴 구현, open(), print(), close() 추상 메서드 정의


public abstract class AbstractDisplay { //추상 클래스 정의

    protected int repeatCount;

    // 기본 생성자 (5회)   
    // 기존 코드 호환성 유지: 반복 횟수를 명시하지 않으면 기본값 5 사용
    public AbstractDisplay() {
        this.repeatCount = 5;
    }

    //Step 1: 반복 횟수 제어 기능 추가
    // 생성자에서 반복 횟수를 인자로 받도록 확장
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    // Template Method 틀 , 메서드 display() 구현
    //  final로 선언하여 자식이 오버라이드하지 못하도록 함
    //과제대로 `display()` 메서드에서 필드값을 사용하도록 변경함

    
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    } 

    // 추상 메서드 (자식이 구현)
    public abstract void open();
    public abstract void print();
    public abstract void close();
}