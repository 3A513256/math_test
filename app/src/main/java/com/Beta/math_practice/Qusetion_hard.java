package com.Beta.math_practice;

public class Qusetion_hard {

    public String mQuestions[] = {
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
            "求出圓的直徑和半徑：圓周長81.64公分（圓周率以3.14計算）",
            "下列哪一項敘述錯誤？",
            "有一個三角柱體，底面積不變，高變為原高的2倍，則體積變為原來體積的多少倍？",
            "文聖國小的學生人數中，男生有500人，女生人數是男生人數的0.8倍，文聖國小共有多少位學生？",
            "將48質因數分解：48=(  )",
            "10以下的質數有(  )個，這幾個質數的和是(  )。",
            "下列哪個選項，其比值與7：3的比值不同？",
    };

    private String mChoices[][] = {
            {"(A)1663", "(B)1683", "(C)5167", "(D)5177"},
            {"(A)422", "(B)432", "(C)522", "(D)532"},
            {"(A)0.78公里", "(B)1.04公里", "(C)3.12公里", "(D)3.15公里"},
            {"(A)1060", "(B)1070", "(C)10600", "(D)10700"},
            {"(A)A×B+C＝D", "(B) C×B+A＝D", "(C)C×B+D＝A", "(D)D×C+B＝A"},
            {"(A)可以是銳角", "(B)可以是直角", "(C)可以是鈍角", "(D)可以是平角"},
            {"(A)5090000000", "(B)509000000", "(C)50900000", "(D)5090000"},
            {"(A)38分30秒", "(B)40分20秒", "(C)40分30秒", "(D)45分10秒"},
            {"(A)1.100", "(B)5.230", "(C)3.330", "(D)5.0001"},
            {"(A)15和8的公倍數", "(B)15和8的公因數", "(C)23的倍數", "(D)23的因數"},
            {"(A)816", "(B)4080", "(C)5080", "(D)5800"},
            {"(A)直徑：24；半徑：12", "(B)直徑：26；半徑：12", "(C)直徑：26；半徑：13", "(D)直徑：28；半徑：14公分"},
            {"(A)正方體體積＝邊長×邊長×邊長", "(B)三角柱體積＝ ½x底面積x高", "(C)長方體體積＝長x寬x高", "(D)底面為平行四邊形的四角柱，體積=底面積x柱高"},
            {"(A)2", "(B)3", "(C)4", "(D)8倍"},
            {"(A)400", "(B)800", "(C)900", "(D)1200位"},
            {"(A)2x2x2x2x3", "(B)2x2x2x3x3", "(C)2x2x3x3x3", "(D)2x4x3x3"},
            {"(A)3/10", "(B)4/17", "(C)4/18", "(D)5/25"},
            {"(A)21：9", "(B)91：39", "(C)3.5：1.5", "(D)⅐：⅓"},
    };

    private String mCorrectAnswers[] = {
            "(C)5167",
            "(A)422",
            "(C)3.12公里",
            "(D)10700",
            "(C)C×B+D＝A",
            "(A)可以是銳角",
            "(B)509000000",
            "(C)40分30秒",
            "(D)5.0001",
            "(A)15和8的公倍數",
            "(B)4080",
            "(C)直徑：26；半徑：13公分",
            "(B)三角柱體積＝ ½x底面積x高",
            "(A)2倍",
            "(C)900位",
            "(A)2x2x2x2x3",
            "(B)4/17",
            "(D)⅐：⅓",
    };

    private String mtip[] = {
            "基礎提示：被減數數字最大",
            "基礎提示：578是花掉的錢",
            "基礎提示：一邊是0.26公里， 一圈有4個邊",
            "基礎提示：1個50=50元；2個50=100元；3個50=150元…",
            "基礎提示：餘數是要加回來的",
            "基礎提示：要小於90度",
            "基礎提示：1公尺=100公分",
            "基礎提示：1分鐘=60秒",
            "基礎提示：後面可以省略",
            "基礎提示：總人數可以整除15和8",
            "基礎提示：先算出一個的體積，再乘17",
            "基礎提示：先算出直徑是多少",
            "基礎提示：算出底面積，再x高，就是正確的",
            "基礎提示：「底面積不變」",
            "基礎提示：女生比男生多",
            "基礎提示：拆解出來的數字不能再除了",
            "基礎提示：10以下的質數有5個以下",
            "基礎提示：看看哪個選項沒有乘或除相同的數",
    };

    private String mprompt[] = {
            "進階提示：3425+1742=？",
            "進階提示：1000-578=？",
            "進階提示：0.26x4=1.04→一圈。跑了3圈，所以1.04x3=？",
            "進階提示：50 x214=？",
            "進階提示：A是被除數；B是除數；C是商：D是餘數",
            "進階提示：大於90度是鈍角，那小於90度是？",
            "進階提示：1立方公尺=100 x100 x100立方公分",
            "進階提示：一個人有90秒，27人總共有2430秒",
            "進階提示：中間不能省略",
            "進階提示：找15和8共同的倍數",
            "進階提示：全部數字相乘",
            "進階提示：81.64÷3.14=26=直徑",
            "進階提示：三角形的底面積=底x高÷2",
            "進階提示：底面積不變，高多多少倍，體積就多多少倍",
            "進階提示：記得，總人數=女生人數+男生人數",
            "進階提示：2是質數；3是質數",
            "進階提示：4個，哪4個呢？",
            "進階提示：分數",
    };

    public String gettip(int a) {
        String tip = mtip[a];
        return tip;
    }

    public String getprompt(int a) {
        String prompt = mprompt[a];
        return prompt;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }


    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}