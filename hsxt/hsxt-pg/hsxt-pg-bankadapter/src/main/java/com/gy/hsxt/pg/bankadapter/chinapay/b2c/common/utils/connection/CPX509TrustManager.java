package com.gy.hsxt.pg.bankadapter.chinapay.b2c.common.utils.connection;

import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

class CPX509TrustManager implements X509TrustManager {
	public CPX509TrustManager() {
	}

	public void checkClientTrusted(X509Certificate[] chain, String authType) {
	}

	public void checkServerTrusted(X509Certificate[] chain, String authType) {
	}

	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}
}
