package sk.pre.java.gisa.practice;

public class Student { // 객체를 정의하는 클래스.
	private int StdNo; // 데이터를 가져오기 위한 변수설정
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String accCode;
	private String locCode;
	private int question2; 
	
	public Student(int stdNo, String email, int kor, int eng, int math, int sci, int hist, int total, String mgrCode,
			String accCode, String locCode) {
		super();
		StdNo = stdNo;
		this.email = email;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.hist = hist;
		this.total = total;
		this.mgrCode = mgrCode;
		this.accCode = accCode;
		this.locCode = locCode;
	}
	public int getStdNo() {
		return StdNo;
	}
	public void setStdNo(int stdNo) {
		StdNo = stdNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHist() {
		return hist;
	}
	public void setHist(int hist) {
		this.hist = hist;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMgrCode() {
		return mgrCode;
	}
	public void setMgrCode(String mgrCode) {
		this.mgrCode = mgrCode;
	}
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	
	public int getQuestion2() {
		return kor+eng;
	}
	// 필드값 , 생성자를 생성해서 객체에 정보를 저장해둔다.
	@Override
	public String toString() {
		return "Student [StdNo=" + StdNo + ", email=" + email + ", kor=" + kor + ", eng=" + eng + ", kor+eng=" + (kor+eng)
				+ ", sci=" + sci + ", hist=" + hist + ", total=" + total + ", mgrCode=" + mgrCode + ", accCode="
				+ accCode + ", locCode=" + locCode + "]";
	}
	// 스트링으로 타입을 바꿔주면서 정보를 오버라이딩을 해준다. 스트링으로 정보를 다루는게 편함.
	
}
