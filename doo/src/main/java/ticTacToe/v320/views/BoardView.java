package ticTacToe.v320.views;

import ticTacToe.v320.controllers.OperationController;
import ticTacToe.v320.models.Coordinate;
import ticTacToe.v320.utils.IO;

class BoardView {

	private OperationController controller;

	BoardView(OperationController controller) {
		assert controller != null;
		this.controller = controller;
	}

	void write() {
		IO io = new IO();
		for (int i = 0; i < Coordinate.DIMENSION; i++) {
			for (int j = 0; j < Coordinate.DIMENSION; j++) {
				new ColorView(controller.getColor(new Coordinate(i, j)))
						.write(" ");
			}
			io.writeln();
		}
	}
}
