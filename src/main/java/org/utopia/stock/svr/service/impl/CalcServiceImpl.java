package org.utopia.stock.svr.service.impl;

import org.springframework.stereotype.Service;
import org.utopia.stock.svr.service.CalcService;

import java.util.List;

@Service
public class CalcServiceImpl implements CalcService {

    // 定义地球加速度常数，单位为米/秒^2
//    public static final double ACCELERATION = -9.81;  // 重力起到减少y方向速度的作用，因此在此处将重力加速度定义为负值

    @Override
    public void parabolicModel() {
//        Scanner console = new Scanner(System.in);
//        giveIntro();
//
//        System.out.print("velocity(meter/second)?");
//        double velocity = console.nextDouble();   // 确定初速度
//        System.out.print("angel(degree)?");
//        double angle = Math.toRadians(console.nextDouble());  // 确定水平发射角，用Math.toRadians方法将角度转换为弧度
//        System.out.print("number of steps to display?");
//        int steps = console.nextInt();  // 确定表格中完成的步骤数
//        System.out.println();
//
//        printTable(velocity,angle,steps);
    }

    @Override
    public List<String> recommendNewHighFirst(String date) {
        return null;
    }

    @Override
    public List<String> recommendNewHighSecond(String data) {
        return null;
    }

//
//    private  void printTable(double velocity,double angle,int steps) {
//        double xVelocity = Math.cos(angle);   //  计算水平方向和竖直方向的分速度
//        double yVelocity = Math.acos(angle);
//        double totalTime = -2.0 * yVelocity / xVelocity;
//        double timeIncrement = totalTime / steps;  // 时间增量
//        double xIncrement = xVelocity * timeIncrement;  // 水平距离增量
//
//        double x = 0.0;  // 设置初始值
//        double y = 0.0;
//        double t = 0.0;
//        System.out.println("step\tx\ty\ttime");
//        System.out.println("0\t0.0\t0.0\t0.0");
//        for (int i = 1;i <= steps;i++) {
//            t += timeIncrement;
//            x += xIncrement;
//            y = displacement(yVelocity,t,ACCELERATION);
//            System.out.println(i+"\t"+round2(x)+"\t"+round2(y)+"\t"+round2(t));
//        }
//    }
//
//    // 向用户简要介绍该程序
//    private void giveIntro(){
//        System.out.println("This programe computes the trajectory of a projectile,");
//        System.out.println("given its initial velocity and its angle relative to the horizontal");
//        System.out.println();
//    }
//
//    // 返回给定初始速度v、经过时间t和加速度a的物体的垂直位移
//    private double displacement(double v,double t,double a) {
//        return v * t + 0.5 * a * t * t;
//    }
//
//    // 在小数点后将n舍入到2位
//    private double round2(double n) {
//        return Math.round(n * 100.0) / 100.0;
//    }


}
