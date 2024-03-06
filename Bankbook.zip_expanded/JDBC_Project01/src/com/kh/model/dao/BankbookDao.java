package com.kh.model.dao;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.common.JDBCTemplate;
import com.kh.model.vo.Bankbook;


public class BankbookDao {
	private Properties prop = new Properties();
	
	public BankbookDao() {
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int makingBankbook (Bankbook bb, Connection conn) {
		
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("makingBankbook");
		
		try {
			
			
			//스테이트먼트 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bb.getBankbookNo());
			pstmt.setString(2, bb.getUserId());
			pstmt.setString(3, bb.getUserPwd());
			pstmt.setString(4, bb.getUserName());
			pstmt.setInt(5, bb.getBalance());
			
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		
		
		return result;
	}

	
	public Bankbook rogin(String id, Connection conn){
		
		Bankbook list = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("rogin");
		
		try {
	
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				list = new Bankbook();
				Bankbook b = new Bankbook();
				b.setUserNo(rset.getInt("user_no"));
				b.setBankbookNo(rset.getInt("bankbook_no"));
				b.setUserId(rset.getString("user_id"));
				b.setUserPwd(rset.getString("user_pwd"));
				b.setUserName(rset.getString("user_name"));
				b.setBalance(rset.getInt("balance"));
				
				list = b;
			}
			
			
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return list;
		
	}
	
	public int deposit(Bankbook b , int dpt, Connection conn) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("deposit");
		
		
		try {
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dpt);
			pstmt.setString(2, b.getUserName());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int withdraw(Bankbook b , int wd, Connection conn) {
		
		int result = 0;

		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("withdraw");
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, wd);
			pstmt.setString(2, b.getUserName());
			
			result = pstmt.executeUpdate();
			
			
		}  catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int delete(String id, String pwd, Connection conn) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("delete");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
		
	}

	public int remittance1(Bankbook b, int bbn, int money, Connection conn) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("remittance1");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setInt(2, bbn);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
				
		
	}
	
public int remittance2(Bankbook b, int bbn, int money, Connection conn) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("remittance2");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setInt(2, b.getBankbookNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
				
		
	}
	
}
