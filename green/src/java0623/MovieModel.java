package java0623;

//import java.util.List;
import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

//MVC 패턴 - 모델
//
//애플리케이션의 정보, 데이터를 나타낸다.
//데이터베이스, 처음 정의하는 상수, 초기화값, 변수 등을뜻한다.
//이러한 DATA 정보들의 가공을 책임지는 컴포넌트들을 말한다.
//1. 사용자가 편집하길 원하는 모든 데이터를가지고 있어야 한다.
//- 화면아넹 네모박스에 글자가 표현된다면, 네모박스의 화면위치 정보, 크기 정보,
//  글자 내용, 위치, 포맷 정보등을 가지고 잇어야한다.
//2. 뷰나 컨트롤러에 대하여 어떤 정보도 알지 말아야한다.
//- 데이터 변경이 일어났을 때 모델에서 화면 UI를 직접 조정해서 수정할 수 있도록
// 뷰를 참조하는 내부 속성을 가지면 안된다.
//3. 변경이 일어나면, 변경 통지에 대한 처리방법을 구현해야  한다.
// - 모델의 속성 중 텍스트 정보가 변경이 된다면, 이벤트를 발생시켜 누군가에게 전달해야 하며,
// 누군가 모델을 변경하도록 요청하는 이벤트를 보냈을 때 이를 수신하는 처리 방법을 구해야 한다

//모델 : 애플리케이션의 정보, 데이터를 나타내며
//실제 기능을 처리한 후 결과를 컨트롤러에 반환한다.

public class MovieModel {
	private BufferedWriter bw; //추가
//리스트에 영화제목을 추가하는 메서드
	public void addTitle(String title, List movieList) {
		movieList.add(title);
	}

// 리스트에 있는 영화 제목을 삭제하는 메서드
	public void delTitle(String title, List movieList) {
		movieList.remove(title);
	}

// 리스트에 있는 영화제목들을 파일에 저장하는 메서드
	public void saveTitles(List movieList) throws Exception {
		File file = new File("movieTitle2.txt");
//		FileWriter fw = new FileWriter(file, true);
		FileOutputStream fos = new FileOutputStream(file, true); //추가
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); //추가
		bw = new BufferedWriter(osw);  //추가
//		PrintWriter pw = new PrintWriter(fw);
		String items[] = movieList.getItems();
		for(String item : items) {  //추가
			bw.write(item);
			bw.newLine();
		}
		bw.flush();  //추가
//		for (int i = 0; i < items.length; i++) {
//			pw.println(items[i]);
//			System.out.println(items[i]);
//		}
//		fw.close();
//		pw.close();
	}
	public void close() {  //추가
		try {
			if(bw != null) {
				bw.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}