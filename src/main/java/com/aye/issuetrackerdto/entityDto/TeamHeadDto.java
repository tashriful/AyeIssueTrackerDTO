package com.aye.issuetrackerdto.entityDto;

public class TeamHeadDto {

    private Long id;
    private Long userId;
    private  String userName;
    private Long teamId;
    private String teamName;

    public TeamHeadDto() {
    }

    public TeamHeadDto(Long id, Long userId, String userName, Long teamId, String teamName) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "TeamHeadDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
