package com.example.android.miwok;

/**
 * Created by Maninder on 7/23/2016.
 */
public class Word {

    public Word(String miwokTranslation, String defaultTranslation,int audioResourceId){
        mMiwokTranslation =  miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = 0;
        mAudioResourceId = audioResourceId;
    }
    public Word(String miwokTranslation, String defaultTranslation,int ImageResourceId, int audioResourceId){
        mMiwokTranslation =  miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;

    /**
     * Get the miwok translation of the word
     * @return a String that represents the miwok translation
     */
    public String getMiwokTranslation(){return mMiwokTranslation;}

    /**
     * Get the default transltion of the word
     * @return a String that represents the default translation
     */
    public String getDefaultTranslation(){return mDefaultTranslation;}
    /**
     * Get the image that is associated with each word/phrase
     * @return an int that represents the image resource ID
     */
    public int getImageResourceId(){return mImageResourceId;}
    /**
     * Get the audio track that is associated with each word/phrase
     * @return an int that represents the audio resource ID
     */
    public int getAudioResourceId(){return mAudioResourceId;}
}
