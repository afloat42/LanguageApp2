package com.example.languageapp.model;

public class Word {

    //Default Translation for word
    private final String mDefaultTranslation;

    // French Translation for word
    private final String mFrenchTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    //Audio resource id for the word
    private final int mAudioResourceId;
    // create a new word object

    public Word(String defaultTranslation, String FrenchTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = FrenchTranslation;
        mAudioResourceId = audioResourceId;

    }

    public Word(String defaultTranslation, String FrenchTranslation, int imageResourceId,int audioResourceId) {
                mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = FrenchTranslation;
                mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
            }

    // get the default translation of word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    // get the miwok translation for word
    public String getmMiwokTranslation() {
        return mFrenchTranslation;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
         * Returns whether or not there is an image for this word.
         */
     public boolean hasImage() {
               return mImageResourceId != NO_IMAGE_PROVIDED;
            }

            //return the audio resource id of the word

            public int getmAudioResourceId(){

                return mAudioResourceId;
            }
}


