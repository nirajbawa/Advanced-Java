package jdbc.exp19;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superweb", "root", "");

//        result set
        Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet result1 = stm.executeQuery("select * from accounts");



        while(result1.next())
        {
            System.out.println("uname : "+result1.getString("user_name"));
            System.out.println("passowrd : "+result1.getString("password"));
            System.out.println("email : "+result1.getString("mail"));
            System.out.println("mono : "+result1.getString("mo_no"));
            System.out.println("date : "+result1.getDate("sdate")+" "+result1.getTime("sdate"));
        }

        System.out.println("\n\n\n\n");
        result1.first();
        System.out.println("name : "+result1.getString("user_name"));
        result1.last();
        System.out.println("name : "+result1.getString("user_name"));
        result1.absolute(3);
        System.out.println("name : "+result1.getString("user_name"));
        result1.relative(-1);
        System.out.println("name : "+result1.getString("user_name"));


//        prepared statement

        PreparedStatement ps = con.prepareStatement("insert into accounts (user_name, password, mail, mo_no) values (?, ?, ?, ?);");

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


        ps.setString(1,name);
        ps.setString(2, password);
        ps.setString(3, email);
        ps.setString(4, number);


        int i = ps.executeUpdate();

        System.out.println(i);


    }
}
