//NumberDisplay 클래스는 숫자를 반복 출력
// Template Method 구조를 유지하면서 새로운 기능을 추가함
public class NumberDisplay extends AbstractDisplay {

    private int number;

    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount);
        this.number = number;
    }

    //구현 세부사항:
    //open(): "<<Number>>"를 한 줄에 출력
    public void open() { 
        System.out.println("<<Number>>"); 
    }

    //print(): 숫자를 한 줄에 출력
    public void print() {
        System.out.println(number);
    }

    //• close(): "<<Number>>"를 한 줄에 출력
    public void close() {
        System.out.println("<<Number>>");
    }
}
