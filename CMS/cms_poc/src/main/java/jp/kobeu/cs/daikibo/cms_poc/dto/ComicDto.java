package jp.kobeu.cs.daikibo.cms_poc.dto;

import jp.kobeu.cs.daikibo.cms_poc.entity.Comic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComicDto {
    String title;
    int volume;
    Long uid;

    public Comic toEntity() {
        Comic comic = new Comic();

        comic.setTitle(title);
        comic.setVolume(1);
        comic.setUid(uid);

        return comic;
    }
}
