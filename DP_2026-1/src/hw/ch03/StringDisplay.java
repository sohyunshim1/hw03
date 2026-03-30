//문자열을 박스로 감싸서 표시 위/아래 경계선 포함


public class StringDisplay extends AbstractDisplay {

    private String str;

    public StringDisplay(String str) {
        super();
        this.str = str;
    }

    public StringDisplay(String str, int repeatCount) {
        super(repeatCount);
        this.str = str;
    }

//open()과 close()에서는 문자열 길이에 맞는 경계선을 출력
    public void open() {
        printLine(); 
    }

    public void print() {
        System.out.println("|" + str + "|");
    }

    public void close() {
        printLine();
    }

    private void printLine() {
        for (int i = 0; i < str.length() + 2; i++) {
            System.out.print("-");
        }
        System.out.println(); // 줄바꿈 1번만
    }
}