package com.example.chemshaBongoapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "what is capital of Kenya ?",

           "Mombasa",
           "Kisumu",
           "Kampala",
           "Nairobi",
           4
       )
       var question2 = QuestionData(
           2,
           "Do Emobilis offer certificate after completing a course ?",

           "Yes",
           "Maybe",
           "No",
           "None of the above",
           1
       )
       var question3 = QuestionData(
           3,
           "What is the capital city of Africa ?",

           "Kenya",
           "South Africa",
           "Nairobi",
           "None of the above",
           4
       )
       var question4 = QuestionData(
           4,
           "Where is Emobilis located ?",

           "Eastleigh",
           "Embakasi",
           "Westlands",
           "Mikindani",
           3
       )

       var question5 = QuestionData(
           5,
           "Who is the president elect of Kenya ?",

           "Raila Amollo Odinga",
           "David Mwaure Waihiga",
           "George Luchiri Wajackoyah",
           "William Samoe Ruto",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}