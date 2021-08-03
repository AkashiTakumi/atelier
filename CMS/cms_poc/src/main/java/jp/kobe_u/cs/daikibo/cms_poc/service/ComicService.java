package jp.kobe_u.cs.daikibo.cms_poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.kobe_u.cs.daikibo.cms_poc.dto.ComicDto;
import jp.kobe_u.cs.daikibo.cms_poc.entity.Comic;
import jp.kobe_u.cs.daikibo.cms_poc.exception.ComicException;
import jp.kobe_u.cs.daikibo.cms_poc.repository.ComicReposotory;

@Service
public class ComicService {
    @Autowired
    ComicReposotory crepo;

    /**
     * 漫画登録用メソッド
     * @param dto
     * @return
     */
    public Comic comicRegister(ComicDto dto) {
        if (crepo.count() != 0) {
            String title = dto.getTitle();
            List<Comic> list = crepo.findByUid(dto.getUid());
            for(Comic c : list) {
                if (c.getTitle().equals(title)) {
                    throw new ComicException(ComicException.COMIC_ALREADY_EXISTS, "this comic existed!");
                }
            }
            return crepo.save(dto.toEntity());
        } else {
            return crepo.save(dto.toEntity());
        }
    }

    /**
     * 漫画削除用メソッド
     * @param cid
     */
    public void deleteComic(Long cid) {
        if (crepo.existsById(cid)) {
            crepo.deleteById(cid);
        } else {
            throw new ComicException(ComicException.NO_SUCH_COMIC, "such comic not existed!");
        }
    }

    /**
     * とあるユーザに紐づく漫画を取ってくる
     * @param uid
     * @return
     */
    public List<Comic> getComicList(Long uid) {
        return crepo.findByUid(uid);
    }

    /**
     * 漫画の巻数を増やす
     * @param cid
     * @return
     */
    public Comic buy(Long cid) {
        if (crepo.findByCid(cid) == null) {
            throw new ComicException(ComicException.NO_SUCH_COMIC, "No such Comic!");
        } else {
            Comic comic = crepo.findByCid(cid);
            comic.setVolume(comic.getVolume()+1);
            return crepo.save(comic);
        }
    }

    /**
     * 漫画の巻数を減らす
     * @param cid
     * @return
     */
    public Comic cancel(Long cid) {
        if (crepo.findByCid(cid) == null) {
            throw new ComicException(ComicException.NO_SUCH_COMIC, "No such Comic!");
        } else {
            Comic comic = crepo.findByCid(cid);
            comic.setVolume(comic.getVolume()-1);
            return crepo.save(comic);
        }
    }
}
