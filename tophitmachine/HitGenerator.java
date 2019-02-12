package com.tophitmachine;

public interface HitGenerator {

  Song generateBestSongEver();

  Song generateSongWithHitMeasure(int hitMeasure);

  Song generateBestSongForGenre(Genre genre);

  Song generateHitSongForSubject(Subject subject);
}
