package day07;

import javax.swing.JOptionPane;

public class Test03_Command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "**** App Start ****" );
		Command cmd = null;
		
		String msg = JOptionPane.showInputDialog( "1.Delete , 2.Insert, 3.List, 4.Update" );
		
		switch ( msg ) {
		case "1":
			cmd = new DeleteCommand();
			break;
		case "2":
			cmd = new InsertCommand();
			break;
		case "3":
			cmd = new ListCommand();
			break;
		case "4":
			cmd = new UpdateCommand();
			break;

		default:
			System.out.println( "1, 2, 3, 4 중 하나를 입력하세요." );
			break;
		}
		
		if( cmd !=null ) {
			cmd.exec();
			cmd.base();
		}
	}

}


class DeleteCommand extends Object implements Command {
	
	@Override
	public void exec() {
		System.out.println( "DeleteCommand 수행 => 삭제 작업" );
	}
	@Override
	public void base() {
		Command.super.base();
		System.out.println( "기능 추가 수행" );
	}
}

class InsertCommand extends Object implements Command {
	
	@Override
	public void exec() {
		System.out.println( "InsertCommand 수행 => 삭제 작업" );
	}
}

class UpdateCommand extends Object implements Command {
	
	@Override
	public void exec() {
		System.out.println( "UpdateCommand 수행 => 삭제 작업" );
	}
}

class ListCommand extends Object implements Command {
	
	@Override
	public void exec() {
		System.out.println( "ListCommand 수행 => 삭제 작업" );
	}
}