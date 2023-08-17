package com.hw1.controller;

import com.hw1.model.dto.BookDTO;
import com.hw1.model.dto.MemberDTO;

import java.lang.reflect.Member;

public class LibraryManager {
    MemberDTO mem = null;

    BookDTO[] bList = new BookDTO[5];

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

        return index;
    }

}
