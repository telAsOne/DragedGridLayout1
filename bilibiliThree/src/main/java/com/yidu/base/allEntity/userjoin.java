package com.yidu.base.allEntity;

public class userjoin {
    private Integer id;

    private Integer joinfrom;

    private Integer jointo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJoinfrom() {
        return joinfrom;
    }

    public void setJoinfrom(Integer joinfrom) {
        this.joinfrom = joinfrom;
    }

    public Integer getJointo() {
        return jointo;
    }

    public void setJointo(Integer jointo) {
        this.jointo = jointo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", joinfrom=").append(joinfrom);
        sb.append(", jointo=").append(jointo);
        sb.append("]");
        return sb.toString();
    }
}