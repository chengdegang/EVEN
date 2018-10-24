package autoTest.onlineServer;

import autoTest.HttpRequest;

public class Services {
	private String address = null;
	private int port = 0;
	private String url = null;

	protected void setAddress(String address) {
		this.address = address.replace("http://", "").replace("https://", "");
	}
	
	protected void setPort(int port) {
		this.port = port;
	}

	protected String getAddress() {
		return address;
	}

	protected int getPort() {
		return port;
	}

	protected void setURL() {
		url = "http://" + getAddress() + ":" + getPort();
	}
	protected String getURL() {
		return url;
	}

	protected String ipLocation(String querylist) {
		return HttpRequest.sendGet(url + "/ip/location", "querylist=" + querylist );
	}
	protected String ipLocationV2(String querylist) {
		return HttpRequest.sendGet(url + "/ip/location/t2", "querylist=" + querylist );
	}
}
