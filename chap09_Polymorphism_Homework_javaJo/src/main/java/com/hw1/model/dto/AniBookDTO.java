package com.hw1.model.dto;

public class AniBookDTO extends BookDTO {
    private int accessAge;

    public AniBookDTO() {
    }

    public AniBookDTO(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return super.toString() + ",accessAge=" + accessAge;
    }
}
