package com.lhr13.first_springboot_lhr13.service;

import com.lhr13.first_springboot_lhr13.bean.Music;
import com.lhr13.first_springboot_lhr13.dao.MusicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicService {

    @Autowired
    MusicDao musicDao;

    public void addMusic(Music music) {
        musicDao.save(music);
    }

    public Page<Music> getMusicByPage(Pageable pageable) {
        return musicDao.findAll(pageable);
    }
}

