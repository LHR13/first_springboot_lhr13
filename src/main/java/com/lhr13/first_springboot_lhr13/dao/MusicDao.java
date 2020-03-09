package com.lhr13.first_springboot_lhr13.dao;

import com.lhr13.first_springboot_lhr13.bean.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicDao extends JpaRepository<Music, Integer> {
}
