package icai.dtc.isw.controler;

import icai.dtc.isw.dao.UserDAO;

public class UserControler {
	public void getUser(int idUser) {
		UserDAO.getUser(idUser);
	}
}
