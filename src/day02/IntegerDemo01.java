package day02;
/**
 * ��װ��
 * java����8���������ͷֱ����˶�Ӧ�İ�װ��
 * ����װ����ֵ�ԭ����Ϊ�˽���������Ͳ��ܲ���
 * ������󿪷����⡣
 * @author Administrator
 *
 */
public class IntegerDemo01 {

	public static void main(String[] args) {
		dosome("abc");
		dosome(new Point(1,2));
		int i = 1;
		/**
		 * java��8���������ͣ�
		 * byte��short,int,long,float,double
		 * char,boolean
		 * ����ֵ����ʽֱ�Ӵ��ڵģ���������û��
		 * ����������������ȻҲ���̳�Object������
		 * ����ʹ�ö�̬����Object�ĽǶ�ȥ���ܻ�������
		 * 
		 */
		Integer ii = new Integer(i);
				
		dosome(i);
	}
	public static void dosome(Object obj){
		
	}
}
