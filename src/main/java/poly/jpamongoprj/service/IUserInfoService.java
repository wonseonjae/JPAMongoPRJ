package poly.jpamongoprj.service;

import poly.jpamongoprj.dto.UserInfoDTO;

public interface IUserInfoService {

    int insertUserInfo(UserInfoDTO pDTO) throws Exception;

    int getUserLoginCheck(UserInfoDTO pDTO) throws Exception;

}
