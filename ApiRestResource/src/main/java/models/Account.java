package models;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table (name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String UserName;
    private String PassWord;
    private Date LoginDate;

    private int IsChangeFirst;
    private String FullName;
    private Date BirthDay;
    private String Email;
    private String MobilePhone;
    private String InfoDetail;
    private int IsDelete;
    private int Status;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Date getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(Date birthDay) {
        BirthDay = birthDay;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        MobilePhone = mobilePhone;
    }

    public String getInfoDetail() {
        return InfoDetail;
    }

    public void setInfoDetail(String infoDetail) {
        InfoDetail = infoDetail;
    }

    public int getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(int isDelete) {
        IsDelete = isDelete;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }




    public Account(String userName, String passWord, Date loginDate, int isChangeFirst, String fullName, Date birthDay, String email, String mobilePhone, String infoDetail, int isDelete, int status) {
        super();
        UserName = userName;
        PassWord = passWord;
        LoginDate = loginDate;
        IsChangeFirst = isChangeFirst;
        FullName = fullName;
        BirthDay = birthDay;
        Email = email;
        MobilePhone = mobilePhone;
        InfoDetail = infoDetail;
        IsDelete = isDelete;
        Status = status;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public Date getLoginDate() {
        return LoginDate;
    }

    public void setLoginDate(Date loginDate) {
        LoginDate = loginDate;
    }

    public int getIsChangeFirst() {
        return IsChangeFirst;
    }

    public void setIsChangeFirst(int isChangeFirst) {
        IsChangeFirst = isChangeFirst;
    }
}
