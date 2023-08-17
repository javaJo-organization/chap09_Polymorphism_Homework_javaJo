package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.AniBookDTO;
import com.hw1.model.dto.MemberDTO;
import java.util.Scanner;

public class LibraryMenu {

    LibraryManager lm = new LibraryManager();

    Scanner sc = new Scanner(System.in);



    public void mainMenu(){
        System.out.println("이름");
        String name = sc.next();
        sc.nextLine();
        System.out.println("나이");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별");
        char gender = sc.nextLine().charAt(0);


            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            int selectNo = sc.nextInt();
            String keyword = "";
            int index = 0;


            switch (selectNo) {
                case 1:
                    lm.myInfo();
                    break;
                case 2:
                    lm.selectAll();
                    break;
                case 3:
                    lm.searchBook(keyword);
                    break;
                case 4:
                    lm.rentBook(index);
                    break;
            }

            sc.close();

    }

    public void selectAll(){

    }

    public void searchBook(){

    }

    public void rentBook(){
        lm.selectAll();
        System.out.println("대여할 도서 번호 선택");
        int index = sc.nextInt();
        int result = lm.rentBook(index);
// 도서대여를 위해 도서번호를 알아야된다.  selectAll() 메소드 호출
// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
// LibraryManager의 rentBook() 에 전달
// 그 결과 값을 result로 받고 그 result가
// 0일 경우  “성공적으로 대여되었습니다.” 출력
// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요” 출력

        switch (result) {
            case 0 :
                System.out.println("성공적으로 대야되었습니다.");
            case 1 :
                System.out.println("나이 제한으로 대여 불가능입니다.");
            case 2 :
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n" +
                        " 마이페이지를 통해 확인하세요");
        }

    }

}