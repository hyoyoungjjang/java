package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.dao.BankbookDao;
import com.kh.model.vo.Bankbook;
import com.kh.service.BankbookService;
import com.kh.view.BankbookMenu;


public class BankbookController {
	
	
	public void makingBankbook(int no, String id, String pwd, String name, int balance) {
		
		Bankbook bb = new Bankbook(no, id, pwd, name, balance);
		
		int result = new BankbookService().makingBankbook(bb);
		
		if (result > 0) {
			new BankbookMenu().Success("통장 만들기에 성공하였습니다.");
		} else {
			new BankbookMenu().fail("통장 만들기에 실패하였습니다.");
		}
		
	}
	
	public Bankbook  rogin(String id, String pwd) {
		
		Bankbook b = new Bankbook();
		
		b = new BankbookService().rogin(id);
		
	
		
		if(b == null) {
			new BankbookMenu().fail("아이디를 잘못입력하였습니다.");
		} 
		
		return b;
	}
	
	public void deposit(Bankbook b, int dpt) {
		int result = new BankbookService().deposit(b, dpt);
		
		if(result > 0) {
			new BankbookMenu().Success("입금에 성공하였습니다.");
			new BankbookMenu().CheckBalance(b);
		} else {
			new BankbookMenu().fail("입금에 실패하였습니다.");
		}
		
	}
	
	public void withdraw(Bankbook b, int wd) {
		int result = new BankbookService().withdraw(b, wd);
		
		if(result > 0) {
			new BankbookMenu().Success("출금에 성공하였습니다.");
			new BankbookMenu().CheckBalance(b);
		} else {
			new BankbookMenu().fail("출금에 실패하였습니다.");
		}
		
	}
	
	public void delete(String id, String pwd) {
		int result = new BankbookService().delete(id,pwd);
		
		if(result > 0) {
			new BankbookMenu().Success("회원 탈퇴되었습니다.");
		} else {
			new BankbookMenu().fail("아이디나 비밀번호를 잘못입력하였습니다.");
		}
	}
	
	public void remittance(Bankbook b, int bbn, int money) {
		int result = new BankbookService().remittance(b, bbn, money);
		
		if(result > 0) {
			new BankbookMenu().Success("송금 완료하였습니다.");
			new BankbookMenu().CheckBalance(b);
		} else {
			new BankbookMenu().fail("없는 계좌번호입니다.");
		}
	}
	

	
}
