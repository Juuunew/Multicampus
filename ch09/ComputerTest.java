package ch09;

public class ComputerTest {

    public static void main(String[] args) {

        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
    }
}
