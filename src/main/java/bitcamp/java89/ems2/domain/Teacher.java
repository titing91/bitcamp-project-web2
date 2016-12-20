package bitcamp.java89.ems2.domain;

public class Teacher extends Member{	
	private static final long serialVersionUID = 1L;
	
	protected int teacherNo;
	protected String homePage;
	protected String faceBook;
	protected String twiter;
	public int getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(int teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	public String getFaceBook() {
		return faceBook;
	}
	public void setFaceBook(String faceBook) {
		this.faceBook = faceBook;
	}
	public String getTwiter() {
		return twiter;
	}
	public void setTwiter(String twiter) {
		this.twiter = twiter;
	}	
}
