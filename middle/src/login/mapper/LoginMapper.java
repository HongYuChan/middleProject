package login.mapper;

import login.model.UserModel;

public interface LoginMapper {
	UserModel checkDBLogin(String id);
	
}
