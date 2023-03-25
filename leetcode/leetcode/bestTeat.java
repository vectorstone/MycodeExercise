package com.atguigu.leetcode;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/23/2023 2:26 PM
 */
public class bestTeat {
    public static void main(String[] args) {
//[319776,611683,835240,602298,430007,574,142444,858606,734364,896074]
// [1,1,1,1,1,1,1,1,1,1]

        int[] scores = {4,5,6,5};
        int[] age = {2,1,2,1};

        //来测试下
        /*int[] scores = {319776,611683,835240,602298,430007,574,142444,858606,734364,896074};
        int[] age={1,1,1,1,1,1,1,1,1,1};*/
        System.out.println(bestTeamScore(scores, age));

    }

    public static int bestTeamScore(int[] scores,int[] age){
        //造个对象集合,把所有球员的分数和年龄绑定到一起
        player[] combination = new player[scores.length];
        for (int i = 0; i < scores.length; i++) {
            combination[i] = new player(scores[i],age[i]);
        }

        //接下来进行分数的遍历,遍历的结果放到新的数组中
        int[] result = new int[scores.length];
        for (int j = 0; j < scores.length; j++) {
            int sum = combination[j].getScore();
            for (int i = 0; i < combination.length; i++) {
                int x = combination[j].getAges();
                int y = combination[i].getAges();
                int x1 = combination[j].getScore();
                int y1 = combination[i].getScore();
                boolean d = x > y && x1 > y1;
                boolean p = x < y && x1 < y1;
                boolean q = x == y ;
                if(d || p || q){
                    sum += y1;
                }
            }
            result[j] = sum;
        }
        int max = result[0];
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]){
                max = result[i];
            }
        }



        return max;
    }


    public static class player{
        int score;
        int ages;

        public player() {
        }

        public player(int score, int ages) {
            this.score = score;
            this.ages = ages;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getAges() {
            return ages;
        }

        public void setAges(int ages) {
            this.ages = ages;
        }
    }

}
