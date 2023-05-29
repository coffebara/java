package ch03;

import java.util.Scanner;

public class homework {

    // calculateFee 함수는 주차 시간 ptime을 받아서 주차 요금을 반환합니다.
    static double calculateFee(double ptime) {
        double fee = 0.0;
        if (ptime > 0.0) { // 주차 시간이 0보다 클 경우에만 계산
            if (ptime <= 1.0) // 1시간 이하일 경우에는 1000원
                fee = 1000;
            else {
               // Math.cheil(값) 올림 함수
                fee = 1000 + Math.ceil(ptime - 1.0) * 500; // 그 이후 시간에 대해서는 시간당 500원 추가
                if (fee > 10000) // 최대 요금은 10000원으로 설정
                    fee = 10000;
            }
        }
        return fee;
    }

    public static void main(String[] args) {
        double entrytime;
        String flag;
        Scanner scanner = new Scanner(System.in);
        // 아래 주석 처리된 do-while 구문을 해제하면 사용자가 여러 주차 시간에 대해 요금을 계산해볼 수 있습니다.
        do {
            System.out.println("주차 시간을 입력하세요: ");
            entrytime = scanner.nextDouble();
            System.out.println("주차 요금: " + calculateFee(entrytime) + "원");
            System.out.println("계속하려면 y, 종료하려면 다른 문자를 입력하세요: ");
            flag = scanner.next();
        } while (flag.equalsIgnoreCase("y"));
    }
}