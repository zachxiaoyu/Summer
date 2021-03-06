package com.swingfrog.summer.server;

import java.util.concurrent.atomic.AtomicInteger;

public class SessionContext {

	private String sessionId;
	private String address;
	private int port;
	
	private long currentMsgId;
	private AtomicInteger heartCount = new AtomicInteger(0);
	private long lastRecvTime;
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public long getCurrentMsgId() {
		return currentMsgId;
	}
	public void setCurrentMsgId(long currentMsgId) {
		this.currentMsgId = currentMsgId;
	}
	public int getHeartCount() {
		return heartCount.get();
	}
	public void setHeartCount(int heartCount) {
		this.heartCount.set(heartCount);
	}
	public void incrementHeartCount() {
		heartCount.incrementAndGet();
	}
	public long getLastRecvTime() {
		return lastRecvTime;
	}
	public void setLastRecvTime(long lastRecvTime) {
		this.lastRecvTime = lastRecvTime;
	}
	@Override
	public String toString() {
		return String.format("IP[%s:%s]", address, port);
	}
}
