package app.adventure.com.adventure_kotlin2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var country = arrayOf("Korea", "USA")
    var city_kor = arrayOf("Seoul", "Busan")
    var city_usa = arrayOf("NY", "LA")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var content = """Great beer service starts with fundamentals: beer clean glassware, a proper pour, and beer that hasn’t been ruined by improper handling. And in today’s beer world, every dialog between server and guest begins with talk of beer styles and flavors. The Cicerone Certified Beer Server exam assesses these skills to recognize those individuals who are prepared to serve today’s wide range of beers.
                            Prerequisites: None

                            Exam Cost: Initial test: ${'$'}69 (USD), Retakes: ${'$'}69 (USD). Exam fees are non-refundable.

                            Purchasing Options: US CBS Exam, International CBS Exam, or you may also purchase BeerSavvy®, our interactive eLearning program, which includes the exam.

                            Passing Score: A grade of 75% is required to pass.

                            Exam Details
                            The Certified Beer Server exam is a 60-question multiple choice exam, administered online. A grade of 75% is required to pass. Candidates must also pass a short quiz about the Cicerone program. Each payment allows two attempts to achieve a passing score. This is a closed book exam. Candidates are not allowed to refer to any notes, reference materials or accept assistance or advice from anyone else while taking the exam."""
                .trimIndent()

        txt_content.setText(content)
    }
}
