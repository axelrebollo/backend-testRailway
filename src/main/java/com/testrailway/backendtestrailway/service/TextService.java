package com.testrailway.backendtestrailway.service;

import com.testrailway.backendtestrailway.domain.TextEntity;
import com.testrailway.backendtestrailway.repository.TextRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TextService {

    private final TextRepository repo;

    public TextService(TextRepository repo) {
        this.repo = repo;
    }

    public TextEntity saveText(String text) {
        TextEntity e = new TextEntity(text);
        return repo.save(e);
    }

    public List<TextEntity> listAll() {
        return repo.findAll();
    }
}
