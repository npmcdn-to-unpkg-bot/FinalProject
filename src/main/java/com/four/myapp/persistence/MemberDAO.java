package com.four.myapp.persistence;

import com.four.myapp.domain.MemberVO;

public interface MemberDAO {

	public void registMember(MemberVO vo);
	public void modifyMember(MemberVO vo);
	public MemberVO readMember(String user_no) throws Exception;
	public MemberVO readWithPW(String user_email, String user_pw) throws Exception;
}