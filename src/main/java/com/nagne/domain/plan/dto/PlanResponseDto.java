package com.nagne.domain.plan.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PlanResponseDto {
    private String subject;
    private List<DayPlan> dayPlans;

    @Getter
    @Builder
    public static class DayPlan {
        private int day;
        private List<PlaceVisit> placeVisits;
    }

    @Getter
    @Builder
    public static class PlaceVisit {
        private Long placeId;
        private int order;
        private int moveTime;
        private String placeSummary;
        private String reasoning;
    }
}