package basic.lesson.gisa;

public class Student {
	private int StdNo; // 학번
	private String email; // 이메일
	private int kor; // 국어
	private int eng; // 영어
	private int math; // 수학
	private int sci; // 과학
	private int hist; // 국사
	private int total; // 총점
	private String mgrCode; // 담임코드
	private String accCode; // 성취도
	private String locCode; // 지역코드
	
	// 이미 존재하는 데이터들이기때문에 객체가 생성되면서 세팅이 될수있게금 생성자 생성
	
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
	
	@Override
	public String toString() {
		return "Student [StdNo=" + StdNo + ", email=" + email + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sci=" + sci + ", hist=" + hist + ", total=" + total + ", mgrCode=" + mgrCode + ", accCode="
				+ accCode + ", locCode=" + locCode + ", getStdNo()=" + getStdNo() + ", getEmail()=" + getEmail()
				+ ", getKor()=" + getKor() + ", getEng()=" + getEng() + ", getMath()=" + getMath() + ", getSci()="
				+ getSci() + ", getHist()=" + getHist() + ", getTotal()=" + getTotal() + ", getMgrCode()="
				+ getMgrCode() + ", getAccCode()=" + getAccCode() + ", getLocCode()=" + getLocCode() + "]";
	}
// student 객체가 가지고 있는 정보를 얻어야함. toString 오버라이드.
// 실존하는 정보를 가져올때마다 getter/setter를 할 수 없기때문에.
	
}
