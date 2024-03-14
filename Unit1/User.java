class User
{
private final String userid;
private final String userName;
private final String emailId;

private User(UserBuilder b)
{
//initialiozation of attribute of user class
this.userid=b.userid;
this.userName=b.userName;
this.emailId=b.emailId;
}

public String getUserId()
{
return userid;
}
public String getUserName()
{
return userName;
}
public String getUserEmailId()
{
return emailId;
}

@Override
public String toString()
{
return this.getUserId() + " : " +this.getUserName() + " : " + this.getUserEmailId();
}

static class UserBuilder
{
private String userid;
private String userName;
private String emailId;

//for setting compulsory field 
// public UserBuilder(String uName ){
//     userName=uName;
// }

//otherwise for optional field we use this
public UserBuilder()
{ }

public UserBuilder setUserId(String userId)
{
this.userid=userId;
return this;
}
public UserBuilder setUserName(String userName)
{
this.userName=userName;
return this;
}
public UserBuilder setEmailId(String emailId)
{
this.emailId=emailId;
return this;
}

public User build()
{
User u=new User(this);
return u;
}
}
}

class Demo
{
public static void main(String args[])
{
User u1=new User.UserBuilder()
.setUserName(" CSE406")
.setEmailId(" java@lpu.co.in")
.setUserId("123")
.build();

System.out.println(u1);

User u2=new User.UserBuilder()
.setUserName(" CSE406")
.setUserId("123")
.build();

System.out.println(u2);

}
}