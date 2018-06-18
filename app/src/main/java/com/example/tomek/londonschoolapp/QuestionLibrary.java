package com.example.tomek.londonschoolapp;


public class QuestionLibrary {

    private String mQuestions [] = {
            "Noga po angielsku to:",
            "Ziemniak po angielsku to:",
            "Makaron po angielsku to:",
            "Samochód po angielsku to:",
            "Rower po angielsku to:",
            "Palec po angieslku to:",
            "Szyja po angieslsku to:",
            "Kolacja po angieslsku to:",
            "Kolacja po angieslsku to:"



    };


    private String mChoices [][] = {
            {"body", "nose", "leg"},
            {"potatoes", "blackberry", "strawberry"},
            {"kidney", "pasta", "trachea"},
            {"milk", "water", "car"},
            {"ticket", "bike", "car"},
            {"mouth", "finger", "arm"},
            {"rice", "pasta", "neck"},
            {"beard", "supper", "hair"},
            {"beard", "supper", "hair"}
    };



    private String mCorrectAnswers[] = {"leg", "potatoes", "pasta", "car", "bike", "finger", "neck", "supper", "supper"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
