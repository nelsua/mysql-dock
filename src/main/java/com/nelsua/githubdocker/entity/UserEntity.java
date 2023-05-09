package com.nelsua.githubdocker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Table(name = "users", schema = "test")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity {
    @Id
    private int id;
    @Column
    private String name;
}
