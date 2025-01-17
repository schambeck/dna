package com.schambeck.dna.web.client;

import java.util.UUID;

public class Notification {

    private UUID id;
    private final TypeNotification type;
    private final String title;
    private final String message;
    private final String link;

    public Notification() {
        this(null, null, null, null);
    }

    public Notification(TypeNotification type, String title, String message, String link) {
        this.type = type;
        this.title = title;
        this.message = message;
        this.link = link;
    }

    public UUID getId() {
        return id;
    }

    public TypeNotification getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", link='" + link + '\'' +
                '}';
    }

}
