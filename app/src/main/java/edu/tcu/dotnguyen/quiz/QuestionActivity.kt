package edu.tcu.dotnguyen.quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    private val questions = Constants.getQuestions().shuffled()
    private var questionIdx = 0
    private val optionTvs = mutableListOf<TextView>()
    private var answerRevealed = false
    private var selectedOptionIdx = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<ProgressBar>(R.id.progress_bar).max =questions.size
        findViewById<Button>(R.id.submit_btn)
        setQuestion()
    }

    private fun setQuestion() {
        selectedOptionIdx = -1
        answerRevealed = false
        val question = questions[questionIdx]
        findViewById<TextView>(R.id.question_tv).text = question.question
        // setup the flag image
        // Set up the progressbar progress
        setOptionTvs(question)

        // Change the submit button text
    }

    private fun setOptionTvs(question: Question) {
        // Remove all the options from the previous question
        // the linear layout

        // Clear the options from optionTvs

        val optionLl = findViewById<LinearLayout>(R.id.option_ll)
        for (option in question.options.shuffled()) {
            val optionTv = TextView(this)
            optionTv.setBackgroundResource(R.drawable.default_option_bg)
            optionTv.setOnClickListener(this)
            optionTvs.add(optionTv)
            //Convert 10dp to the corresponding px value

            // Deal with layoutParams

            // Setup the padding

            // Set the text color: black

            // Set the text gravity: center

            // Set the text size: 16F

            optionTv.text = option
            optionLl.addView(optionTv)
        }
    }

    private fun selectedOptionView(selectedOptionTv: TextView) {
        // Reset all option => set all to default background

        // set selectedOption to be selected look: change the background
    }

    private fun answerView(correctOptionTv: TextView) {

    }

    private fun goToResult() {
        // use intent to go to result page
    }

    override fun onClick(view: View?) {
        if (view == findViewById<Button>(R.id.submit_btn)) {
            if (!answerRevealed) {
                if (selectedOptionIdx == -1) {
                    // Make a toast
                } else {
                    // Move to phase 2: Call answerView()
                }
            } else {
                questionIdx++
                setQuestion() // Back to phase 1
                // or goToResult()
            }
        } else { // If an option is clicked
            for (optionTv in optionTvs) {
                if (view == optionTv) {
                    // Highlight selected option
                    selectedOptionView(optionTv)
                }
            }
        }
    }
}