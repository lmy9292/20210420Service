package day20_pkg; 

import java.util.*;

public class BoardService {

	Scanner scan=new Scanner (System.in);
	
	void text(List<BoardDTO>text) {
		for(int i=0; i<text.size(); i++) {
			System.out.println(text.get(i));
		}
	}
	List<BoardDTO>BoardNumber(List<BoardDTO>text){
		System.out.print("번호를 입력해주세요:");
		int Number=scan.nextInt();
		for(int i=0; i<text.size(); i++) {
			if(Number==(text.get(i).getBoardNumber())) {
				System.out.println(text.get(i));
			}
		}return text;
	}

	List<BoardDTO>Modify(List<BoardDTO>text){
		System.out.print("글번호를 입력하세요:");
		int BoardNumber=scan.nextInt();
		System.out.print("비밀번호를 입력하세요:");
		String PW=scan.next();
		for(int i=0; i<text.size(); i++) {
			if(BoardNumber==(text.get(i).getBoardNumber())) {
				if(PW.equals(text.get(i).getPW())) {
					System.out.print("제목을 입력하세요:");
					String Texttitle=scan.next();
					System.out.print("내용을 수정하세요:");
					String Contents=scan.next();
					text.get(i).setTexttitle(Texttitle);
					text.get(i).setContents(Contents);{
					System.out.println(text.get(i));
					}
				}
			}
		}return text;
	}
	List<BoardDTO>Delete(List<BoardDTO>text){
		System.out.print("글번호를 입력하세요:");
		int BoardNumber=scan.nextInt();
		System.out.print("비밀번호를 입력하세요:");
		String PW=scan.next();
		for(int i=0; i<text.size(); i++) {
		if(BoardNumber==(text.get(i).getBoardNumber())) {
			if(PW.equals(text.get(i).getPW())) {
				text.remove(i);
			
					
				}
			}
		}return text;
	}
	
	}

