package utils;

import bean.User;
import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.sql.Connection;

/**
 * Created by song on 2017/7/23.
 */
public class test {
    public static void main(String[] args) throws Exception {
        User user = new User();
        /*Connection conn = DBUtils.getConnection();
        System.out.println(conn);*/
        String sql = "insert into webtest_user(id,userName,password,ImgPath) values(webtest_user_seq.nextval,:userName,:passWord,:ImgPath) ";
        int len =  DBUtils.insert(sql,user);
        System.out.println(len);
    }


}
