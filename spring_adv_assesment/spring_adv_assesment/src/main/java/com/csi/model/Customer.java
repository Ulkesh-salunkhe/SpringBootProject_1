package com.csi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue

    private int custId;

    private String custName;

    private String custAddress;

    private long custContactNo;

    private int custAge;

    private String custEmailId;

    private String custPass;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dob;
}
