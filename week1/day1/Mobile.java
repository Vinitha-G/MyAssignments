package week1.day1;

public class Mobile {
	public void sendsms() {
		System.out.println("Text Message");
	}
	public void takeSnapshot() {
		System.out.println("Snapshot is available");
	}

	public void printhaii() {
		System.out.println("haii");
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendsms();
		obj.takeSnapshot();
		obj.printhaii();
	}

}
