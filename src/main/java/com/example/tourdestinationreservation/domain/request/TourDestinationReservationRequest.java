package com.example.tourdestinationreservation.domain.request;

import com.example.tourdestinationreservation.domain.entity.TourDestinationReservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TourDestinationReservationRequest {
    private String tourDestinationId;
    private String userId;
    private String userName;
    private String userPhoneNumber;
    private Integer payment;
    public TourDestinationReservation toEntity()
    {
        return TourDestinationReservation
                .builder()
                .tourDestinationId(tourDestinationId)
                .payment(payment)
                .userName(userName)
                .userPhoneNumber(userPhoneNumber)
                .userId(userId)
                .build();
    }
}
