package java0526;

import java.util.Scanner;
// Q. 주차장에 들어온 시간과 나간 시간을 입력받아 30분 당 요금을 부과하고,
// (y/n)을 입력해 재입력 여부를 확인하다. 



public class CalParkingFee {
	public static int calulateFee(String entryTime, String exitTime) {
		int fee=0;
		int feePerAHalfTime = 1000;

		String[] strEntryTime, strExitTime = new String[2];
		
		strEntryTime = entryTime.split(":");
		double entryM = Double.parseDouble(strEntryTime[0])*60 + Double.parseDouble(strEntryTime[1]);
		strExitTime = exitTime.split(":");
		double exitM = Double.parseDouble(strExitTime[0])*60 + Double.parseDouble(strExitTime[1]);
		
		fee = ((int)Math.ceil((exitM-entryM)/30))*feePerAHalfTime;
		
		return fee;
	}

    public static void main(String[] args) {
        String entryTime;
        String exitTime;
        int fee =0;
        String flag = "";
        Scanner sc = new Scanner(System.in);

        do {
        	System.out.println("들어온 시간을 입력하세요. ex) 04:20 ");
        	entryTime = sc.nextLine();
        	System.out.println("나간 시간을 입력하세요. ex) 13:05");
        	exitTime = sc.nextLine();
        	fee = calulateFee(entryTime, exitTime);
        	System.out.printf("주차 요금은 %d 입니다\n",fee);
        	System.out.println("다시 입력하시겠습니까? (y/n)");
        	flag = sc.next();
        	sc.nextLine();
        }
        while(flag.equalsIgnoreCase("y"));
        
        sc.close();

    }
}
