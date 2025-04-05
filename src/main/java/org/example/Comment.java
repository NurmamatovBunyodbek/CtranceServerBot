package org.example;

import lombok.*;

/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/27/2024 *Time:9:09 PM
 */

@Data
public class Comment {
    private String name;
    private String comment;

    public Comment(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public Comment() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
