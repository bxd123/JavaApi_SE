package day06;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author Administrator
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼�´���
		 * ./a/b/c/d/e/fĿ¼
		 */
		File dir = new File("a"+File.separator+"b"+File.separator+"c"+File.separator+"d"+File.separator+"e"+File.separator+"f");
		
		if(!dir.exists()){
			/*
			 * �ڴ�����ǰĿ¼��ͬʱ�����в����ڵ�
			 * ��Ŀ¼һ�𴴽�����
			 */
			dir.mkdirs();
			System.out.println("������ϣ�");
		}else{
			System.out.println("�Ѿ����ڣ�");
		}
	}
}
