package com.kh.service;

import java.sql.Connection;

import com.kh.common.JDBCTemplate;
import com.kh.model.dao.BankbookDao;
import com.kh.model.vo.Bankbook;

public class BankbookService {
	public int makingBankbook(Bankbook b) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new BankbookDao().makingBankbook(b, conn);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
		
	}
	
	public Bankbook rogin(String id) {
			
		Connection conn = JDBCTemplate.getConnection();
		Bankbook list = new BankbookDao().rogin(id, conn);
		JDBCTemplate.close(conn);
			
		return list;
			
	}
		
	public int deposit(Bankbook b, int dpt) {
		
		Connection conn = JDBCTemplate.getConnection();
		int result = new BankbookDao().deposit(b,dpt, conn);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
		
	}
	
	public int withdraw(Bankbook b, int wd) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new BankbookDao().withdraw(b,wd, conn);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public int delete(String id, String pwd) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new BankbookDao().delete(id, pwd, conn);
		
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
		
	}
	
	public int remittance(Bankbook b, int bbn, int money) {
		Connection conn = JDBCTemplate.getConnection();
		int result1 = new BankbookDao().remittance1(b, bbn, money, conn);
		int result2 = 0;
		if(result1 > 0) {
			result2 = new BankbookDao().remittance2(b, bbn, money, conn);
			if(result2 > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		
		return result1 * result2;
	}
		
	
	
}
