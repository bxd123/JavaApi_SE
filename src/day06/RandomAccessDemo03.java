package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile�ṩ�˷����д�����������ݵķ���
 * @author Administrator
 *
 */
public class RandomAccessDemo03 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat","rw");
		/*
		 * long getFilePointer()
		 * ��ȡ��ǰRAF��ָ��λ��
		 */
		
		System.out.println("pos:"+raf.getFilePointer());
		
		//���ļ���д��һ��int���ֵ
		int max = Integer.MAX_VALUE;
		raf.write(max>>>24);
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeInt(max);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeLong(1234L);
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * void
		 * seek(long pos)
		 * �ƶ�ָ��λ��
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		
		//end of file
		int i = raf.readInt();
		System.out.println(i);
		
		raf.seek(4);
		i=raf.readInt();
		System.out.println(i);
		
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		
		System.out.println("pos:"+raf.getFilePointer());
		
		double d = raf.readDouble();
		System.out.println(d);
		
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(0);
		l = raf.readLong();
		System.out.println(l);
		raf.close();
	}
}
