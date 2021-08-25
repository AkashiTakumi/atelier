package jp.kobe_u.cs.daikibo.cms_poc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long cid;

    String title;

    int volume;

    Long uid;
}
