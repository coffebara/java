package utils;

public class BoardPage {
    public static String pagingStr(int totalCount, int pageSize, int blockPage,
            int pageNum, String reqUrl) {
        String pagingStr = "";

        // 단계 3 : 전체 페이지 수 계산
        int totalPages = (int) (Math.ceil(((double) totalCount / pageSize)));

        // 단계 4 : '이전 페이지 블록 바로가기' 출력
        int pageTemp = (((pageNum - 1) / blockPage) * blockPage) + 1;
        if (pageTemp != 1) {
            pagingStr += "<a href='" + reqUrl + "?pageNum=1'>[첫 페이지]</a>";
            pagingStr += "&nbsp;";
            pagingStr += "<a href='" + reqUrl + "?pageNum=" + (pageTemp - 1)
                         + "'>[이전 블록]</a>";
        }

        // 단계 5 : 각 페이지 번호 출력
        int blockCount = 1;
        while (blockCount <= blockPage && pageTemp <= totalPages) {
            if (pageTemp == pageNum) {
                // 현재 페이지는 링크를 걸지 않음
                pagingStr += "&nbsp;" + pageTemp + "&nbsp;";
            } else {
                pagingStr += "&nbsp;<a href='" + reqUrl + "?pageNum=" + pageTemp
                             + "'>" + pageTemp + "</a>&nbsp;";
            }
            pageTemp++;
            blockCount++;
        }

        // 단계 6 : '다음 페이지 블록 바로가기' 출력
        if (pageTemp <= totalPages) {
            pagingStr += "<a href='" + reqUrl + "?pageNum=" + pageTemp
                         + "'>[다음 블록]</a>";
            pagingStr += "&nbsp;";
            pagingStr += "<a href='" + reqUrl + "?pageNum=" + totalPages
                         + "'>[마지막 페이지]</a>";
        }

        return pagingStr;
    }
}// int totalCount : 전체 항목 수. 이는 총 페이지 수를 계산하기 위해
// int pageSize : 한 페이지에 표시할 항목의 수. 이를 사용하여 전페 페이지 수를 계산
//int blockPage : 한 페이지 블록에 표시될 페이지 수. 페이지 번호가 1, 2, 3, ... , 10
//int pageNum : 현재 페이지 번호
//String reqUrl : 페이지 링크를 생성할 때 사용되는 기본 URL.
//String pagingstr : 최종적으로 생성될 페이지 네비게이션 문자열입니다.
//이 문자열은 페이지 링크를 구성
//int totalPages : 총 페이지 수. 이는 전체 항목 수를 페이지 크기로 나눈 후 올림하여 계산
//int pageTmp : 현재 페이지 블록의 시작 페이지 번호입니다.
//페이지 블록은 페이지 네비게이션에서 한번에 표시되는 연속된 페이지 그룹을 의미합니다
//int blockCount : 현재 페이지 블록 내의 페이지 카운터.
//이는 페이지 브ㅡㄹ록 내에서 몇 번째 페이지인지를 나타냅니다.