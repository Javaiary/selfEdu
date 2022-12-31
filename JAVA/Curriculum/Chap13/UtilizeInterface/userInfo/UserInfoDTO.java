package kr.co.ezenac.UtilizeInterface.userInfo;

public class UserInfoDTO  {
	//데이터를 필요로 하는 것들 따로 정의
	private String userId;
	private String passwd;
	private String userName;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
