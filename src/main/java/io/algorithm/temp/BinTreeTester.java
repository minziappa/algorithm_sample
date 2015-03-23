package io.algorithm.temp;

import java.util.Scanner;

class BinTreeTester {
	static Scanner stdIn = new Scanner(System.in);

	//--- �f�[�^�i����ԍ��{�����j ---//
	static class Data {
		public static final int NO   = 1;	// �ԍ���ǂݍ��ނ��H
		public static final int NAME = 2;	// ������ǂݍ��ނ��H

		private Integer no;						// ����ԍ��i�L�[�l�j
		private String  name;					// ����

		//--- �L�[�l ---//
		Integer keyCode() {
			return no;
		}

		//--- ������\����Ԃ� ---//
		public String toString() {
			return name;
		}

		//--- �f�[�^�̓Ǎ��� ---//
		void scanData(String guide, int sw) {
			System.out.println(guide + "����f�[�^���͂��Ă��������B");

			if ((sw & NO) == NO) {
				System.out.print("�ԍ��F");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("���O�F");
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

	//--- ���j���[�I�� ---//
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 &&
					  m.ordinal() != Menu.TERMINATE.ordinal())
					System.out.println();
			}
			System.out.print("�F");
			key = stdIn.nextInt();
		} while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;					// ���j���[
		Data data;					// �ǉ��p�f�[�^�Q��
		Data ptr;					// �T���p�f�[�^�Q��
		Data temp = new Data();		// �Ǎ��ݗp�f�[�^
		BinTree<Integer, Data> tree = new BinTree<Integer, Data>();

		do {
			switch (menu = SelectMenu()) {
			 case ADD :				// �m�[�h�̑}��
					data = new Data();
			 		data.scanData("�}��", Data.NO | Data.NAME);
			 		tree.add(data.keyCode(), data);
			 		break;

			 case REMOVE :			// �m�[�h�̍폜
					temp.scanData("�폜", Data.NO);
			 		tree.remove(temp.keyCode());
			 		break;

			 case SEARCH :			// �m�[�h�̒T��
					temp.scanData("�T��", Data.NO);
			 		ptr = tree.search(temp.keyCode());
			 		if (ptr != null)
						System.out.println("���̔ԍ��̎�����" + ptr + "�ł��B");
					else
			 			System.out.println("�Y���f�[�^�͂���܂���B");
			 		break;

			 case PRINT :			// �S�m�[�h���L�[�l�̏����ɕ\��
					tree.print();
					break;
			}
		} while (menu != Menu.TERMINATE);
	}
}
