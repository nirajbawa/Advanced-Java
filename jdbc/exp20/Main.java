package jdbc.exp20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superweb", "root", "");

        PreparedStatement psi = con.prepareStatement("insert into accounts (user_name, password, mail, mo_no) values (?, ?, ?, ?);");

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


        psi.setString(1,name);
        psi.setString(2, password);
        psi.setString(3, email);
        psi.setString(4, number);

        psi.executeUpdate();


        sc.nextLine();

        PreparedStatement psu = con.prepareStatement("update accounts set user_name = ? where user_name=?;");
        psu.setString(1, name);
        psu.setString(2, "bava");
        psu.executeUpdate();



        sc.nextLine();

        PreparedStatement pud = con.prepareStatement("delete from accounts where user_name=?;");
        pud.setString(1, name);
        pud.executeUpdate();

        con.close();
    }
}
