package day5;

public class stringbinary {
	public static void main(String[] args) {
		int mid,low=0,high=4;
		String key="abc";
		String a[]= {"abc","jgh","zxy","try"};
		mid=(low+high)/2;
		while(low<=high) {
			if(key.compareTo(a[mid])<0){
				high=mid-1;
			}
			else if(a[mid]==key) {
				System.out.println("element "+key+" found!");
				break;
			}
			else {
				low=mid+1;
			}
			mid=(low+high)/2;
		}
		if(low>mid) {
			System.out.println("element "+key+" is not found");
		}
	}
}
