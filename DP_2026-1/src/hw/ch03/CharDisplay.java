//단일 문자 반복 표시 '<' 문자 5 회 반복 표시하는 자식 클래스

public class CharDisplay extends AbstractDisplay {

    private char ch;

    // 기본 5회
    public CharDisplay(char ch) {
        super();
        this.ch = ch;
    }

    // 자식 클래스를 확장하여 반복 횟수를 받을 수 있도록 함
    //print()에서 문자를 반복 출력한다.
    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount);
        this.ch = ch;
    }

    public void open() {
        System.out.print("<");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println(">");
    }
}