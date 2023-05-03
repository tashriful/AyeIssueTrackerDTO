package com.aye.issuetrackerdto.entityDto;

import org.springframework.web.multipart.MultipartFile;

public class TestDto {

    private Long id;
    private String summary;
    private String description;
    private MultipartFile file;
    private Long createdById;

    public TestDto() {
    }

    public TestDto(Long id, String summary, String description, MultipartFile file, Long createdById) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.file = file;
        this.createdById = createdById;
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

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", file=" + file +
                ", createdById=" + createdById +
                '}';
    }
}
