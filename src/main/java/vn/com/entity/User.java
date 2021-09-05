package vn.com.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "usersid")
    private long usersId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dob")
    private Date dtOfBth;

    @Column(name = "fnm")
    private String fNm;

    @Column(name = "lnm")
    private String lNm;
}
