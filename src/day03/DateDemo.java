package day03;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ��ȷ�е�ʱ��㡣
 * �ڲ�ά����һ��longֵ����ֵ��¼���Ǵӣ�
 * 1970��1��1�� 00:00:00 ����ʾ��ʱ���֮��������
 * �ĺ���ֵ��������70���Ժ�����ڣ�������70����ǰ�����ڡ�
 * ����Date����ϴ���ȱ��(ʱ����ǧ���)���������Ĵ󲿷�
 * ����������Ϊ"��ʱ��",���ٽ���ʹ�á�
 * @author Administrator
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		/*
		 * ʹ��Ĭ�Ϲ��췽��������Date��ʾ��ǰ
		 * ϵͳʱ�䡣
		 */
		Date date = new Date();
		/*
		 * Date��д��toString�����ص��ַ���
		 * ��ʾ�ľ��ǵ�ǰDate��ʾ��ʱ�䡣��ʽ��
		 * Sun Nov 05 13:35:44 CST 2017
		 * ���ڷ�Ӣ�������̫�Ѻá�
		 */
		System.out.println(date);
		/*
		 * Date�Ĵ󲿷ַ���������ʹ���ˡ�
		 */
		date.getYear();
		/*
		 * ��ȡDate�ڲ�ά����longֵ
		 * 
		 */
		long time = date.getTime();
		System.out.println(time);
		//������һʱ�̵ĺ���ֵ
		time +=1000*60*60*24;
		/*
		 * void setTime(long)
		 * ����һ��longֵ��ʹDate��ʾ��longֵ
		 * ����ʾ��ʱ�䡣
		 */
		date.setTime(time);
		System.out.println(date);
	}
}
