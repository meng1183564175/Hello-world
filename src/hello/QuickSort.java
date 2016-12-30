package hello;
/**
 * 快速排序算法
 * @author Scott
 * 2016-11-23 10:14
 *
 */
public class QuickSort {
	
	public static void main(String[] args) {
	    int[] a={1,2,3,4,5,6,7,8};
	    a=sort(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
	}
	public static int[] sort(int[] b,int left,int right){
		int[] a=b;
		int startPos=left,endPos=right;
		if(left>=right){
			return a;
		}
		int temp=a[left];//排序支点
		while(startPos!=endPos){
			for(;endPos>startPos;endPos--){
				if(a[endPos]<temp) break;
			}
			for(;startPos<endPos;startPos++){
				if(a[startPos]>temp) break;
			}
			a=changePos(a, startPos, endPos);
		}
		a=changePos(a, left, endPos);
		sort(a,left,endPos-1);
		sort(a,endPos+1,right);
		return a;
	}
	public static int[] sortDESC(int[] b,int left,int right){
		int[] a=b;
		int startPos=left,endPos=right;
		if(left>=right){
			return a;
		}
		int temp=a[left];//排序支点
		while(startPos!=endPos){
			for(;startPos<endPos;startPos++){
				if(a[startPos]<temp) break;
			}
			for(;endPos>startPos;endPos--){
				if(a[endPos]>temp) break;
			}
			a=changePos(a, startPos, endPos);
		}
		a=changePos(a, left, startPos);
		sort(a,left,startPos-1);
		sort(a,startPos+1,right);
		return a;
	}
	//交换元素
	public static int[] changePos(int[] a,int i,int j){
		int temp=0;
		if(null!=a&&j<a.length&&i<a.length){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			return a;
		}
		else {
			System.out.println("数组输入不合法");
			return null;
		}
	} 
}
