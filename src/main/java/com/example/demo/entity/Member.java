package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@FieldDefaults(level = AccessLevel.PROTECTED)
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String memberName;

    @Enumerated(EnumType.STRING)
    @Column
    private DayString day;

    @Column(columnDefinition = "mediumtext", nullable = false, updatable = false, length = 21474)
    private String testString;

    public Member(String memberName, DayString day, String testString) {
        this.memberName = memberName;
        this.day = day;
        this.testString = testString;
    }
}
