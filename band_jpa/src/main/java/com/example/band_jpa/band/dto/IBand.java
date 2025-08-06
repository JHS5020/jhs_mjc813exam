package com.example.band_jpa.band.dto;

import lombok.Generated;

public interface IBand {

    public Long getId() ;


    public String getName() ;


    public String getLeader() ;


    public String getGuitarFirst() ;


    public String getGuitarSecond() ;


    public String getDrum();


    public String getBass() ;


    public String getKeyboard();


    public String getVocal();


    public void setId(final Long id);


    public void setName(final String name);


    public void setLeader(final String leader);


    public void setGuitarFirst(final String guitarFirst);


    public void setGuitarSecond(final String guitarSecond);


    public void setDrum(final String drum);


    public void setBass(final String bass);


    public void setKeyboard(final String keyboard);


    public void setVocal(final String vocal);

    
}
