package com.example.band_jpa.band.service;

import com.example.band_jpa.band.dto.BandDto;
import com.example.band_jpa.band.dto.BandEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BandService {
    @Autowired
    private BandRepository bandRepository;

    public BandEntity insert(BandDto dto){
        BandEntity band = new BandEntity(null
                ,dto.getName()
                ,dto.getLeader()
                ,dto.getGuitarFirst()
                ,dto.getGuitarSecond()
                ,dto.getDrum()
                ,dto.getBass()
                ,dto.getKeyboard()
                ,dto.getVocal());
        this.bandRepository.save(band);
        return band;
    }

    public void update(BandEntity obj){
        this.bandRepository.save(obj);
        this.bandRepository.flush();
    }

    public void delete(Long id){

    }
}
