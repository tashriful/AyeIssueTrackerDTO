package com.aye.issuetrackerdto.entityDto;

public class DepartmentHeadDto {
    private Long id;
    private Long userId;
    private String userName;
    private Long departmentId;
    private String departmentName;


    public DepartmentHeadDto() {
    }

    public DepartmentHeadDto(Long id, Long userId, String userName, Long departmentId, String departmentName) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
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

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentHeadDto{" +
                "id=" + id +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
