package com.codecool.oopws3;

public class FeedException extends Exception{

    private FeedExceptionCode feedExceptionCode;

    public FeedException(FeedExceptionCode feedExceptionCode) {
        this.feedExceptionCode = feedExceptionCode;
    }

    public FeedException(String message, FeedExceptionCode feedExceptionCode) {
        super(message);
        this.feedExceptionCode = feedExceptionCode;
    }

    @Override
    public String toString() {
        return "FeedException{" +
                "feedExceptionCode=" + feedExceptionCode +
                '}';
    }
}
