package kr.co.ezenac.UtilizeInterface.userInfo.dao.oracle;

import kr.co.ezenac.UtilizeInterface.userInfo.UserInfoDTO;
import kr.co.ezenac.UtilizeInterface.userInfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert int ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update int ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select int ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select int ORACLE DB userId = " + userInfoDTO.getUserId());
		
	}

}
