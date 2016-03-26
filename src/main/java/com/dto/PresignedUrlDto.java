package com.dto;

/**
 * Created by aautushk on 12/16/2015.
 */
public class PresignedUrlDto {
    private String initialS3ObjectKey;
    private String presignedUrl;

    public String getInitialS3ObjectKey() {
        return initialS3ObjectKey;
    }

    public void setInitialS3ObjectKey(String initialS3ObjectKey) {
        this.initialS3ObjectKey = initialS3ObjectKey;
    }

    public String getPresignedUrl() {
        return presignedUrl;
    }

    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }
}
