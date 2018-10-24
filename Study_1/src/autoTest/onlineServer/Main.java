package autoTest.onlineServer;

public class Main {

	public static void main(String[] args) {
		Services services = new Services();
		services.setAddress("10.100.1.151");
		services.setPort(10882);
		services.setURL();
		System.out.println(services.ipLocation("12.13.141.15;123.42.2.3;"));
		System.out.println(services.ipLocationV2("12.13.141.15;123.42.2.3;"));
	}
}
