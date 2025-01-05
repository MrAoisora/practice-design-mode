package com.demo.design.行为型设计模式.策略模式;


import org.junit.Test;

import java.util.Scanner;

/**
 * @Author: Aoisora
 * @Date: 2025-01-04-19:02
 * @Description:
 * @Version 1.0 （版本号）
 */
public class ContextTest {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入您的的选项:1.加法 2.乘法 3.退出");
            final String input = scanner.nextLine();
            if("3".equals(input)){
                System.out.println("系统退出成功!");
                return;
            }
            if(!"1".equals(input) && !"2".equals(input)){
                System.out.println("您输入的选项有误,请重新输入");
                continue;
            }


            Context context = null;
            switch (input){
                case "1":
                    context = new Context(new StrategyA());
                    break;
                case "2":
                    context = new Context(new StrategyB());
                    break;
            }

            System.out.println("请输入a的值");
            final int a = Integer.parseInt(scanner.nextLine());
            System.out.println("请输入b的值");
            final int b = Integer.parseInt(scanner.nextLine());

            System.out.println("得到结果为:" + context.request(a,b));

        }

    }


}