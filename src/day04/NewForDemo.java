package day04;
/**
 * JDK5.0֮���Ƴ���һ���µ����ԣ�
 * ��ǿforѭ�����ֽ�����ѭ����for each
 * 
 * ��ѭ�����ܴ��洫ͳѭ�������ý����������������ϻ�
 * ���顣
 * @author Administrator
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three","four","five","six"};
		for(int i=0;i<array.length;i++){
			String str = array[i];
			System.out.println(str);
		}
		for(String str:array){
			System.out.println(str);
		}
			
	}
}
