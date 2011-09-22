/*
 * Copyright (c) 2005 Aetrion LLC.
 */
package com.gmail.yuyang226.flickr.photos;


/**
 * @author Anthony Eden
 */
public class PhotoContext {
	public static final long serialVersionUID = 12L;

    private Photo previousPhoto;
    private Photo nextPhoto;

    public PhotoContext() {

    }

    public Photo getPreviousPhoto() {
        return previousPhoto;
    }

    public void setPreviousPhoto(Photo previousPhoto) {
        this.previousPhoto = previousPhoto;
    }

    public Photo getNextPhoto() {
        return nextPhoto;
    }

    public void setNextPhoto(Photo nextPhoto) {
        this.nextPhoto = nextPhoto;
    }

}
