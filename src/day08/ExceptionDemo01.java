package day08;
/**
 * java�쳣��������е�try-catch
 * try�����������Ͽ��ܳ���Ĵ���Ƭ��
 * catch������������try���д����׳��Ĵ���
 * �������
 * 1@author Administrator
 *
 */
public class ExceptionDemo01 {
	//@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try{
			String str = "a";
			/*
			 * JVM��ִ�д���Ĺ�������������һ���쳣��
			 * ���ʵ��������������쳣ʵ����������������
			 * ִ�й����������õ��쳣������ʾ�ô��󱨸棬
			 * ������Ϻ󽫸��쳣�׳������׳��쳣��������
			 * �б�try��Χ����JVM����catch���Ƿ��й�ע
			 * ���쳣����ע�򽻸�catch�����������Ὣ�쳣
			 * �׳�����ǰ�����⣬�ɵ��õ�ǰ�����Ĵ�������
			 * �쳣��
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
		}catch(NullPointerException e){
			System.out.println("���ֿ�ָ��");
			System.out.println(e);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�ַ����±�Խ����");
			/*
			 * Ӧ������һ����ϰ�ߣ������һ��catch��
			 * ����Exception��������δ�����쳣�����³���
			 * �жϡ�
			 * 
			 * �����catch����ͬ�쳣ʱ����Щ�쳣�����
			 * �̳й�ϵ����ô�����쳣Ҫ�������в��񣬸����쳣
			 * ���¡�
			 */
		}catch(Exception e){
			System.out.println("��������");
		}
		System.out.println("���������");
	}
}
