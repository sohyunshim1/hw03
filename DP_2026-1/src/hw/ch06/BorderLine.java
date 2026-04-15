//  BorderLine 클래스를 새로 추가 구현
//텍스트의 길이에 따라 라인의 길이가 자동으로 조정된다.

package hw.ch06;

import hw.ch06.framework.Product;

public class BorderLine implements Product {

    private char borderChar;

    // 1. 생성자: 경계 문자를 인자로 받음
    public BorderLine(char borderChar) {
        this.borderChar = borderChar;
    }

// 2. use() 메소드 구현
    @Override
    public void use(String s) {

        int len = s.length();

        // // 위쪽 라인 출력 (s.length() 만큼)
        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }
        System.out.println();

        //본문 출력 (텍스트 그대로)
        System.out.println(s);

        // 아래쪽 라인 출력 (s.length() 만큼)
        for (int i = 0; i < len; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
    }


// 3. createCopy() 메소드 구현 (clone() 활용)
@Override
 public Product createCopy() {
        Product p = null;

        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}