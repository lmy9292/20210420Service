package day20_pkg;

public class BoardDTO {
	private int BoardNumber;
	private String Texttitle;
	private String PW;
	private String Name;
	private String Contents;
	
	
	BoardDTO(){
		
	}

	public BoardDTO(String texttitle, String pW, String name, String contents, int boardNumber) {
		super();
		Texttitle = texttitle;
		PW = pW;
		Name = name;
		Contents = contents;
		BoardNumber = boardNumber;
	}

	public String getTexttitle() {
		return Texttitle;
	}

	public void setTexttitle(String texttitle) {
		Texttitle = texttitle;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getContents() {
		return Contents;
	}

	public void setContents(String contents) {
		Contents = contents;
	}

	public int getBoardNumber() {
		return BoardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		BoardNumber = boardNumber;
	}

	@Override
	public String toString() {
		return "BoardDTO [BoardNumber=" + BoardNumber + ", Texttitle=" + Texttitle + ", PW=" + PW + ", Name=" + Name
				+ ", Contents=" + Contents + "]";
	}

	
	
	
}