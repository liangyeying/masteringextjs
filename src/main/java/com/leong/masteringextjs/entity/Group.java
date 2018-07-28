package com.leong.masteringextjs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author leongfeng created on 2018-07-27.
 */
@Entity(name = "groups")
public class Group {

    @Id
    private Integer id;
    private String name;
}
