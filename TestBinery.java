import java.util.Scanner;
public class TestBinery {

	public static void main(String[] args) {
		BineryTree bt= new BineryTree();
		int[] arr= {45,12,34,10,51,8,52,59,50};
		for(int i=0;i<arr.length;i++) {
			bt.add(arr[i]);
		}
		bt.preorder();
		
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value you want to search");
		int n=sc.nextInt();
		if(bt.Searchvalue(n)) {
			System.out.println("value is exist");
		}else {
			System.out.println("value not exist");
		}
	}

}
