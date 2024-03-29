package es.tictactoe;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import es.tictactoe.TicTacToeGame.Cell;

public class Board {
	
	private List<Cell> cells = new ArrayList<>();

	public Board() {
		for (int i = 0; i < 9; i++) {
			this.cells.add(new Cell());
		}
	}

	public void disableAll() {
		for (Cell cell : cells) {
			cell.active = false;
		}		
	}

	public void enableAll() {
		for (Cell cell : cells) {
			cell.active = true;
		}		
	}

	public Cell getCell(int cellId) {
		return cells.get(cellId);
	}

	public int[] getCellsIfWinner(String string) {
		
		int[][] winPositions = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
				{ 0, 4, 8 }, { 6, 4, 2 } };
		
		for (int[] winPos : winPositions) {

			String cellValue = this.cells.get(winPos[0]).value;
			
			if (cellValue != null && cellValue.equals(string)) {

				boolean line = cellValue.equals(this.cells.get(winPos[1]).value)
						&& cellValue.equals(this.cells.get(winPos[2]).value);

				if (line) {
					return winPos;
				}
			}
		}

		return null;
	}

	public boolean checkFull() {
		
		for (Cell cell : cells) {
			if (cell.value == null) {
				return false;
			}
		}
		return true;
	}

}
