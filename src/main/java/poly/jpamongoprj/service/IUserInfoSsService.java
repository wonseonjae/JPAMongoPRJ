package poly.jpamongoprj.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import poly.jpamongoprj.dto.UserInfoDTO;

public interface IUserInfoSsService extends UserDetailsService {

    int insertUserInfo(UserInfoDTO pDTO) throws Exception;
}
