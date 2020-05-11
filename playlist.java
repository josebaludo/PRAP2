package com.example.agendiario;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "playlist")



public class Playlist {


    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "playlistId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "playlistTitle")
    private String mTitle;

    private Int mSinger;

    public Playlist(@Nullable String title, String singer, int score, String creationDate) {
        mTitle = título;
        mSinger = cantor;
        mScore = pontuação;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mtitle = título;
    }

    public String getSinger() {
        return mSinger;
    }

    public void setSinger (String singer) {
        mSinger = cantor;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore (int score) {
        mScore = pontuação;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;

}
