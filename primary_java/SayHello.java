public class SayHello{
	public SayHello(String name){
		System.out.println("Hello," + name ); 
	}
	public static void main(String[] args){
		SayHello me = new SayHello( "nick" );
	}
}
