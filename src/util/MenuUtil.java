package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu(){
        System.out.println("please selected menu");
        Menu.showAllMenu();
        Scanner sc=new Scanner(System.in);
        int selectedMenuNumber=sc.nextInt();
        Menu selectedMenu=Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }
    public static void processMenu(Menu menu){
        menu.process();
    }
//    public static void fooAllLoginObjects(MenuLoginServiceInter[] logins){//facctoryPattern
//        for (int i=0;i< logins.length;i++){
//            MenuLoginServiceInter m=logins[i];
//            m.foo();
//            m.process();
//        }
//    }
}
