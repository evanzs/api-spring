package com.api.spring.apispring.models;

public final class ResponseContent {
    
    private final long  id;
    private final String content;

   public ResponseContent(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
