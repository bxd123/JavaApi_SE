package string;
/**
 *	���գ��ͣ�����ַ���
 */
public class SpiltString {
	public static void main(String[] args) {
		String strin = "dfs,ffsfsf;sfsf;sfsfff,fs;dsf";
		String regex = "[\\;\\,]+";
		String[] strout = strin.split(regex);
		for (int i = 0; i < strout.length; i++) {
			System.out.println(strout[i]);
		}
	}
}
