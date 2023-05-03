package com.aye.issuetrackerdto.entityDto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TicketDto {

    private Long id;
    private String summary;
    private String description;

    private MultipartFile file;
    private String fileId;

    private String filename;
    private String contentType;
    private long size;
    private byte[] content;
    private Long createdById;

    private Long assignedById;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdDateTime;
    private Long departmentId;
    private String departmentName;
    private Long teamId;
    private String teamName;
    private String departmentHeadName;
    private Long departmentHeadId;
    private String teamHeadName;
    private Long teamHeadId;
    private String ticketType;
    private Long assignedToUser;
    private String priority;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate targetResolutionDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate actualResolutionDate;
    private String resolutionSummary;

    public TicketDto() {
    }

    public TicketDto(Long id, String summary, String description, MultipartFile file, String fileId, String filename, String contentType, long size, byte[] content, Long createdById, Long assignedById, LocalDateTime createdDateTime, Long departmentId, String departmentName, Long teamId, String teamName, String departmentHeadName, Long departmentHeadId, String teamHeadName, Long teamHeadId, String ticketType, Long assignedToUser, String priority, String status, LocalDate targetResolutionDate, LocalDate actualResolutionDate, String resolutionSummary) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.file = file;
        this.fileId = fileId;
        this.filename = filename;
        this.contentType = contentType;
        this.size = size;
        this.content = content;
        this.createdById = createdById;
        this.assignedById = assignedById;
        this.createdDateTime = createdDateTime;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.teamId = teamId;
        this.teamName = teamName;
        this.departmentHeadName = departmentHeadName;
        this.departmentHeadId = departmentHeadId;
        this.teamHeadName = teamHeadName;
        this.teamHeadId = teamHeadId;
        this.ticketType = ticketType;
        this.assignedToUser = assignedToUser;
        this.priority = priority;
        this.status = status;
        this.targetResolutionDate = targetResolutionDate;
        this.actualResolutionDate = actualResolutionDate;
        this.resolutionSummary = resolutionSummary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    public Long getAssignedById() {
        return assignedById;
    }

    public void setAssignedById(Long assignedById) {
        this.assignedById = assignedById;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
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

    public String getDepartmentHeadName() {
        return departmentHeadName;
    }

    public void setDepartmentHeadName(String departmentHeadName) {
        this.departmentHeadName = departmentHeadName;
    }

    public Long getDepartmentHeadId() {
        return departmentHeadId;
    }

    public void setDepartmentHeadId(Long departmentHeadId) {
        this.departmentHeadId = departmentHeadId;
    }

    public String getTeamHeadName() {
        return teamHeadName;
    }

    public void setTeamHeadName(String teamHeadName) {
        this.teamHeadName = teamHeadName;
    }

    public Long getTeamHeadId() {
        return teamHeadId;
    }

    public void setTeamHeadId(Long teamHeadId) {
        this.teamHeadId = teamHeadId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public Long getAssignedToUser() {
        return assignedToUser;
    }

    public void setAssignedToUser(Long assignedToUser) {
        this.assignedToUser = assignedToUser;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getTargetResolutionDate() {
        return targetResolutionDate;
    }

    public void setTargetResolutionDate(LocalDate targetResolutionDate) {
        this.targetResolutionDate = targetResolutionDate;
    }

    public LocalDate getActualResolutionDate() {
        return actualResolutionDate;
    }

    public void setActualResolutionDate(LocalDate actualResolutionDate) {
        this.actualResolutionDate = actualResolutionDate;
    }

    public String getResolutionSummary() {
        return resolutionSummary;
    }

    public void setResolutionSummary(String resolutionSummary) {
        this.resolutionSummary = resolutionSummary;
    }

    @Override
    public String toString() {
        return "TicketDto{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", file=" + file +
                ", fileId='" + fileId + '\'' +
                ", filename='" + filename + '\'' +
                ", contentType='" + contentType + '\'' +
                ", size=" + size +
                ", content=" + Arrays.toString(content) +
                ", createdById=" + createdById +
                ", assignedById=" + assignedById +
                ", createdDateTime=" + createdDateTime +
                ", departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", departmentHeadName='" + departmentHeadName + '\'' +
                ", departmentHeadId=" + departmentHeadId +
                ", teamHeadName='" + teamHeadName + '\'' +
                ", teamHeadId=" + teamHeadId +
                ", ticketType='" + ticketType + '\'' +
                ", assignedToUser=" + assignedToUser +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                ", targetResolutionDate=" + targetResolutionDate +
                ", actualResolutionDate=" + actualResolutionDate +
                ", resolutionSummary='" + resolutionSummary + '\'' +
                '}';
    }
}