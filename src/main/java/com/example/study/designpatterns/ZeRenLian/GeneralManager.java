package com.example.study.designpatterns.ZeRenLian;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 30){
            System.out.println(request.getEmpName() + "因为" + request.getReason() + "请假" + request.getLeaveDays() + "天！");
            System.out.println("总经理" + this.name + "审批通过！");
        }else{
            System.out.println("请假" + request.getLeaveDays() + "天过多！");
        }
    }
}
