package kr.co.ezenac.constructor;

public class UserInfoTest {
	public static void main(String[] args) {
		
		UserInfo userInfo = new UserInfo();
		userInfo.userId = "ezen";
		userInfo.userPassWord = "0111";
		userInfo.userName = "Val";
		
		System.out.println(userInfo.showUserInfo());
		
		UserInfo userInfo2 = new UserInfo("ezenac", "2023", "Nal");
		System.out.println(userInfo2.showUserInfo());
		
	}
}
