package day5;

public class binary {

	public static void main(String[] args) {
		int[]a= {60,35,2,45,30,5,8,9,10,12,13};
		int srch=2;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(a[mi]==srch) {
				System.out.println("element is present in our arr list "+mi+" index position");
				break;
			}
			else if(a[mi]<srch) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println(srch+" not found in the list");
		}
	}
}
