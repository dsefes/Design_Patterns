package main;

import source.*;

public class MainClass {

	public static void main(String[] args) {
		Text txt = new Text(
		    new Word("���������"), new Sign(' '),
		    new Word("���"), new Sign(' '),
		    new Word("�����������"), new Sign('!'));
		txt.print(new PrinterDefault());
	}

}
