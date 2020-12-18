package sort;

public class FastSort {
	public void fastSort(String[] strDate,int left,int right){
		int i,j;
		i = left;
		j = right;
		String middle,tempDate;
		middle = strDate[(i+j)/2];
		do{
			while(i<right && strDate[i].compareTo(middle)<0){
				i++;//得到左边比中间值大的
			}
			while(j>left && strDate[j].compareTo(middle)>0){
				j--;//得到右边比中间值小的
			}
			if(i<=j){//将左边大的和右边小的交换
				tempDate = strDate[i];
				strDate[i] = strDate[j];
				strDate[j] = tempDate;
				i++;
				j--;
			}
		}while(i<=j);
		if(i<right){
			fastSort(strDate, i, right);
		}
		if(j>left){
			fastSort(strDate, left, j);
		}
	}
	public static void main(String[] args) {
		String[] strVoid=new String[]{"11","66","22","0","55","22","0","32"};
		FastSort fast = new FastSort();
		fast.fastSort(strVoid, 0, strVoid.length-1);
		for(int i=0;i<strVoid.length;i++){
			System.out.println(strVoid[i]);
		}
	}
}
