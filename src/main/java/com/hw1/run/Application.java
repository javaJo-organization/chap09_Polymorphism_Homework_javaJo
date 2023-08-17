package com.hw1.run;

import com.hw1.controller.LibraryManager;
import com.hw1.view.LibraryMenu;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("1. 도서관 서비스");
        System.out.println("9. 프로그램 종료");
        System.out.println("====================================");
        System.out.println("원하는 관리 메뉴의 번호를 입력해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        int selectMenu = sc.nextInt();

        switch (selectMenu) {
            case 1 : new LibraryMenu().mainMenu(); break;
            case 9 : System.out.println("프로그램을 종료합니다."); return;
            default : System.out.println("잘못된 번호입니다. 다시 입력해 주세요."); break;
        }
        sc.close();

    }


}