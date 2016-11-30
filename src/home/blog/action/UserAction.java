package home.blog.action;

import home.blog.dto.UserDto;
import home.blog.logic.UserLogic;

@SuppressWarnings("serial")
public class UserAction extends BaseAction {
    private UserLogic ul = new UserLogic();

    private UserDto user;

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserByName() {
        user = ul.getUserByName(userName);
        return "SUCCESS";
    }

    public UserDto getUser() {
        return user;
    }

}
