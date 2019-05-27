public class Loop {
    public static void main(String []args) {
		System.out.println("do... while... : ");
		int x=0;
		do{
			System.out.println(x);
		}
		while(x>0);
		System.out.println("while... : ");
		int y=10;
		while(y<20){
			System.out.println(y);
			y=y+1;
		}
		System.out.println("for... : ");
		for(int z=10;z<20;z=z+1){
			System.out.println(z);
		}
		System.out.println("for strengthened : ");
		String [] for_more={"me","you","him","her"};
		for(String str:for_more){
			System.out.println(str);
		}
    }
}
