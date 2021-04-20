package day20_pkg;





public class MemberDTO {

	MemberDTO(){
		
	}
		

	
	private String ID;
	private String PW;
	private String Name;
	private String Number;
	
	
	
	public MemberDTO(String iD, String pW, String name, String number) {
	super();
	ID = iD;
	PW = pW;
	Name = name;
	Number = number;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
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



	public String getNumber() {
		return Number;
	}



	public void setNumber(String number) {
		Number = number;
	}



	@Override
	public String toString() {
		return "MemberDTO [ID=" + ID + ", PW=" + PW + ", Name=" + Name + ", Number=" + Number + "]";
	}
	


	

}
