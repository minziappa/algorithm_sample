package io.algorithm.main.search;

import java.util.Scanner;

public class BinaryTreeMain {

	static Scanner stdIn = new Scanner(System.in);

	static class Data {
		public static final int NO = 1;
		public static final int NAME = 2;
		
		private Integer no;
		private String name;
		
		Integer keyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide + "fill it the form.");
			
			if ((sw & NO) == NO) {
				System.out.println("Number:");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.println("Name:");
				name = stdIn.next();
			}
		}

	}

	enum Menu {
		ADD("Insert a node"),
		REMOVE("Delete a node"),
		SEARCH("Search a node"),
		PRINT("Printl all node"),
		TERMINATE("Finish");

		private final String message;			// �\���p������

		static Menu MenuAt(int idx) {			// ������idx�ł���񋓂�Ԃ�
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) {				// �R���X�g���N�^
			message = string;
		}

		String getMessage() {				// �\���p�������Ԃ�
			return message;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
