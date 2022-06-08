package com.example.keepcontol.task;

import javax.persistence.*;
import java.time.LocalDate;

//@Entity
//@Table
public class Task {

    //@Id
    //@SequenceGenerator(
    //        name = "taskSequence",
//            sequenceName = "taskSequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "taskSequence"
//    )
    private Long id;
    private String content;
    private LocalDate date;
    private String tag;

    private Long userId;

    public Task() {}

    public Task(Long id, String content, LocalDate date, String tag, Long userId) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.tag = tag;
        this.userId = userId;
    }

    public Task(String content, LocalDate date, String tag, Long userId) {
        this.content = content;
        this.date = date;
        this.tag = tag;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTag() {
        return tag;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", tag='" + tag + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
