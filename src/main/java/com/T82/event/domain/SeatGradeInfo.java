package com.T82.event.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Entity
@Table(name = "Seat_Grade_Infos")
@Data
@Builder
public class SeatGradeInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seatGradeId")
    private Long seatGradeId;

    @Column(name = "price")
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sectionId", nullable = false)
    private Section section;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventInfoId", nullable = false)
    private EventInfo eventInfo;


}