package day06;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * delete��������ɾ��һ��Ŀ¼������ǰ���Ǹ�Ŀ¼
 * ������һ����Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo06 {
	public static void main(String[] args) {
		File dir = new File("demo");
		if(dir.exists()){
			dir.delete();
			System.out.println("ɾ����ϣ�");
		}else{
			System.out.println("�Ѿ�ɾ����");
		}
	}
}
