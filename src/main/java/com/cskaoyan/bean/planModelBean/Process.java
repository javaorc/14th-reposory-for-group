package com.cskaoyan.bean.planModelBean;

public class Process {
    private String  processId;

    private String  technologyPlanId;

    private Integer sequence;

    private Integer quota;

    public Process() {
    }

    public Process(String processId, String technologyPlanId, Integer sequence, Integer quota) {
        this.processId = processId;
        this.technologyPlanId = technologyPlanId;
        this.sequence = sequence;
        this.quota = quota;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getTechnologyPlanId() {
        return technologyPlanId;
    }

    public void setTechnologyPlanId(String technologyPlanId) {
        this.technologyPlanId = technologyPlanId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "Process{" +
                "processId='" + processId + '\'' +
                ", technologyPlanId='" + technologyPlanId + '\'' +
                ", sequence=" + sequence +
                ", quota=" + quota +
                '}';
    }
}