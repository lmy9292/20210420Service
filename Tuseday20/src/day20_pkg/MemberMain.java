package day20_pkg;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		List<MemberDTO>memberList=new ArrayList<MemberDTO>();
		boolean run=true;
		MemberDTO List=null;
		MemberService ms=new MemberService();
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.회원가입 |2. 전체회원조회 |3.로그인0 |4.전화번호변경 |5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 >");
			int select =scan.nextInt();
			
			
		switch(select) {
		case 1:
			List=new MemberDTO();
			System.out.print("아이디 :");
			String ID=scan.next();
			System.out.print("비밀번호 :");
			String PW=scan.next();
			System.out.print("이름 :");
			String Name=scan.next();
			System.out.print("전화 번호 :");
			String number=scan.next();
			List.setID(ID);
			List.setPW(PW);
			List.setName(Name);
			List.setNumber(number);
			memberList.add(List);
			break;
		case 2:
			ms.memberList(memberList);
			break;
		case 3:
			ms.Login(memberList);
			break;
		case 4:
			memberList=ms.Phone(memberList);
			break;
		case 5:
		default:
			System.out.println("종료합니다");
			break;	
			
		
			
		}
	
		}
		
		
	}

}
