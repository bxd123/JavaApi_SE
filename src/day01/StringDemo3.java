package day01;
/**
 * ��ȡ��ǰ�ַ���ָ���±��Ӧ���ַ�
 * 
 * @author Administrator
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String str = "thinking in java";
		//�鿴��5���ַ���ʲô��
		char c = str.charAt(4);
		System.out.println(c);
		/*
		 * ���һ���ַ����Ƿ�Ϊ����
		 */
		/*String info = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i)
				!=
				info.charAt(info.length()-i-1)
			){
				System.out.println("���ǻ��ģ�");
				return;
			}
		}
		System.out.println("�ǻ��ģ�");*/
		String info = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i)
					!=
					info.charAt(info.length()-1-i))
			{
				System.out.print("��");
	
				break;
				
			}
		}
			System.out.println("�ǻ��ģ�");	
	}

}
