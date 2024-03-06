package com.kh.model.vo;

public class Bankbook {
	
	private int userNo;
	private int bankbookNo;
	private String userId;
	private String userPwd;
	private String userName;
	private int balance;
	
	public Bankbook() {
		super();
	}
	
	

	public Bankbook(int bankbookNo, String userId, String userPwd, String userName, int balance) {
		super();
		this.bankbookNo = bankbookNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.balance = balance;
	}



	public Bankbook(int userNo, int bankbookNo, String userId, String userPwd, String userName, int balance) {
		super();
		this.userNo = userNo;
		this.bankbookNo = bankbookNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.balance = balance;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getBankbookNo() {
		return bankbookNo;
	}

	public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bankbook [userNo=" + userNo + ", bankbookNo=" + bankbookNo + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userName=" + userName + ", balance=" + balance + "]";
	}

	
	
	
	
	
	
}
