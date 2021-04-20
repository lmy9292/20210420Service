package day20_pkg; 

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		List<BoardDTO>text=new ArrayList<BoardDTO>();
		boolean run=true;
		BoardDTO List=null;
		BoardService bo=new BoardService();
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.글쓰기 |2. 전체글목록 |3.글조회 |4.글수정 |5.글삭제|6.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택 >");
			int select =scan.nextInt();
			
		switch(select) {
		case 1:
			List=new BoardDTO();
			int BoardNumber=text.size()+1;
			System.out.print("제목을 입력하세요:");
			String Texttitle=scan.next();
			System.out.print("비밀번호를 입력하세요:");
			String PW=scan.next();
			System.out.print("이름을 입력하세요:");
			String Name=scan.next();
			System.out.print("내용을 입력하세요:");
			String Contents=scan.next();
			List.setBoardNumber(BoardNumber);
			List.setTexttitle(Texttitle);
			List.setPW(PW);
			List.setName(Name);
			List.setContents(Contents);
			text.add(List);
			break;
		case 2:
			bo.text(text);
			break;
		case 3:
			text=bo.BoardNumber(text);
			break;
		case 4:
			text=bo.Modify(text);
			break;
		case 5:
		
			break;
		case 6:
			
		default:
			System.out.println("종료합니다");
			break;	
		}
		}	
			
		
	}

}
