package edu.tcu.dotnguyen.quiz

object Constants {

    fun getQuestions(): List<Question> {
        val questionList = mutableListOf<Question>()

        // Question 1
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                listOf("Argentina", "Australia", "Armenia", "Austria"),
                "Argentina"
            )
        )

        // Question 2
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                listOf("Angola", "Austria", "Australia", "Armenia"),
                "Australia"
            )
        )

        // Question 3
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                listOf("Belarus", "Belize", "Brunei", "Brazil", "Bahamas"),
                "Brazil"
            )
        )

        // Question 4
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                listOf("Bahamas", "Belgium", "Barbados", "Belize"),
                "Belgium"
            )
        )

        // Question 5
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_fiji,
                listOf("France", "Fiji", "Finland"),
                "Fiji"
            )
        )

        // Question 6
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_germany,
                listOf("Germany", "Georgia", "Greece", "Gabon"),
                "Germany"
            )
        )

        // Question 7
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark,
                listOf("Dominica", "Egypt", "Denmark", "Ethiopia", "Czech Republic"),
                "Denmark"
            )
        )

        // Question 8
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_india,
                listOf("Ireland", "Iran", "Hungary", "India"),
                "India"
            )
        )

        // Question 9
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand,
                listOf("Australia", "New Zealand", "Tuvalu", "United States of America"),
                "New Zealand"
            )
        )

        // Question 10
        questionList.add(
            Question(
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                listOf("Kuwait", "Jordan", "Sudan"),
                "Kuwait"
            )
        )

        return questionList.toList()
    }
}