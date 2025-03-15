package com.example.demo.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import javax.validation.constraints.NotNull;

import com.example.demo.Service.Utile.HasUserInfo;

import jakarta.persistence.ManyToOne;

@Entity // db랑 연동될떄 필요한 클래스랑 어노테이션이에요 연관되는 레포랑 연결해주세요 세터게터 필수
@Table(name = "user_body_info")
public class UserBodyInfo implements HasUserInfo {

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "userid", nullable = false)
    private UserInfo userInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private double height;

    @NotNull
    @Column(nullable = false)
    private double weight;

    @NotNull
    @Column(nullable = false)
    private double fatpercentage;

    @NotNull
    @Column(nullable = false)
    private double fatmass;

    @NotNull
    @Column(nullable = false)
    private double leanmass; // 제지방량

    @NotNull
    @Column(nullable = false)
    private double bmi;

    @NotNull
    @Column(nullable = false)
    private double inbodyScore;

    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // 날짜 시간정보 모두저장
    private Date date;

    @NotNull
    @Column(nullable = false)
    private int sex; // 성별

    @NotNull
    @Column(nullable = false)
    private int age; // 나이

    public UserBodyInfo() {

    }

    public UserBodyInfo(UserInfo userInfo, Long id, @NotNull double height,
            @NotNull double weight, @NotNull double fatpercentage, @NotNull double fatmass,
            @NotNull double leanmass, @NotNull double bmi, @NotNull double inbodyScore, @NotNull Date date,
            @NotNull int sex, @NotNull int age) {

        this.userInfo = userInfo;
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.fatpercentage = fatpercentage;
        this.fatmass = fatmass;
        this.leanmass = leanmass;
        this.bmi = bmi;
        this.inbodyScore = inbodyScore;
        this.date = date;
        this.sex = sex;
        this.age = age;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFatpercentage() {
        return fatpercentage;
    }

    public void setFatpercentage(double fatpercentage) {
        this.fatpercentage = fatpercentage;
    }

    public double getFatMass() {
        return fatmass;
    }

    public void setFatMass(double fatMass) {
        this.fatmass = fatMass;
    }

    public double getLeanmass() {
        return leanmass;
    }

    public void setLeanmass(double leanmass) {
        this.leanmass = leanmass;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getInbodyScore() {
        return inbodyScore;
    }

    public void setInbodyScore(double inbodyScore) {
        this.inbodyScore = inbodyScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserBodyInfo [userInfo=" + userInfo + ", id=" + id + ", height=" + height + ", weight=" + weight
                + ", fatpercentage=" + fatpercentage + ", fatmass=" + fatmass + ", leanmass=" + leanmass + ", bmi="
                + bmi + ", inbodyScore=" + inbodyScore + ", date=" + date + ", sex=" + sex + ", age=" + age + "]";
    }

}
