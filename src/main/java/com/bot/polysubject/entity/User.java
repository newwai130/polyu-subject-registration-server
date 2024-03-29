package com.bot.polysubject.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user",
        indexes = {
                @Index(name = "telegramId",  columnList="telegramId")
        })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "telegramId")
    private Long telegramId;

    @Column(name = "role")
    private String role;

    @Column(name = "chatId")
    private Long chatId;

    @Column(name = "status")
    private String status;

    @Column(name = "repeatedMode")
    private String repeatedMode;

    public User(long telegramId, long chatId) {
        this.telegramId = telegramId;
        this.role = "normal user";
        this.chatId = chatId;
        this.status = "active";
        this.repeatedMode = "once";
    }
}
