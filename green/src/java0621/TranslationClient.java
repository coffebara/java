package java0621;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TranslationClient extends JFrame implements ActionListener {
	private BufferedReader in;
	private PrintWriter out;
	private JTextField field;
	private JTextArea area;

	public TranslationClient() throws Exception, IOException {
		setTitle("클라이언트");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		field = new JTextField(50); // field객체에 50의 크기를 지정함
		field.addActionListener(this); // field객체에 ActionListener를 추가함

		area = new JTextArea(10, 50); // area객체에 10행 50열의 범위를설정함
		area.setEditable(false); // JTextArea의 편집을 불가능하게 설정함
		add(field, BorderLayout.NORTH);
// 글을 쓰는 JTextField객체의 레이아웃을 BorderLayout으로 선언하고 북쪽에 위치하게 함
		add(area, BorderLayout.CENTER);
// 텍스트가 보여지는 JTextArea객체의 레이아웃을 BorderLayout으로 선언하고 중앙에 위치
// 127.0.0.1 (로컬 호스트를 뜻함)
		Socket socket = new Socket("localhost", 9101);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		area.append(in.readLine() + "\n");
		// JTextArea객체에 읽어들인 문자열을 끝에 추가함
		area.append(in.readLine() + "\n");
		// append() : 읽어들인 문자열을 JTextArea 끝에 추가한다
	}
	@Override
	public void actionPerformed(ActionEvent arg0) { // 액션이 발생하면 실행됨
		out.println(field.getText());
		// PrintWriter 객체에 JTextfield객체에서 가져온 Text를  추가함
		String response = null;
		try {
			response = in.readLine();
			// response변수에 BufferReader로 읽어온 문자열 라인의 값을 추가함
		} catch (IOException e) {
			e.printStackTrace();
		}
		area.append(response + "\n");
		// JTextArea객체의 맨 끝에 response변수에 저장된문자열 라인을 추가함
	}
	public static void main(String[] args) throws Exception {
		TranslationClient client = new TranslationClient();
	}
}
