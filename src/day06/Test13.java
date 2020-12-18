package day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test13 {
	public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
		//ʹ������������ص�ǰ���е�empty.dat�ļ�
		File file = new File(Test13.class.getClassLoader().getResource("day06/Empty.dat").toURI());
		
		RandomAccessFile raf = new RandomAccessFile(file,"r");
		
		List<Empty> empList = new ArrayList<Empty>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		for(int i=0;i<10;i++){
			//��ȡname���ַ���
			String name = readString(32,raf);
			//��ȡage
			int age = raf.readInt();
			//��ȡgender
			String gender = readString(30,raf);
			//��ȡsalary
			int salary = raf.readInt();
			//��ȡ����
			String hiredata = readString(32,raf);
			Date hire = sdf.parse(hiredata);
			Empty emp = new Empty(name, age, gender, salary, hire);
			empList.add(emp);
			
		}
		System.out.println("������ϣ�");
		for(Empty e:empList){
			System.out.println(e);
		}
		raf.close();
		
	}
	public static String readString(int len,RandomAccessFile raf) throws IOException{
		byte[] data = new byte[len];
		raf.read(data);
		
		return new String(data,"UTF-8").trim();
	}
}
	