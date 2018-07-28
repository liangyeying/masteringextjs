package com.leong.masteringextjs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author leongfeng created on 2018-07-27.
 */
@Entity(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;

    private String username;
    private String name;
    private String password;
    private String email;
    private String picture;
    private Integer groupId;

}
