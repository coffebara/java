package programmers;

import java.util.*;

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		String[] reportArr = Arrays.stream(report).distinct().toArray(String[]::new); // 중복된 신고 제거
		String[] iReportIndex = new String[id_list.length]; // 신고자가 신고한 이용자의 인덱스를 기억하는 배열
		int[] beReportedCount = new int[id_list.length]; // 신고자가 신고당한 횟수를 기억하는 배열
		int[] answer = new int[id_list.length];

		for (int i = 0; i < iReportIndex.length; i++) {
			iReportIndex[i] = ""; // string 빈배열 null값 방지하기 위해 초기화
		}

		for (String repot : reportArr) {
			String iReport = repot.split(" ")[0]; // 신고자
			String beReported = repot.split(" ")[1]; // 신고할 ID
			if(iReport.equals(beReported))
				continue;

			for (int i = 0; i < id_list.length; i++) { // 반복문을 통해 신고 당한자에 해당하는 인덱스를 찾아 +1
				if (id_list[i].equals(beReported)) {
					beReportedCount[i] += 1;

					for (int j = 0; j < id_list.length; j++) {
						if (id_list[j].equals(iReport)) { // 신고자가 신고한 id에 해당하는 인덱스를
							iReportIndex[j] += Integer.toString(i); // 신고자에 해당하는 인덱스에 저장
						}
					}
				}
			}
		}

		int cnt = 0;
		for (String a : iReportIndex) {
//System.out.println("a: " +a);
			String[] iReportidx = a.split(""); // 신고자에 해당하는 인덱스에 있는 신고한 id에 해당하는 인덱스 추출
//            System.out.println(Arrays.toString(iReportidx));
			for (int i = 0; i < iReportidx.length; i++) {
				if (iReportidx[i] != "" && beReportedCount[Integer.parseInt(iReportidx[i])] - k >= 0) { // 신고횟수가 k이상일 때
																										// 신고자 인덱스에 정지
																										// 인원수 저장
					answer[cnt] += 1;
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}

public class day10_9 {
	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] id_list2 = { "con", "ryan" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi", "muzi muzi" ,"apeach apeach", "apeach apeach"};
		String[] report2 = { "ryan con", "ryan con", "ryan con", "ryan con" };

		Solution s = new Solution();
		s.solution(id_list, report, 2);
//		s.solution(id_list2, report2, 1);
	}

}
