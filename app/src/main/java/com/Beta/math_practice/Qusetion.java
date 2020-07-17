package com.Beta.math_practice;

public class Qusetion {

    public String mQuestions[] = {
            "分針走了45分鐘，旋轉了幾度？",
            "0.772乘以下面哪個數的積最“小”？",
            "小呆家一星期共吃掉1又5分之2的米，平均一天吃掉幾公斤米？",
            "圓心角90度=幾分之幾圓？",
            "紅絲帶2.6公尺，黃絲帶比紅絲帶長1.4倍又長0.75公尺，黃絲帶的長度多少公尺？",
            "1平方公里=＿＿＿平方公尺",
            "麵包店有Ｙ個麵包，每5個裝成一袋，剛好可以裝成35袋，麵包店有幾個麵包？\n" + "代入以下算試。",
            "同一樣關卡，定價[打七折]和[70%off]，哪樣比較便宜？",
            "下列哪個選項是9*Ｙ=108等式的答案？",
            "阿原有X元的存款，後來又存入2365元，存款裡總共有6850元，阿原原來有多少錢？",
            "鞋店全館一律打九折，若是會員再折七折，小雅是會員，買了一雙1500的鞋，請問比定價便宜多少元？"
    };

    private String mChoices[][] = {

            {"(A)90度", "(B)180度", "(C)270度", "(D)360度"},
            {"(A)0.772", "(B)1", "(C)1.6", "(D)0.8"},
            {"(A)五分之一", "(B)五分之二", "(C)五分之三", "(D)五分之四"},
            {"(A)四分之一", "(B)四分之二", "(C)四分之三", "(D)四分之四"},
            {"(A)3.64", "(B)3.35", "(C)4.39", "(D)4.69"},
            {"(A)100*100", "(B)1000*100", "(C)1000*1000", "(D)1000*10000"},
            {"(A)Y+5=35", "(B)Y/5=35", "(C)35*Y=5", "(D)35/Y=5"},
            {"(A)打七折", "(B)70%off", "(C)一樣便宜", "(D)無法比較"},
            {"(A)972", "(B)99", "(C)117", "(D)12"},
            {"(A)4515", "(B)4385", "(C)4615", "(D)4485"},
            {"(A)333", "(B)444", "(C)555", "(D)666"},
    };

    private String mCorrectAnswers[] = {"(C)270度", "(A)0.772", "(A)五分之一", "(A)四分之一", "(C)4.39", "(C)1000*1000"
            , "(B)Y/5=35", "(B)70%off", "(D)12", "(D)4485", "(B)444"};

    private String mtip[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
    };

    private String mprompt[] = {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19"
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
