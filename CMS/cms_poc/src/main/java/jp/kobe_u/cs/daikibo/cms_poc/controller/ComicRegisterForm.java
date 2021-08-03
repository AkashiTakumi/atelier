package jp.kobe_u.cs.daikibo.cms_poc.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComicRegisterForm {
    String title;
    Long uid;
}
