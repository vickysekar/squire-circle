package com.squirecircle.domain;

import com.squirecircle.config.Constants;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Valid;

import java.math.BigDecimal;

import static com.squirecircle.config.Constants.*;

@Entity
@Table(name = "balance_sheet")
@Data
@NoArgsConstructor
@Valid
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;

    private String propertyName;

    private PropertType propertType;

    private RentalType rentalType;

    private BigDecimal rentAmt;

    private BigDecimal leaseAmt;

    private BigDecimal securityDep;

    private boolean inMortgage;

    private String latitude;

    private String longitude;
}
