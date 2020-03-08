package com.lhr13.first_springboot_lhr13.dao;

import com.lhr13.first_springboot_lhr13.bean.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MusicDao extends JpaRepository<Music, Integer> {
    List<Music> getMusicByAuthorStartingWith(String author);
    List<Music> getMusicByAuthorStartingWith(Float price);

    @Query(value = "select * from t_music where id = (select max(id) from t_music)",
    nativeQuery = true)
    Music getMaxIdBook();

    @Query(value = "select b from t_music where b.id >: id and b.author = :author")
    List<Music> getMusicByIdAndAndAuthor(@Param("author") String author,
                                         @Param("id") Integer id);

    @Query(value = "select b from t_music where b.id <? 2 and b.name like %?l%")
    List<Music> getMusicByIdAndMname(String name, Integer id);

}
