package kr.co.ezenac.UtilizeInterface.userInfo.dao.mssql;

import kr.co.ezenac.UtilizeInterface.userInfo.UserInfoDTO;
import kr.co.ezenac.UtilizeInterface.userInfo.dao.UserInfoDAO;

public class UserInfoMssqlDAO implements UserInfoDAO{

	

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert int MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update int MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete int MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select int MSSQL DB userId = " + userInfoDTO.getUserId());
		
	}

}
