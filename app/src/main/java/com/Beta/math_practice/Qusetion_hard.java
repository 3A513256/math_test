package com.Beta.math_practice;

public class Qusetion_hard{

    public String mQuestions1[] = {
            "(     ) -1742=3425？",
            "李阿姨買了一個578元的書包要送給兒子當生日禮物，付1000元鈔票，要找多少錢？",
            "為了訓練體能，小花的哥哥每天在正方形的公園練習跑步，公園每一邊是 0.26 公里，請問每天跑 3 圈，共跑幾公里？",
            "學校要準備園遊會後讓人兌換的50元硬幣214個，是多少元？",
            "除法中，用來檢驗答案對不對的方法叫作「驗算」。如算式:A÷B＝C…D 要如何驗算？",
            "關於等腰三角形的底角，下列何者正確？",
            "509 立方公尺是多少立方公分？",
            "密室逃脫活動總共有三關，依照人數給予闖關時間。如果一個人有1分30秒，全班有27人，總共有幾分幾秒可以闖關？",
            "下列哪一個小數的0不能省略？",
            "歡樂歌唱班的同學15個一數或8個一數都能數完，則歡樂歌唱班的總人數會是？",
            "有一些平行四邊形積木，底面的長6公分、高8公分，寬是5公分的，子涵疊了17個，疊起來的體積是幾立方公分",
    };
    private String mChoices1[][] = {
            {"(A)1663", "(B)1683", "(C)5167", "(D)5177"},
            {"(A)422", "(B)432", "(C)522", "(D)532"},
            {"(A)0.78公里", "(B)1.04公里", "(C)3.12公里", "(D)3.15公里"},
            {"(A)1060", "(B)1070", "(C)10600", "(D)10700"},
            {"(A)A×B+C＝D","(B) C×B+A＝D","(C)C×B+D＝A","(D)D×C+B＝A"},
            {"(A)可以是銳角","(B)可以是直角","(C)可以是鈍角","(D)可以是平角"},
            {"(A)5090000000","(B)509000000","(C)50900000","(D)5090000"},
            {"(A)38分30秒","(B)40分20秒","(C)40分30秒","(D)45分10秒"},
            {"(A)1.100","(B)5.230","(C)3.330","(D)5.0001"},
            {"(A)15和8的公倍數","(B)15和8的公因數","(C)23的倍數","(D)23的因數"},
            {"(A)816","(B)4080","(C)5080","(D)5800"},
    };

    private String mCorrectAnswers1[] = {"(C)5167","(A)422","(C)3.12公里","(D)10700","(C)C×B＋D＝A","(A)可以是銳角"
            ,"(B)509000000","(C)40分30秒","(D)5.0001","(A)15和8的公倍數","(B)4080"};

    public String getQuestion(int a) {
        String question = mQuestions1[a];
        return  question;
    };

    public String getChoice1(int a) {
        String choice = mChoices1[a][0];
        return  choice;
    };

    public String getChoice2(int a) {
        String choice = mChoices1[a][1];
        return  choice;
    };

    public String getChoice3(int a) {
        String choice = mChoices1[a][2];
        return  choice;
    };

    public String getChoice4(int a) {
        String choice = mChoices1[a][3];
        return  choice;
    };

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers1[a];
        return answer;
    }
}