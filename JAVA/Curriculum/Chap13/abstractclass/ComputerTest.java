package kr.co.ezenac.abstractclass;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.display();
		computer.typing();
		computer.turnOn();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
		myNote.typing();
		myNote.turnOff();
		
	}
}
