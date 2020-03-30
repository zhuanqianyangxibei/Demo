package com.kuang.test;

import com.sun.javaws.jnl.ExtDownloadDesc;

public class Demo {
    public static void main(String[] args) {
        int teamNum = 99;
        int arr[]=new int[99];
        System.out.println(arr.toString());
        int totalGamesNum = playAGame(teamNum);
        System.out.println(teamNum/1);
        System.out.println("当" + teamNum + "只球队参加比赛时，总共需要进行" +
                totalGamesNum + "场比赛");
        System.out.println(teamNum/1);

    }

    public static Integer playAGame(Integer teamNum) {
        for (int i = 1; i <=99 ; i++) {
            if (teamNum%2==0){//偶数
                //System.out.println(i);
            }else if(teamNum%2!=0){//奇数

            }

        }
        return 1;
    }
}
