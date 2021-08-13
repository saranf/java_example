package ch02;

public class UserInfo2 {

    public String userId;
    public String userPassWord;
    public String userName;
    public String userAddress;
    public String phoneNumber;

    public UserInfo2(){};

    public UserInfo2(String userId, String userPassword, String userName){
        this.userId=userId;
        this.userPassWord=userPassword;
        this.userName=userName;
    }
    public String showUserInfo(){
        return "고객님의 아이디는 " + userId + "이고 , 등록된 이름은 "+userName + "입니다.";
    }

    
    
}
