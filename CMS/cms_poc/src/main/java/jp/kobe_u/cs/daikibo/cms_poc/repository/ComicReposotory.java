package jp.kobe_u.cs.daikibo.cms_poc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobe_u.cs.daikibo.cms_poc.entity.Comic;

@Repository
public interface ComicReposotory extends CrudRepository<Comic, Long>{
    public List<Comic> findByUid(Long uid);

    public Comic findByCid(Long cid);
}
