package day01;
/**
 * �ַ���ƴ�ӵ���������
 * 
 * @author Administrator
 *
 */
public class StringDemo07 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("a"); 
		for(int i=0;i<10000000;i++){
			builder.append("a");
		}
		System.out.println("ִ����ϣ�");
		//System.out.println(builder);
	}

}
