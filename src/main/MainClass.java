package main;

import source.*;

public class MainClass {

	public static void main(String[] args) {
		Text txt = new Text(
		    new Word("Тестируем"), new Sign(' '),
		    new Word("мою"), new Sign(' '),
		    new Word("архитектуру"), new Sign('!'));
		txt.print(new PrinterDefault());
	}

}
