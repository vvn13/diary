package com.vvn13.diary2.service;

import com.vvn13.diary2.model.ModelsLink;
import com.vvn13.diary2.repository.ModelsLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelsLinkService {

    @Autowired
    private final ModelsLinkRepository modelsLinkRepository;

    public ModelsLinkService(ModelsLinkRepository modelsLinkRepository){
        this.modelsLinkRepository = modelsLinkRepository;
    }

    public void createModelsLink(ModelsLink modelsLink){modelsLinkRepository.save(modelsLink);}
}
