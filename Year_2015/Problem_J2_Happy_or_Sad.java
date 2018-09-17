package CCC_Competitions.Year_2015;

import java.util.Scanner;

public class Problem_J2_Happy_or_Sad {
    public static void main(String []args){
        Problem_J2_Happy_or_Sad emotion = new Problem_J2_Happy_or_Sad();
        System.out.println(emotion.findEmotion(emotion.getEmotion()));
    }
    public String findEmotion(String emotionStatement){
        int happyFaces = 0;
        int sadFaces = 0;
        String emojiEmotion;
        for(int i= 0; i<=(emotionStatement.length()-3); i++){
            if(emotionStatement.substring(i, i+3).equals(":-)")){
                happyFaces += 1;
            }else if(emotionStatement.substring(i, i+3).equals(":-(")){
                sadFaces += 1;
            }
        }
        if (sadFaces == happyFaces && happyFaces != 0 && sadFaces != 0){
            emojiEmotion = "Unsure";
        }else if(sadFaces < happyFaces){
            emojiEmotion = "Happy";
        }else if(sadFaces > happyFaces){
            emojiEmotion = "Sad";
        }else{
            emojiEmotion = "None";
        }
        return emojiEmotion;
    }
    public String getEmotion(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
