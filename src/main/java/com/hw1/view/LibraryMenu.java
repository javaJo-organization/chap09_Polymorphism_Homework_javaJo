package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.BookDTO;
import com.hw1.model.dto.MemberDTO;


import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이을 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        lm.insertMember(new MemberDTO(name, age, gender));

        do {
            System.out.println("========= 메뉴 ========");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        }while (true);
    }

    public void selectAll() {
        BookDTO[] bList = lm.selectAll();

        System.out.println("=== 전체 도서 목록 조회 ===");
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i]);
        }
    }

    public void searchBook() {
        System.out.print("검색할 도서 제목 키워드: ");
        String keyword = sc.nextLine();

        BookDTO[] searchList = lm.searchBook(keyword);

        System.out.println("=== 검색 도서 목록 조회 ===");
        for (BookDTO bk : searchList) {
            if (bk != null)
                System.out.println(bk);
        }
    }

    public void rentBook() {

        selectAll();

        System.out.print("대여할 도서 번호 : ");
        int index = sc.nextInt();

        int result = lm.rentBook(index);

        if (result == 0)
            System.out.println("성공적으로 대여되었습니다.");
        else if (result == 1)
            System.out.println("나이제한으로 대여 불가능 입니다.");
        else
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. ");
    }

}
