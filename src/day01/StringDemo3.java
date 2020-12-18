package day01;
/**
 * 获取当前字符串指定下标对应的字符
 * 
 * @author Administrator
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String str = "thinking in java";
		//查看第5个字符是什么？
		char c = str.charAt(4);
		System.out.println(c);
		/*
		 * 检查一个字符串是否为回文
		 */
		/*String info = "上海自来水来自海上";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i)
				!=
				info.charAt(info.length()-i-1)
			){
				System.out.println("不是回文！");
				return;
			}
		}
		System.out.println("是回文！");*/
		String info = "上海自来水来自海上";
		for(int i=0;i<info.length()/2;i++){
			if(info.charAt(i)
					!=
					info.charAt(info.length()-1-i))
			{
				System.out.print("不");
	
				break;
				
			}
		}
			System.out.println("是回文！");	
	}

}
