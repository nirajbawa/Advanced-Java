package jdbc.exp18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superweb", "root", "");
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("select * from accounts");
        while(rs.next())
        {
            System.out.println("uname : "+rs.getString("user_name"));
            System.out.println("passowrd : "+rs.getString("password"));
            System.out.println("email : "+rs.getString("mail"));
            System.out.println("mono : "+rs.getString("mo_no"));
            System.out.println("date : "+rs.getDate("sdate")+" "+rs.getTime("sdate"));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values : ");
        String name, email, number, password;
        System.out.println("enter name : ");
        name = sc.nextLine();
        System.out.println("enter password : ");
        password = sc.nextLine();
        System.out.println("enter email : ");
        email = sc.nextLine();
        System.out.println("enter mo. no. : ");
        number = sc.nextLine();

        boolean in = smt.execute("insert into accounts (user_name, password, mail, mo_no) values('"+name+"', '"+password+"', '"+email+"', '"+number+"');");


    }
}
