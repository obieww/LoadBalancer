package com.LoadBalance;

import java.util.Objects;

public class Like {
    private long likeId;
    private User user;

    public Like(long likeId, User user) {
        this.likeId = likeId;
        this.user = user;
    }

    public long getLikeId() {
        return likeId;
    }

    public void setLikeId(long likeId) {
        this.likeId = likeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Like like = (Like) o;
        return getLikeId() == like.getLikeId() &&
                Objects.equals(getUser(), like.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLikeId(), getUser());
    }

    @Override
    public String toString() {
        return "Like{" +
                "likeId=" + likeId +
                ", user=" + user +
                '}';
    }
}
