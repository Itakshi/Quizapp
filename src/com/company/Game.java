package com.company;

public class Game {

    Question[] questions = new Question[5];
    Player player = new Player();

    String[] questionsdata={"Who is the Strongest Avenger?","What is the Closet planet to sun?","Who is the Capital of Australia?"};
    String[] option1 ={"IronMan","Earth","Sydney"};
    String[] option2 ={"Thor","Venus","Melbern"};
    String[] option3 ={"Hulk","Mercury","Perth"};
    String[] option4 ={"Dr. Strange","Jupiter","Cerrbian"};
    int[] answers={2,3,2};

    public void intiGame()
    {
        //this loop created five objects
        for(int i=0;i<5;i++)
        {
            questions[i]=new Question();
        }

//        questions[0].question="Who is the Strongest Avenger?";
//        questions[0].option1="ironman";
//        questions[0].option2="Thor";
//        questions[0].option3="Hulk";
//        questions[0].option4="Dr. Strange";
//        questions[0].correctAnswer=2;
//
//        questions[1].question="Who is the Closet planet to earth?";
//        questions[1].option1=" Earth";
//        questions[1].option2="Venus";
//        questions[1].option3="Mercury";
//        questions[1].option4="Jupiter";
//        questions[1].correctAnswer=3;
//
//        questions[2].question="Who is the Capital of Australia?";
//        questions[2].option1=" Sydney";
//        questions[2].option2="Melbern";
//        questions[2].option3="Perth";
//        questions[2].option4="Canberra";
//        questions[2].correctAnswer=4;

        for(int i=0;i<3;i++)
        {
            questions[i].question=questionsdata[i];
        questions[i].option1=option1[i];
        questions[i].option2=option2[i];
        questions[i].option3=option3[i];
        questions[i].option4=option4[i];
        questions[i].correctAnswer=answers[i];
        }
   }

    public void play()
    {
       player.getDetails();
       for(int i=0;i<3;i++)
       {
          boolean status =  questions[i].askquestion();
          if(status==true)
          {
              System.out.println("Bhut umda khele hai aap");
              player.score +=5;
          }
          else
          {
              System.out.println("Maaf krna mai apke sahayata nae kr sakte");
              player.score =player.score-2;
          }
       }
       System.out.println(player.name+" your score is " + player.score);
    }

}
