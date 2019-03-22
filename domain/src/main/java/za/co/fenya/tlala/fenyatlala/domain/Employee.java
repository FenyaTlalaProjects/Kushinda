package za.co.fenya.tlala.fenyatlala.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name = "id")
    private Long id;
}
