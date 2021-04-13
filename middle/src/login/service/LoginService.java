package login.service;

import login.action.ActionForward;
import login.model.LoginDao;
import login.model.UserModel;

public class LoginService {
	private static LoginService service = new LoginService();
	private static LoginDao dao;

	public static LoginService getInstance() {
		dao = LoginDao.getInstance();
		return service;
	}

	public UserModel SetLoginService(String id, String password) throws Exception {
		System.out.println("LoginService/checkLoginService");
		return dao.checkDBLogin(id, password);
	}

	public void NextPageCheck(String id, String password) throws Exception {
		UserModel userModel = new UserModel();
		ActionForward forward = new ActionForward();
		String re = "";
		try {
			if (userModel.getId().equals(id)) {
				if (userModel.getPassword().equals(password)) {
					re = "match all";

					forward.setRedirect(false);
					forward.setPath("/views/login/loginEnd.jsp");

					System.out.println("SetLoginAction/login complete");

				} else {
					try {
					} catch (Exception e) {
						e.printStackTrace();
					}

					re = "not match password";
				}
			}
			System.out.println(re);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
