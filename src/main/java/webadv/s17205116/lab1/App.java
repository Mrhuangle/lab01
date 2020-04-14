package webadv.s17205116.lab1;

import java.util.Scanner;

import com.sun.deploy.util.SyncAccess;
import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args){
        String account = "17205116";
        String password = "17205116";
        String lockpsw = sha256hex(account);
        System.out.println("账号：");
        Scanner in = new Scanner(System.in);
        String myAccount = in.next();
        System.out.println("密码：");
        String myPsw = in.next();
        String lockMypsw = sha256hex(myPsw);
        if (account.equals(myAccount) && lockpsw.equals(lockMypsw)){
            System.out.println("验证成功！");
        }else {
            System.out.println("验证失败！");
            System.exit(0);
        }
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}