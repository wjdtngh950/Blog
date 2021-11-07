package com.suho.blog.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="tbl_memo")
@ToString
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long mno;

}
