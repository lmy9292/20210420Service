package day20_pkg;

import java.util.*;

public class MemberService {

	Scanner scan=new Scanner(System.in);
	
	String ID="";
	String PW="";
	String Nmae="";
	String Number="";
	
	void memberList(List<MemberDTO>memberList) {
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}
	void Login(List<MemberDTO>memberList){
		System.out.print("아이디를 입력하세요 :");
		String ID=scan.next();
		System.out.print("비밀번호를 입력하세요 :");
		String PW=scan.next();
		for(int i=0; i<memberList.size(); i++) {
			if(ID.equals(memberList.get(i).getID()) 
				&& PW.equals(memberList.get(i).getPW())) {
				System.out.println(ID+"님 환영합니다");		
	
			}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다");		
			}
		}	
				
	}
	List<MemberDTO>Phone(List<MemberDTO>memberList){
		System.out.print("아이디를 입력하세요 :");
		String ID=scan.next();
		System.out.print("비밀번호를 입력하세요 :");
		String PW=scan.next();
		for(int i=0; i<memberList.size(); i++) {
			if(ID.equals(memberList.get(i).getID())) {
				if(PW.equals(memberList.get(i).getPW())) {
					System.out.print("변경할 전화번호 입력:");
					String Number=scan.next();
					memberList.get(i).setNumber(Number);{
				}
				
				}
			}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다");
		}
		}return memberList;
}
}			
				
			
		
		
	