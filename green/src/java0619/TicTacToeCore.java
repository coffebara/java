package java0619;

public class TicTacToeCore {
	private int currentPlayerNum; // 현재 플레이어를 표기하는 int형 변수
	private boolean isGameOver = false;
	private int[][] endStage;
	private int currentTurn = 1; // 현재 턴에 해당하는 변수

	public TicTacToeCore(int currentPlayerNum) {
		this.currentPlayerNum = currentPlayerNum;
	}

	// 생성자, 해당 코드에서는 START_PLAYER의 값을 매개변수로 받았음.
	public void changeTurn() {
		currentPlayerNum = (currentPlayerNum == 1) ? 2 : 1;
	}

	public int getCurrentPlayerNum() {
		return currentPlayerNum;
	}

	public void setCurrentPlayerNum(int currentPlayerNum) {
		this.currentPlayerNum = currentPlayerNum;
	}

	public int[][] getEndStage() {
		return endStage;
	}

	/*
	 * @param currentStage // return 값에 따라 실행루틴을 주석처리해서 알려줌
	 * 
	 * @return -99: 게임종료됨, 1: 플레이어 1 승리, 2: 플레이어 2 승리, 0 : 진행중, 99 : 비김(draw)
	 */
	private boolean isThisPlayerWin(int playerNum, String rowFrag, String colFrag, String diagFrag1, String diagFrag2) {
		String p = String.valueOf(playerNum);
		boolean result = false;
		String[] arr = { rowFrag, colFrag, diagFrag1, diagFrag2 };

		for (int i = 0; i < arr.length; i++) {
			result = !arr[i].contains("0") && arr[i].equals(p + p + p);
			if (result)
				return result;
		}
		return result;
	}

	public int inputCurrentStage(int[][] currentStage) {
		// 해당 코드에선 원소가 0,1,2로 이루어진 ticArr을 인자로 받음
		if (isGameOver) {
			return -99;
		}
		for (int i = 0; i < currentStage.length; i++) {
			String rowStr = "";
			String colStr = "";
			String diagStr1 = "";
			String diagStr2 = "";
			// 각종 String 변수 초기화
			for (int j = 0; j < currentStage[i].length; j++) {
				rowStr += (currentStage[i][j] + ""); // 열
				colStr += (currentStage[j][i] + ""); // 행
			}
			for (int j = 0; j < currentStage.length; j++) {
				diagStr1 += currentStage[j][j];
				diagStr2 += currentStage[j][2 - j];

			}
			if (isThisPlayerWin(2, rowStr, colStr, diagStr1, diagStr2)) {
				isGameOver = true;
				endStage = currentStage;
				return 2;
			} else if (isThisPlayerWin(1, rowStr, colStr, diagStr1, diagStr2)) {
				isGameOver = true;
				endStage = currentStage;
				return 1;
			}
		}
		if (currentTurn == 9) {
			return 99;
		}
		currentTurn++;
		return 0;
	}

	public void resetGame(int currentPlayerNum) {
		this.isGameOver = false;
		this.currentPlayerNum = currentPlayerNum;
		this.endStage = null;
		this.currentTurn = 1;
	}
}
