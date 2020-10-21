package com.Beta.math_practice;

public class Qusetion_easy {
    public String mQuestions[] = {
            "7+8=?",
            "24-12=?",
            "9*9=?",
            "72/9=?",
            "11+18+1=?",
            "19-3-7=?",
            "3*7+2=?",
            "30/10-3=?",
            "8+11+6=?",
            "55-32=?",
            "7*4-5=?",
            "20/5=?",
            "8+8+5=?",
            "21-9=?",
            "4*8-3=?",
            "9/9+10=?",
            "15+16=?",
            "38-31-2=?",
            "5*1*2=?",
            "36/4=?",
            "7+7+5=?",
            "28-9=?",
            "1*2*3=?",
            "49/7-1=?",
            "9+4+6=?",
            "80-26=?",
            "2*4+8?",
            "24/6=?",
            "18+16=?",
            "16-2-11=?"
    };

    private String mChoices[][] = {
            {"(A)12", "(B)13", "(C)14", "(D)15"},
            {"(A)13", "(B)12", "(C)11", "(D)10"},
            {"(A)64", "(B)49", "(C)99", "(D)81"},
            {"(A)9", "(B)8", "(C)7", "(D)6"},
            {"(A)30", "(B)29", "(C)28", "(D)27"},
            {"(A)11", "(B)10", "(C)9", "(D)8"},
            {"(A)21", "(B)22", "(C)23", "(D)24"},
            {"(A)3", "(B)2", "(C)1", "(D)0"},
            {"(A)12", "(B)20", "(C)23", "(D)25"},
            {"(A)22", "(B)21", "(C)23", "(D)25"},
            {"(A)23", "(B)20", "(C)17", "(D)14"},
            {"(A)3", "(B)4", "(C)5", "(D)6"},
            {"(A)20", "(B)21", "(C)22", "(D)23"},
            {"(A)15", "(B)14", "(C)13", "(D)12"},
            {"(A)29", "(B)28", "(C)27", "(D)26"},
            {"(A)10", "(B)11", "(C)12", "(D)13"},
            {"(A)29", "(B)30", "(C)31", "(D)32"},
            {"(A)8", "(B)7", "(C)6", "(D)5"},
            {"(A)11", "(B)10", "(C)9", "D8"},
            {"(A)3", "(B)6", "(C)9", "(D)12"},
            {"(A)20", "(B)19", "(C)18", "(D)17"},
            {"(A)19", "(B)22", "(C)24", "(D)26"},
            {"(A)3", "(B)4", "(C)5", "(D)6"},
            {"(A)7", "(B)6", "(C)5", "(D)4"},
            {"(A)17", "(B)18", "(C)19", "(D)20"},
            {"(A)55", "(B)54", "(C)53", "(D)52"},
            {"(A)16", "(B)15", "(C)14", "(D)13"},
            {"(A)7", "(B)6", "(C)5", "(D)4"},
            {"(A)30", "(B)32", "(C)34", "(D)36"},
            {"(A)3", "(B)4", "(C)5", "(D)6"},
    };

    private String mCorrectAnswers[] = {
            "(D)15",
            "(B)12",
            "(D)81",
            "(B)8",
            "(A)30",
            "(C)9",
            "(D)24",
            "(D)0",
            "(D)25",
            "(C)23",
            "(A)23",
            "(B)4",
            "(B)21",
            "(D)12",
            "(A)29",
            "(B)11",
            "(C)31",
            "(D)5",
            "(B)10",
            "(C)9",
            "(B)19",
            "(A)19",
            "(D)6",
            "(B)6",
            "(C)19",
            "(B)54",
            "(A)16",
            "(D)4",
            "(C)34",
            "(A)3"
    };

    private String mtip[] = {
            "(D)15",
            "(B)12",
            "(D)81",
            "(B)8",
            "(A)30",
            "(C)9",
            "(D)24",
            "(D)0",
            "(D)25",
            "(C)23",
            "(A)23",
            "(B)4",
            "(B)21",
            "(D)12",
            "(A)29",
            "(B)11",
            "(C)31",
            "(D)5",
            "(B)10",
            "(C)9",
            "(B)19",
            "(A)19",
            "(D)6",
            "(B)6",
            "(C)19",
            "(B)54",
            "(A)16",
            "(D)4",
            "(C)34",
            "(A)3"
    };

    private String mprompt[] = {
            "(D)15",
            "(B)12",
            "(D)81",
            "(B)8",
            "(A)30",
            "(C)9",
            "(D)24",
            "(D)0",
            "(D)25",
            "(C)23",
            "(A)23",
            "(B)4",
            "(B)21",
            "(D)12",
            "(A)29",
            "(B)11",
            "(C)31",
            "(D)5",
            "(B)10",
            "(C)9",
            "(B)19",
            "(A)19",
            "(D)6",
            "(B)6",
            "(C)19",
            "(B)54",
            "(A)16",
            "(D)4",
            "(C)34",
            "(A)3"
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
