package com.squirecircle.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Squirecircle.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private final Twilio twilio= new Twilio();
    public final AmazonS3 amazonS3= new AmazonS3();

    public AmazonS3 getAmazonS3() {
        return amazonS3;
    }

    public Twilio getTwilio() {
        return twilio;
    }

    public static class Twilio{

        private String sendURL;
        private String verifyURL;
        private String key;
        private String twilioAccountSid;

        private String twilioAuthToken;

        private String twilioSmsNumber;

        private String messageURL;

        private String twilioLocale;

        private String twilioServiceURL;

        private String twilioTextChatServiceId;

        public String getTwilioLocale() {
            return twilioLocale;
        }

        public void setTwilioLocale(String twilioLocale) {
            this.twilioLocale = twilioLocale;
        }

        public String getTwilioAccountSid() {
            return twilioAccountSid;
        }

        public void setTwilioAccountSid(String twilioAccountSid) {
            this.twilioAccountSid = twilioAccountSid;
        }

        public String getTwilioAuthToken() {
            return twilioAuthToken;
        }

        public void setTwilioAuthToken(String twilioAuthToken) {
            this.twilioAuthToken = twilioAuthToken;
        }

        public String getTwilioSmsNumber() {
            return twilioSmsNumber;
        }

        public void setTwilioSmsNumber(String twilioSmsNumber) {
            this.twilioSmsNumber = twilioSmsNumber;
        }

        public String getMessageURL() {
            return messageURL;
        }

        public void setMessageURL(String messageURL) {
            this.messageURL = messageURL;
        }

        public String getSendURL() {
            return sendURL;
        }

        public void setSendURL(String sendURL) {
            this.sendURL = sendURL;
        }

        public String getVerifyURL() {
            return verifyURL;
        }

        public void setVerifyURL(String verifyURL) {
            this.verifyURL = verifyURL;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getTwilioTextChatServiceId() { return twilioTextChatServiceId; }

        public void setTwilioTextChatServiceId(String twilioTextChatServiceId) { this.twilioTextChatServiceId = twilioTextChatServiceId; }

        public String getTwilioServiceURL() { return twilioServiceURL; }

        public void setTwilioServiceURL(String twilioServiceURL) { this.twilioServiceURL = twilioServiceURL; }
    }

    public static class AmazonS3{
        private String accessKey;

        private String secretKey;

        private String bucketName;

        private String imageKeyFolder;

        private String resourceUrl;

        public String getResourceUrl() {
            return resourceUrl;
        }

        public void setResourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public String getBucketName() {
            return bucketName;
        }

        public void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        public String getImageKeyFolder() {
            return imageKeyFolder;
        }

        public void setImageKeyFolder(String imageKeyFolder) {
            this.imageKeyFolder = imageKeyFolder;
        }
    }
}
