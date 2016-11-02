package de.hackerstolz.berlin.mobility.hacks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public class MobilityHacksStats {

    @JsonProperty("lastUpdateTime")
    public Instant lastUpdateTime = Instant.now();

    @JsonProperty("totalSoldTickets")
    public Long totalSoldTickets = 0L;

    @JsonProperty("soldTicketsToday")
    public Long soldTicketsToday = 0L;

    @JsonProperty("soldTicketsLastHour")
    public Long soldTicketsLastHour = 0L;

    @JsonProperty("totalSoldTicketsDeveloper")
    public Long totalSoldTicketsDeveloper = 0L;

    @JsonProperty("maxTicketsDeveloper")
    public Long maxTicketsDeveloper = 70L;

    @JsonProperty("totalSoldTicketsDesigner")
    public Long totalSoldTicketsDesigner = 0L;

    @JsonProperty("maxTicketsDesigner")
    public Long maxTicketsDesigner = 20L;

    @JsonProperty("totalSoldTicketsAstronaut")
    public Long totalSoldTicketsAstronaut = 0L;

    @JsonProperty("maxTicketsAstronaut")
    public Long maxTicketsAstronaut = 10L;

    @JsonProperty("daysUntilHackathon")
    public Long daysUntilHackathon = (1480633200000L - System.currentTimeMillis()) / 1000 / 60 / 60 / 24;

    @JsonProperty("facebookNumberInterested")
    public Long facebookNumberInterested = 0L;

    @JsonProperty("facebookNumberGoing")
    public Long facebookNumberGoing = 0L;
}
