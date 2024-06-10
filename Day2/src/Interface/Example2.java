package Interface;
interface Engine{
	void on();
	void off();
}
interface AC{
	void on();
	void off();
}
interface Music{
	void on();
	void off();
}
class Engine_MODE implements Engine{
	public void on () {
		System.out.println("Engine on");
	}
	public void off(){
		System.out.println("Engine off");
	}
}
class AC_MODE implements AC{
	public void on () {
		System.out.println("AC on");
	}
	public void off() {
		System.out.println("AC off");
	}
}
class Music_MODE implements Music{
	public void on() {
		System.out.println("Music on");
	}
	public void off() {
		System.out.println("Music off");
	}
}
public class Example2 {

     public static void main(String[] args) {
	 Engine e= new Engine_MODE();
     e.on();
     e.off();
     AC a= new AC_MODE();
     a.on();
     a.off();
     Music m = new Music_MODE();
     m.on();
     m.off();
	}

}
