package com.Beta.math_practice;

public class Qusetion_mid {

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
            "鞋店全館一律打九折，若是會員再折七折，小雅是會員，買了一雙1500的鞋，請問比定價便宜多少元？",
            "2＋2＋2＋2＋2＋2＝2×(  )＝(  )，框框裡分別要填什麼數字？",
            "2×3＝(  )＋(  )＋(  )＝(  ) ，框框裡分別要填什麼數字？",
            "5+4x3=？",
            "一張卡片 9 元。阿德有 45 元，他最多可以買幾張卡片？",
            "在除法算式「32÷9＝3…5」當中，哪一個位置的數是偶數？",
            "以下哪一個數是奇數？",
            "將一些積木分成 7 堆之後，每堆數量一樣多，而且積木剛好分完沒有剩下，這些積木可能有幾塊？",
            "一個除數為 6 的除法算式當中，餘數不可能是多少？",
            "一星期有 7 天。西元 2019 年是一個平年，請問西元 2019 年 2 月有幾個星期？",
            "以下哪一個是用概數表示的？",
            "若一個圓的半徑為10公分，試問此圓的圓周長為？",
            "有一個三角形，底邊常48公分，高30公分，它的 ⅙ 縮圖面積是多少？",
            "甲、乙兩地的實際距離是35公里，地圖上的距離是7公分。請問這張地圖的比例尺是多少？",
            "姐姐有95元，妹妹有89元，誰的錢夠買一個85元的鉛筆盒？",
            "2個百、12個十和7個一合起來是多少？",
            "50×600的乘積有幾個0？",
            "每邊長是5公分的正方形，面積是多少平方公分？",
            "把一些茶葉蛋平分分成9堆，每堆有36顆。如果把這些茶葉蛋平分分成36堆，每堆有多少顆？",
            "小萍的錢是小正的6倍，已知小萍有960元，兩人共有幾元？",
            "時針在鐘面上走2圈是經過多少時間？",
            "小螞蟻在數線上，從8.4的位置，先向左走了5，再向右走了7.8，小螞蟻停在哪一個數上？",
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
            {"(A)5/10", "(B)6/12", "(C)7/14", "(D)8/16"},
            {"(A)2/2/2/6", "(B)3/3/3/6", "(C)3/3/3/9", "(D)2/2/2/8"},
            {"(A)16", "(B)17", "(C)19", "(D)20"},
            {"(A)2張", "(B)3張", "(C)4張", "(D)5張"},
            {"(A)被除數", "(B)除數", "(C)商", "(D)餘數"},
            {"(A)32", "(B)40", "(C)53", "(D)76"},
            {"(A)33塊", "(B)35塊", "(C)37塊", "(D)39塊"},
            {"(A)0", "(B)4", "(C)5", "(D)6"},
            {"(A)4", "(B)5", "(C)6", "(D)7個"},
            {"(A)一份套餐賣160元", "(B)全班總共有32人", "(C)繩子大概長5公尺", "(D)這包水餃有50顆."},
            {"(A)62.8", "(B)52.8", "(C)72.8", "(D)42.8公分"},
            {"(A)16", "(B)20", "(C)24", "(D)30平方公尺"},
            {"(A)1：30000", "(B)1：50000", "(C)1：300000", "(D)1：500000"},
            {"(A)姐姐", "(B)妹妹", "(C)兩人都夠", "(D)兩人都不夠"},
            {"(A)227", "(B)247", "(C)327", "(D)219"},
            {"(A)2", "(B)3", "(C)4", "(D)5"},
            {"(A)10", "(B)15", "(C)20", "(D)25"},
            {"(A)7顆　", "(B)9顆　", "(C)14顆　", "(D)16顆"},
            {"(A)1000元　", "(B)1080元　", "(C)1120元　", "(D)1280元"},
            {"(A)20分鐘", "(B)2日", "(C)120秒鐘　", "(D)24小時"},
            {"(A)15.7", "(B)11.2", "(C)5.6", "(D)1.1"},
    };

    private String mCorrectAnswers[] = {
            "(C)270度",
            "(A)0.772",
            "(A)五分之一",
            "(A)四分之一",
            "(C)4.39",
            "(C)1000*1000",
            "(B)Y/5=35",
            "(B)70%off",
            "(D)12",
            "(D)4485",
            "(B)444",
            "(B)6/12",
            "(A)2/2/2/6",
            "(B)17",
            "(D)5張",
            "(A)被除數",
            "(C)53",
            "(B)35塊",
            "(D)6",
            "(A)4個",
            "(C)繩子大概長5公尺",
            "(A)62.8公分",
            "(B)20平方公尺",
            "(D)1：500000",
            "(C)兩人都夠",
            "(C)327",
            "(C)4",
            "(D)25",
            "(B)9顆",
            "(C)1120元　",
            "(D)24小時",
            "(B)11.2",
    };

    private String mtip[] = {
            "基礎提示：15分鐘是90度",
            "基礎提示：小數點除以越小的數越小",
            "基礎提示：1又5分之2=5分之7",
            "基礎提示：360除以90",
            "基礎提示：先乘除後加減",
            "基礎提示：1公里=1000平方公尺",
            "基礎提示：先算出有幾個麵包",
            "基礎提示：70%off-->打三折",
            "基礎提示：9*12=____",
            "基礎提示：總存款扣掉後來的錢",
            "基礎提示：打七折=乘0.7，打九折=乘0.9",
            "基礎提示：2加6次",
            "基礎提示：2加3次",
            "基礎提示：乘法先做",
            "基礎提示：大數字÷小數字",
            "基礎提示：偶數：0.2.4.6.8結尾；奇數：1.3.5.7.9結尾",
            "基礎提示：偶數：0.2.4.6.8結尾； ",
            "基礎提示：7的倍數",
            "基礎提示：6還能÷6",
            "基礎提示：平年的2月有28天",
            "基礎提示：不確定的值",
            "基礎提示：圓周率=3.14",
            "基礎提示：底：48 x ⅙ =8；高：30 x ⅙ =5",
            "基礎提示：35公里=35000公尺=3500000公分",
            "基礎提示：89>85",
            "基礎提示：12個十是120",
            "基礎提示：5*6=30",
            "基礎提示：正方形面積=邊長*邊長",
            "基礎提示：9*36=324",
            "基礎提示：960/6",
            "基礎提示：鐘面一圈12小時",
            "基礎提示：向左減，向右加",
    };

    private String mprompt[] = {
            "進階提示：90*3=＿＿",
            "進階提示：0.772比0.8小",
            "進階提示：一星期7天=7分之1",
            "進階提示：360/90度",
            "進階提示：2.6*1.4=3.64，3.64+0.75=4.39",
            "進階提示：1000*1000平方公尺",
            "進階提示：35*5=____=Y",
            "進階提示：打七折—>30%off",
            "進階提示：108/9=____",
            "進階提示：6850-2365=X",
            "進階提示：1500-945=______",
            "進階提示：2x6=12",
            "進階提示：2+2+2=6",
            "進階提示：4x3=12",
            "進階提示：45÷9=5",
            "進階提示：被除數÷除數=商…餘數",
            "進階提示：奇數：1.3.5.7.9結尾",
            "進階提示：35÷7=5…0",
            "進階提示：餘數不可能大於除數或等於除數",
            "進階提示：28÷7=？",
            "進階提示：找含有「大概」的選項",
            "進階提示：半徑x2=直徑 直徑x3.14=圓周長",
            "進階提示：面積：8x5÷2=20",
            "進階提示：3500000÷7=500000",
            "進階提示：95>89>85",
            "進階提示：200+120+7=327",
            "進階提示：50*600=30000",
            "進階提示：5*5=25",
            "進階提示：9*36=36*9",
            "進階提示：960/6=160160+960=1120",
            "進階提示：12*2=24",
            "進階提示：8.4-5+7.8=11.2",
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