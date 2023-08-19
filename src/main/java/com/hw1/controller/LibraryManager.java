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

        int result = 0;

        if(bList[index] instanceof AniBook) {
            if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
                result = 1;
            }
        }else if(bList[index] instanceof CookBook) {
            if(((CookBook)bList[index]).isCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }
        return result;
    }

}
