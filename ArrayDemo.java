package 数组的排序;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//对数值型数组进行排序
		int a[]={12,45,34,23,21,1,3,4,65,76};
		Arrays.sort(a);
		for(int x:a){
			System.out.print(x + "\t");
		}

		System.out.println();
		System.out.println("------------");
		
		
		String b[]={"hello","set","abc","aac","aaa"};
		Arrays.sort(b);
		for(String d:b){
			System.out.print(d + "\t");
		}
	}

}