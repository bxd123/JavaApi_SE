package day01;
/**
 * StringBulider�ṩ�����޸��ַ�������
 * ����ط�����
 * ���ڲ�ά������һ���ɱ���ַ����飬����
 * �޸Ķ����ڵ�ǰ�����ڲ���ɵġ�
 * ��Ƶ���޸��ַ�������ʱӦ��ʹ�õ�ǰ����ɡ�
 * @author Administrator
 *
 */
public class StringBuilderDemo01 {
	public static void main(String[] args) {
		String str = "Ŭ��ѧϰ����������";
		/*
		 * ��Stringת��ΪStringBulider
		 * ����ʹ���вεĹ��췽����
		 * StrngBuilderҲ���޲ι��췽����Ĭ��
		 * ��ʾ���ַ���
		 */
		StringBuilder builder = new StringBuilder(str);
		/*
		 * ��StringBuliderת��ΪString
		 * ʹ��StringBuilder��ToString�������ɡ�
		 */
		str = builder.toString();
		/*
		 * StringBuilder append(String str)
		 * ��ǰ�ַ���ĩβ׷��ָ�����ݡ�
		 * ���������ط������������Ͳ�ͬ����Щ���ط���
		 * ����׷����������(��ת��Ϊ�ַ�����׷��)
		 *
		 */
		builder.append(",Ϊ���Ҹ��ù�����");
		System.out.println(builder.toString());
		/*
		 * StringBuilder replace(int start,int end,String str)
		 * ��ָ����Χ���ַ����滻Ϊָ�������ݡ�
		 * 
		 */
		builder.replace(9, 18,"����Ϊ�˸ı�����");
		System.out.println(builder.toString());
		
		/*
		 *StringBuilder delete(int start,int end)
		 *����ǰ�ַ�����ָ����Χ�ڵ�����ɾ����
		 * 
		 */
		builder.delete(0, 5);
		System.out.println(builder.toString());
		
		/*
		 * StringBuilder insert(int index,String str)
		 * ���ַ������뵽ָ��λ�ã�ԭλ�ü�����
		 * �ַ���˳������ƶ���
		 */
		builder.insert(1, "����");
		System.out.println(builder.toString());
		//��ת�ַ���
		builder.reverse();
		System.out.println(builder.toString());
	}
}
