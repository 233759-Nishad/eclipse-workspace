package day5;

public class linear {
	public static void main(String[] args) {
		int []arr= {60,35,2,45,5,8,9,10};
		int item= 8;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item)
			{
				System.out.println("the item "+item+" is present in position "+(i+1));
				temp=temp+1;
			}
		}
	if(temp==0) {
		System.out.println("item "+item+" is not found in the list");
	}
  }
}
