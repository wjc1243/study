package com.example.study.designpatterns.ZeRenLian;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 3){
            System.out.println(request.getEmpName() + "因为" + request.getReason() + "请假" + request.getLeaveDays() + "天！");
            System.out.println("主任" + this.name + "审批通过！");
        }else{
            if(this.nextLeader != null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
