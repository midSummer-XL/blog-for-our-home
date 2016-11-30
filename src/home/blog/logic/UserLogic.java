package home.blog.logic;

import home.blog.dao.UserDao;
import home.blog.dto.UserDto;
import home.blog.entity.User;

public class UserLogic extends BaseLogic {
    private UserDao ud = new UserDao();

    public UserDto getUserByName(String userName) {
        UserDto udto = new UserDto();
        User u = ud.getUserByName(userName);
        if (u != null) {
            udto.setUserName(u.getUserName());
            udto.setPassword(u.getPassword());
            udto.setEnabled(u.isEnabled());
            udto.setIsDel(u.getIsDel());
            udto.setCreateDate(u.getCreateDate());
            udto.setUpdateDate(u.getUpdateDate());
        }
        return udto;
    }
}
