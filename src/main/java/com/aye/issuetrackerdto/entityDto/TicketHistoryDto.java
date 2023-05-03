package com.aye.issuetrackerdto.entityDto;

import java.time.LocalDate;

public class TicketHistoryDto {

    private Long id;
    private Long ticketId;
    private Long assignedById;
    private Long assignedToId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String prevStatus;

    public TicketHistoryDto() {
    }

    public TicketHistoryDto(Long id, Long ticketId, Long assignedById, Long assignedToId, LocalDate startDate, LocalDate endDate, String prevStatus) {
        this.id = id;
        this.ticketId = ticketId;
        this.assignedById = assignedById;
        this.assignedToId = assignedToId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.prevStatus = prevStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getAssignedById() {
        return assignedById;
    }

    public void setAssignedById(Long assignedById) {
        this.assignedById = assignedById;
    }

    public Long getAssignedToId() {
        return assignedToId;
    }

    public void setAssignedToId(Long assignedToId) {
        this.assignedToId = assignedToId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getPrevStatus() {
        return prevStatus;
    }

    public void setPrevStatus(String prevStatus) {
        this.prevStatus = prevStatus;
    }

    @Override
    public String toString() {
        return "TicketHistoryDto{" +
                "id=" + id +
                ", ticketId=" + ticketId +
                ", assignedById=" + assignedById +
                ", assignedToId=" + assignedToId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", prevStatus='" + prevStatus + '\'' +
                '}';
    }
}
