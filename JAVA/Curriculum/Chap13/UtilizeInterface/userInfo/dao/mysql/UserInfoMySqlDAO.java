package kr.co.ezenac.UtilizeInterface.userInfo.dao.mysql;

import kr.co.ezenac.UtilizeInterface.userInfo.UserInfoDTO;
import kr.co.ezenac.UtilizeInterface.userInfo.dao.UserInfoDAO;

public class UserInfoMySqlDAO implements UserInfoDAO {


	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert int MYSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update int MYSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete int MYSQL DB userId = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select int MYSQL DB userId = " + userInfoDTO.getUserId());
		
	}

}
