package com.projectlist.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "ordering_party")
    private String orderingParty;
    @Column(name = "products_impacted")
    private String productsImpacted;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "projects")
    private Set<Tasks> tasks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOrderingParty() {
        return orderingParty;
    }

    public void setOrderingParty(String orderingParty) {
        this.orderingParty = orderingParty;
    }

    public String getProductsImpacted() {
        return productsImpacted;
    }

    public void setProductsImpacted(String productsImpacted) {
        this.productsImpacted = productsImpacted;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
