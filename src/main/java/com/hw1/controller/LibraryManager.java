package com.hw1.controller;

import com.hw1.model.dto.AniBookDTO;
import com.hw1.model.dto.BookDTO;
import com.hw1.model.dto.MemberDTO;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.Scanner;

public class LibraryManager {

    private MemberDTO mem = null;

    private BookDTO[] bList = new BookDTO[5];

    public void insertMember(Member mem){

    }

    public Member myInfo(){


        return null;
    }

    public BookDTO[] selectAll(){

        return null;
    }

    public BookDTO[] searchBook(String keyword){

        return null;
    }

    public int rentBook(int index){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 입력");
        int age = sc.nextInt();
        int result = 0;

        AniBookDTO aniBookDTO = new AniBookDTO();
        MemberDTO memberDTO = new MemberDTO();

        int accessAge = aniBookDTO.getAccessAge();

        if (accessAge > age) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }

}
