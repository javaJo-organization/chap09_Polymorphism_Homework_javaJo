package com.hw1.controller;

import com.hw1.model.dto.AniBookDTO;
import com.hw1.model.dto.BookDTO;
import com.hw1.model.dto.CookBookDTO;
import com.hw1.model.dto.MemberDTO;

public class LibraryManager {

    private MemberDTO member = null;
    private BookDTO[] list = new BookDTO[5];

    {
        list[0] = new CookBookDTO("백종원 요리비법", "백종원", "Youtube", true);
        list[1] = new AniBookDTO("마스크걸", "매미", "네이버웹툰", 19);
        list[2] = new AniBookDTO("99강화 나무 몽둥이", "홍실", "네이버웹툰", 12);
        list[3] = new CookBookDTO("요리르 취미로", "취미로 요리하는 남자", "Youtube", true);
        list[4] = new CookBookDTO("취사병 전설이 되다", "제이로빈", "다음웹툰", false);
    }


    public void insertMember(MemberDTO mem) {
        this.member = member;
    }


    public MemberDTO myInfo() {
        return this.member;
    }


    public BookDTO[] selectAll() {
        return this.list;
    }

    public BookDTO[] searchBook(String keyword) {

        BookDTO[] searchList = new BookDTO[5];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i].getTitle().contains(keyword)) {
                searchList[count] = list[i];
                count++;
            }
        }

        return searchList;
    }

    public int rentBook(int index) {
        int result = 0;

        if (list[index] instanceof AniBookDTO) {
            if (((AniBookDTO) list[index]).getAccessAge() > member.getAge()) {
                result = 1;
            }
        } else if (list[index] instanceof CookBookDTO) {
            if (((CookBookDTO) list[index]).isCoupon()) {
                member.setCouponCount(member.getCouponCount() + 1);
                result = 2;
            }
        }

        return result;

    }

}
